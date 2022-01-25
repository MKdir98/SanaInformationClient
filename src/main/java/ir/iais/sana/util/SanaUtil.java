package ir.iais.sana.util;

import ir.iais.sana.domain.sana.*;
import ir.iais.sana.exception.CellTypeNotSupportException;
import ir.iais.sana.exception.DomainException;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.reflect.InvocationTargetException;

public class SanaUtil {

    private static SanaUtil sanaUtilInstance;


    private SanaUtil() {
    }

    public static SanaUtil getInstance() {
        if (sanaUtilInstance == null) {
            sanaUtilInstance = new SanaUtil();
        }
        return sanaUtilInstance;
    }

    public SanaInfo convertSanaExcelToSanaSanaDataObject(Long sanaId, Workbook workbook) throws CellTypeNotSupportException, DomainException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SanaInfo sanaInfo = new SanaInfo();
        sanaInfo.setAccVoucherList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("AccVoucher"), AccVoucher.class));
        sanaInfo.setAccGroupsCodeList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("AccGroupsCode"), AccGroupsCode.class));
        sanaInfo.setGeneralAccCodeList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("GeneralACCCode"), GeneralAccCode.class));
        sanaInfo.setLedgerAccCodeList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("LedgerAccCode"), LedgerAccCode.class));
        sanaInfo.setDetailedAccCode1List(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("DetailedAccCode1"), DetailedAccCode1.class));
        sanaInfo.setDetailedAccCode2List(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("DetailedAccCode2"), DetailedAccCode2.class));
        sanaInfo.setDetailedAccCode3List(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("DetailedAccCode3"), DetailedAccCode3.class));
        sanaInfo.setDetailedAccCode4List(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("DetailedAccCode4"), DetailedAccCode4.class));
        sanaInfo.setDetailedAccCode5List(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("DetailedAccCode5"), DetailedAccCode5.class));
        sanaInfo.setCostCenterList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("CostCenter"), CostCenter.class));
        sanaInfo.setOrganizationList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("Organization"), Organization.class));
        sanaInfo.setProgramList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("Program_"), Program.class));
        sanaInfo.setPlanList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("Plan"), Plan.class));
        sanaInfo.setProjectList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("Project_"), Project.class));
        sanaInfo.setIncomeList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("Income"), Income.class));
        sanaInfo.setBankAccountList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("BankAccount"), BankAccount.class));
        sanaInfo.setAccountFlowList(PoiObjectUtil.getSanaDataFromSheet(sanaId, workbook.getSheet("AccountFlow"), AccountFlow.class));
        return sanaInfo;
    }
}
