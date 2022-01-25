package ir.iais.sana.controller;

import ir.iais.sana.constant.StringConstants;
import ir.iais.sana.domain.PortConfig;
import ir.iais.sana.domain.sana.*;
import ir.iais.sana.exception.CellTypeNotSupportException;
import ir.iais.sana.exception.DomainException;
import ir.iais.sana.services.*;
import ir.iais.sana.ui.UiComponent;
import ir.iais.sana.util.DataSender;
import ir.iais.sana.util.PoiObjectUtil;
import ir.iais.sana.util.SanaUtil;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class SanaDataController {

    private static final Logger logger = LogManager.getLogger(SanaDataController.class);
    private static SanaDataController sanaDataControllerInstance;

    private SanaDataController() {
    }

    public static SanaDataController getInstance() {
        if (sanaDataControllerInstance == null) {
            sanaDataControllerInstance = new SanaDataController();
        }
        return sanaDataControllerInstance;
    }

    public Thread createThreadForCallingService(File dataFile, PortConfig portConfig, ProgressBar progressBar,
                                                Label label, Button button, int packetSize, Long sanaId) {
        return new Thread(() -> {
            try (Workbook workbook = WorkbookFactory.create(dataFile)) {
                ProtocolId protocolId = PoiObjectUtil.getProtocol(workbook.getSheet("Protocol_ID")).get(0);
                PushSanaV5 pushSanaPort = SanaCoreServiceCaller.getInstance().getPushSanaPort(portConfig);
                Long finalSanaId = sanaId;
                if (finalSanaId == null) {
                    finalSanaId = getSanaId(progressBar, label, protocolId, pushSanaPort);
                }
                SanaInfo sanaInfo = getSanaInfo(progressBar, label, workbook, finalSanaId);
                sendSanaData(progressBar, label, packetSize, pushSanaPort, finalSanaId, sanaInfo);
                finishSendingData(progressBar, button, pushSanaPort, finalSanaId);
            } catch (Exception e) {
                UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, e.getMessage(), Alert.AlertType.ERROR);
                logger.error(e, e);
                UiComponent.getInstance().setButtonEnable(button);
            }
        });
    }

    public Thread cancelSanaRequest(PortConfig portConfig, Button button, Long sanaId) {
        return new Thread(() -> {
            try {
                PushSanaV5 pushSanaPort = SanaCoreServiceCaller.getInstance().getPushSanaPort(portConfig);
                pushSanaPort.cancelRequest(sanaId);
                UiComponent.getInstance().showAlert(StringConstants.SUCCESS_IN_SENDING_INFORMATION, "", Alert.AlertType.INFORMATION);
            } catch (Exception e) {
                UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, e.getMessage(), Alert.AlertType.ERROR);
                logger.error(e, e);
                UiComponent.getInstance().setButtonEnable(button);
            }
        });
    }

    private void finishSendingData(ProgressBar progressBar, Button button, PushSanaV5 pushSanaPort, long sanaId) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
        pushSanaPort.finishRequest(sanaId);
        UiComponent.getInstance().setProgressbarValue(progressBar, 1);
        UiComponent.getInstance().showAlert(StringConstants.SUCCESS_IN_SENDING_INFORMATION, "ارسال اطلاعات سنا با موفقیت انجام شد." + sanaId, Alert.AlertType.INFORMATION);
        UiComponent.getInstance().setButtonEnable(button);
    }

    private void sendSanaData(ProgressBar progressBar, Label label, int packetSize, PushSanaV5 pushSanaPort, long sanaId, SanaInfo sanaInfo) {
        new DataSender<AccVoucher>(pushSanaPort, sanaInfo.getAccVoucherList(), packetSize, sanaId, progressBar,
                label, 0.05, "AccVoucher") {
            @Override
            protected long sendData(List<AccVoucher> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendAccVouchers(data, sanaId);
            }
        };
        new DataSender<AccGroupsCode>(pushSanaPort, sanaInfo.getAccGroupsCodeList(), packetSize, sanaId, progressBar,
                label, 0.15, "AccGroupsCode") {
            @Override
            protected long sendData(List<AccGroupsCode> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendAccGroupsCodeList(data, sanaId);
            }
        };
        new DataSender<GeneralAccCode>(pushSanaPort, sanaInfo.getGeneralAccCodeList(), packetSize, sanaId, progressBar,
                label, 0.20, "GeneralAccCode") {
            @Override
            protected long sendData(List<GeneralAccCode> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendGeneralAccCodes(data, sanaId);
            }
        };
        new DataSender<LedgerAccCode>(pushSanaPort, sanaInfo.getLedgerAccCodeList(), packetSize, sanaId, progressBar,
                label, 0.25, "LedgerAccCode") {
            @Override
            protected long sendData(List<LedgerAccCode> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendLedgerAccCodes(data, sanaId);
            }
        };
        new DataSender<DetailedAccCode1>(pushSanaPort, sanaInfo.getDetailedAccCode1List(), packetSize, sanaId, progressBar,
                label, 0.30, "DetailedAccCode1") {
            @Override
            protected long sendData(List<DetailedAccCode1> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendDetailedAccCode1S(data, sanaId);
            }
        };
        new DataSender<DetailedAccCode2>(pushSanaPort, sanaInfo.getDetailedAccCode2List(), packetSize, sanaId, progressBar,
                label, 0.35, "DetailedAccCode2") {
            @Override
            protected long sendData(List<DetailedAccCode2> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendDetailedAccCode2S(data, sanaId);
            }
        };
        new DataSender<DetailedAccCode3>(pushSanaPort, sanaInfo.getDetailedAccCode3List(), packetSize, sanaId, progressBar,
                label, 0.40, "DetailedAccCode3") {
            @Override
            protected long sendData(List<DetailedAccCode3> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendDetailedAccCode3S(data, sanaId);
            }
        };
        new DataSender<DetailedAccCode4>(pushSanaPort, sanaInfo.getDetailedAccCode4List(), packetSize, sanaId, progressBar,
                label, 0.45, "DetailedAccCode4") {
            @Override
            protected long sendData(List<DetailedAccCode4> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendDetailedAccCode4S(data, sanaId);
            }
        };
        new DataSender<DetailedAccCode5>(pushSanaPort, sanaInfo.getDetailedAccCode5List(), packetSize, sanaId, progressBar,
                label, 0.50, "DetailedAccCode5") {
            @Override
            protected long sendData(List<DetailedAccCode5> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendDetailedAccCode5S(data, sanaId);
            }
        };
        new DataSender<CostCenter>(pushSanaPort, sanaInfo.getCostCenterList(), packetSize, sanaId, progressBar,
                label, 0.55, "CostCenter") {
            @Override
            protected long sendData(List<CostCenter> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendCostCenters(data, sanaId);
            }
        };
        new DataSender<Organization>(pushSanaPort, sanaInfo.getOrganizationList(), packetSize, sanaId, progressBar,
                label, 0.60, "Organization") {
            @Override
            protected long sendData(List<Organization> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendOrganizations(data, sanaId);
            }
        };
        new DataSender<Program>(pushSanaPort, sanaInfo.getProgramList(), packetSize, sanaId, progressBar,
                label, 0.65, "Program") {
            @Override
            protected long sendData(List<Program> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendPrograms(data, sanaId);
            }
        };
        new DataSender<Plan>(pushSanaPort, sanaInfo.getPlanList(), packetSize, sanaId, progressBar,
                label, 0.70, "Plan") {
            @Override
            protected long sendData(List<Plan> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendPlans(data, sanaId);
            }
        };
        new DataSender<Project>(pushSanaPort, sanaInfo.getProjectList(), packetSize, sanaId, progressBar,
                label, 0.75, "Project") {
            @Override
            protected long sendData(List<Project> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendProjects(data, sanaId);
            }
        };
        new DataSender<Income>(pushSanaPort, sanaInfo.getIncomeList(), packetSize, sanaId, progressBar,
                label, 0.80, "Income") {
            @Override
            protected long sendData(List<Income> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendIncomes(data, sanaId);
            }
        };
        new DataSender<BankAccount>(pushSanaPort, sanaInfo.getBankAccountList(), packetSize, sanaId, progressBar,
                label, 0.85, "BankAccount") {
            @Override
            protected long sendData(List<BankAccount> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendBankAccounts(data, sanaId);
            }
        };
        new DataSender<AccountFlow>(pushSanaPort, sanaInfo.getAccountFlowList(), packetSize, sanaId, progressBar,
                label, 0.90, "AccountFlow") {
            @Override
            protected long sendData(List<AccountFlow> data, Long sanaId, PushSanaV5 pushSanaPort) throws InternalServerException_Exception, DataNotFoundException_Exception, RequestNotOpenException_Exception, AccessException_Exception {
                return pushSanaPort.sendAccountFlows(data, sanaId);
            }
        };
    }

    private long getSanaId(ProgressBar progressBar, Label label, ProtocolId protocolId, PushSanaV5 pushSanaPort) throws OpenSanaInfoExistException_Exception, InternalServerException_Exception, MisMatchNationalCodeException_Exception {
        UiComponent.getInstance().setProgressbarValue(progressBar, 0);
        UiComponent.getInstance().setLabelValue(label, "در حال دریافت شماره درخواست");
        return pushSanaPort.reserveSanaInfo(protocolId);
    }

    private SanaInfo getSanaInfo(ProgressBar progressBar, Label label, Workbook workbook, long sanaId) throws CellTypeNotSupportException, DomainException, InvocationTargetException, InstantiationException, IllegalAccessException {
        UiComponent.getInstance().setProgressbarValue(progressBar, 0.03);
        UiComponent.getInstance().setLabelValue(label, "در حال پردازش فایل");
        return SanaUtil.getInstance().convertSanaExcelToSanaSanaDataObject(sanaId, workbook);
    }
}
