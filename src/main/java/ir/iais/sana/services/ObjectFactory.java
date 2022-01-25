
package ir.iais.sana.services;

import ir.iais.sana.domain.sana.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ir.iais.sana.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelRequest_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "cancelRequest");
    private final static QName _CancelRequestResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "cancelRequestResponse");
    private final static QName _FinishRequest_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "finishRequest");
    private final static QName _FinishRequestResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "finishRequestResponse");
    private final static QName _GetRequestsStatus_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "getRequestsStatus");
    private final static QName _GetRequestsStatusResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "getRequestsStatusResponse");
    private final static QName _ReserveSanaInfo_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "reserveSanaInfo");
    private final static QName _ReserveSanaInfoResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "reserveSanaInfoResponse");
    private final static QName _SendAccGroupsCodeList_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendAccGroupsCodeList");
    private final static QName _SendAccGroupsCodeListResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendAccGroupsCodeListResponse");
    private final static QName _SendAccVouchers_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendAccVouchers");
    private final static QName _SendAccVouchersResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendAccVouchersResponse");
    private final static QName _SendAccountFlows_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendAccountFlows");
    private final static QName _SendAccountFlowsResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendAccountFlowsResponse");
    private final static QName _SendBankAccounts_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendBankAccounts");
    private final static QName _SendBankAccountsResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendBankAccountsResponse");
    private final static QName _SendCostCenters_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendCostCenters");
    private final static QName _SendCostCentersResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendCostCentersResponse");
    private final static QName _SendDetailedAccCode1S_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode1s");
    private final static QName _SendDetailedAccCode1SResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode1sResponse");
    private final static QName _SendDetailedAccCode2S_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode2s");
    private final static QName _SendDetailedAccCode2SResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode2sResponse");
    private final static QName _SendDetailedAccCode3S_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode3s");
    private final static QName _SendDetailedAccCode3SResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode3sResponse");
    private final static QName _SendDetailedAccCode4S_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode4s");
    private final static QName _SendDetailedAccCode4SResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode4sResponse");
    private final static QName _SendDetailedAccCode5S_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode5s");
    private final static QName _SendDetailedAccCode5SResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendDetailedAccCode5sResponse");
    private final static QName _SendGeneralAccCodes_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendGeneralAccCodes");
    private final static QName _SendGeneralAccCodesResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendGeneralAccCodesResponse");
    private final static QName _SendIncomes_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendIncomes");
    private final static QName _SendIncomesResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendIncomesResponse");
    private final static QName _SendLedgerAccCodes_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendLedgerAccCodes");
    private final static QName _SendLedgerAccCodesResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendLedgerAccCodesResponse");
    private final static QName _SendOrganizations_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendOrganizations");
    private final static QName _SendOrganizationsResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendOrganizationsResponse");
    private final static QName _SendPlans_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendPlans");
    private final static QName _SendPlansResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendPlansResponse");
    private final static QName _SendPrograms_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendPrograms");
    private final static QName _SendProgramsResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendProgramsResponse");
    private final static QName _SendProjects_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendProjects");
    private final static QName _SendProjectsResponse_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "sendProjectsResponse");
    private final static QName _InternalServerException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "InternalServerException");
    private final static QName _DataNotFoundException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "DataNotFoundException");
    private final static QName _RequestNotOpenException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "RequestNotOpenException");
    private final static QName _AccessException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "AccessException");
    private final static QName _OpenSanaInfoExistException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "OpenSanaInfoExistException");
    private final static QName _MisMatchNationalCodeException_QNAME = new QName("http://servicebus.sana.ir/PushSana/v5/", "MisMatchNationalCodeException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ir.iais.sana.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelRequest }
     * 
     */
    public CancelRequest createCancelRequest() {
        return new CancelRequest();
    }

    /**
     * Create an instance of {@link CancelRequestResponse }
     * 
     */
    public CancelRequestResponse createCancelRequestResponse() {
        return new CancelRequestResponse();
    }

    /**
     * Create an instance of {@link FinishRequest }
     * 
     */
    public FinishRequest createFinishRequest() {
        return new FinishRequest();
    }

    /**
     * Create an instance of {@link FinishRequestResponse }
     * 
     */
    public FinishRequestResponse createFinishRequestResponse() {
        return new FinishRequestResponse();
    }

    /**
     * Create an instance of {@link GetRequestsStatus }
     * 
     */
    public GetRequestsStatus createGetRequestsStatus() {
        return new GetRequestsStatus();
    }

    /**
     * Create an instance of {@link GetRequestsStatusResponse }
     * 
     */
    public GetRequestsStatusResponse createGetRequestsStatusResponse() {
        return new GetRequestsStatusResponse();
    }

    /**
     * Create an instance of {@link ReserveSanaInfo }
     * 
     */
    public ReserveSanaInfo createReserveSanaInfo() {
        return new ReserveSanaInfo();
    }

    /**
     * Create an instance of {@link ReserveSanaInfoResponse }
     * 
     */
    public ReserveSanaInfoResponse createReserveSanaInfoResponse() {
        return new ReserveSanaInfoResponse();
    }

    /**
     * Create an instance of {@link SendAccGroupsCodeList }
     * 
     */
    public SendAccGroupsCodeList createSendAccGroupsCodeList() {
        return new SendAccGroupsCodeList();
    }

    /**
     * Create an instance of {@link SendAccGroupsCodeListResponse }
     * 
     */
    public SendAccGroupsCodeListResponse createSendAccGroupsCodeListResponse() {
        return new SendAccGroupsCodeListResponse();
    }

    /**
     * Create an instance of {@link SendAccVouchers }
     * 
     */
    public SendAccVouchers createSendAccVouchers() {
        return new SendAccVouchers();
    }

    /**
     * Create an instance of {@link SendAccVouchersResponse }
     * 
     */
    public SendAccVouchersResponse createSendAccVouchersResponse() {
        return new SendAccVouchersResponse();
    }

    /**
     * Create an instance of {@link SendAccountFlows }
     * 
     */
    public SendAccountFlows createSendAccountFlows() {
        return new SendAccountFlows();
    }

    /**
     * Create an instance of {@link SendAccountFlowsResponse }
     * 
     */
    public SendAccountFlowsResponse createSendAccountFlowsResponse() {
        return new SendAccountFlowsResponse();
    }

    /**
     * Create an instance of {@link SendBankAccounts }
     * 
     */
    public SendBankAccounts createSendBankAccounts() {
        return new SendBankAccounts();
    }

    /**
     * Create an instance of {@link SendBankAccountsResponse }
     * 
     */
    public SendBankAccountsResponse createSendBankAccountsResponse() {
        return new SendBankAccountsResponse();
    }

    /**
     * Create an instance of {@link SendCostCenters }
     * 
     */
    public SendCostCenters createSendCostCenters() {
        return new SendCostCenters();
    }

    /**
     * Create an instance of {@link SendCostCentersResponse }
     * 
     */
    public SendCostCentersResponse createSendCostCentersResponse() {
        return new SendCostCentersResponse();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode1S }
     * 
     */
    public SendDetailedAccCode1S createSendDetailedAccCode1S() {
        return new SendDetailedAccCode1S();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode1SResponse }
     * 
     */
    public SendDetailedAccCode1SResponse createSendDetailedAccCode1SResponse() {
        return new SendDetailedAccCode1SResponse();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode2S }
     * 
     */
    public SendDetailedAccCode2S createSendDetailedAccCode2S() {
        return new SendDetailedAccCode2S();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode2SResponse }
     * 
     */
    public SendDetailedAccCode2SResponse createSendDetailedAccCode2SResponse() {
        return new SendDetailedAccCode2SResponse();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode3S }
     * 
     */
    public SendDetailedAccCode3S createSendDetailedAccCode3S() {
        return new SendDetailedAccCode3S();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode3SResponse }
     * 
     */
    public SendDetailedAccCode3SResponse createSendDetailedAccCode3SResponse() {
        return new SendDetailedAccCode3SResponse();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode4S }
     * 
     */
    public SendDetailedAccCode4S createSendDetailedAccCode4S() {
        return new SendDetailedAccCode4S();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode4SResponse }
     * 
     */
    public SendDetailedAccCode4SResponse createSendDetailedAccCode4SResponse() {
        return new SendDetailedAccCode4SResponse();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode5S }
     * 
     */
    public SendDetailedAccCode5S createSendDetailedAccCode5S() {
        return new SendDetailedAccCode5S();
    }

    /**
     * Create an instance of {@link SendDetailedAccCode5SResponse }
     * 
     */
    public SendDetailedAccCode5SResponse createSendDetailedAccCode5SResponse() {
        return new SendDetailedAccCode5SResponse();
    }

    /**
     * Create an instance of {@link SendGeneralAccCodes }
     * 
     */
    public SendGeneralAccCodes createSendGeneralAccCodes() {
        return new SendGeneralAccCodes();
    }

    /**
     * Create an instance of {@link SendGeneralAccCodesResponse }
     * 
     */
    public SendGeneralAccCodesResponse createSendGeneralAccCodesResponse() {
        return new SendGeneralAccCodesResponse();
    }

    /**
     * Create an instance of {@link SendIncomes }
     * 
     */
    public SendIncomes createSendIncomes() {
        return new SendIncomes();
    }

    /**
     * Create an instance of {@link SendIncomesResponse }
     * 
     */
    public SendIncomesResponse createSendIncomesResponse() {
        return new SendIncomesResponse();
    }

    /**
     * Create an instance of {@link SendLedgerAccCodes }
     * 
     */
    public SendLedgerAccCodes createSendLedgerAccCodes() {
        return new SendLedgerAccCodes();
    }

    /**
     * Create an instance of {@link SendLedgerAccCodesResponse }
     * 
     */
    public SendLedgerAccCodesResponse createSendLedgerAccCodesResponse() {
        return new SendLedgerAccCodesResponse();
    }

    /**
     * Create an instance of {@link SendOrganizations }
     * 
     */
    public SendOrganizations createSendOrganizations() {
        return new SendOrganizations();
    }

    /**
     * Create an instance of {@link SendOrganizationsResponse }
     * 
     */
    public SendOrganizationsResponse createSendOrganizationsResponse() {
        return new SendOrganizationsResponse();
    }

    /**
     * Create an instance of {@link SendPlans }
     * 
     */
    public SendPlans createSendPlans() {
        return new SendPlans();
    }

    /**
     * Create an instance of {@link SendPlansResponse }
     * 
     */
    public SendPlansResponse createSendPlansResponse() {
        return new SendPlansResponse();
    }

    /**
     * Create an instance of {@link SendPrograms }
     * 
     */
    public SendPrograms createSendPrograms() {
        return new SendPrograms();
    }

    /**
     * Create an instance of {@link SendProgramsResponse }
     * 
     */
    public SendProgramsResponse createSendProgramsResponse() {
        return new SendProgramsResponse();
    }

    /**
     * Create an instance of {@link SendProjects }
     * 
     */
    public SendProjects createSendProjects() {
        return new SendProjects();
    }

    /**
     * Create an instance of {@link SendProjectsResponse }
     * 
     */
    public SendProjectsResponse createSendProjectsResponse() {
        return new SendProjectsResponse();
    }

    /**
     * Create an instance of {@link InternalServerException }
     * 
     */
    public InternalServerException createInternalServerException() {
        return new InternalServerException();
    }

    /**
     * Create an instance of {@link DataNotFoundException }
     * 
     */
    public DataNotFoundException createDataNotFoundException() {
        return new DataNotFoundException();
    }

    /**
     * Create an instance of {@link RequestNotOpenException }
     * 
     */
    public RequestNotOpenException createRequestNotOpenException() {
        return new RequestNotOpenException();
    }

    /**
     * Create an instance of {@link AccessException }
     * 
     */
    public AccessException createAccessException() {
        return new AccessException();
    }

    /**
     * Create an instance of {@link OpenSanaInfoExistException }
     * 
     */
    public OpenSanaInfoExistException createOpenSanaInfoExistException() {
        return new OpenSanaInfoExistException();
    }

    /**
     * Create an instance of {@link MisMatchNationalCodeException }
     * 
     */
    public MisMatchNationalCodeException createMisMatchNationalCodeException() {
        return new MisMatchNationalCodeException();
    }

    /**
     * Create an instance of {@link Income }
     * 
     */
    public Income createIncome() {
        return new Income();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Program }
     * 
     */
    public Program createProgram() {
        return new Program();
    }

    /**
     * Create an instance of {@link SanaRequestStatus }
     * 
     */
    public SanaRequestStatus createSanaRequestStatus() {
        return new SanaRequestStatus();
    }

    /**
     * Create an instance of {@link AccGroupsCode }
     * 
     */
    public AccGroupsCode createAccGroupsCode() {
        return new AccGroupsCode();
    }

    /**
     * Create an instance of {@link CostCenter }
     * 
     */
    public CostCenter createCostCenter() {
        return new CostCenter();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link GeneralAccCode }
     * 
     */
    public GeneralAccCode createGeneralAccCode() {
        return new GeneralAccCode();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link DetailedAccCode1 }
     * 
     */
    public DetailedAccCode1 createDetailedAccCode1() {
        return new DetailedAccCode1();
    }

    /**
     * Create an instance of {@link Plan }
     * 
     */
    public Plan createPlan() {
        return new Plan();
    }

    /**
     * Create an instance of {@link ProtocolId }
     * 
     */
    public ProtocolId createProtocolId() {
        return new ProtocolId();
    }

    /**
     * Create an instance of {@link DetailedAccCode2 }
     * 
     */
    public DetailedAccCode2 createDetailedAccCode2() {
        return new DetailedAccCode2();
    }

    /**
     * Create an instance of {@link DetailedAccCode3 }
     * 
     */
    public DetailedAccCode3 createDetailedAccCode3() {
        return new DetailedAccCode3();
    }

    /**
     * Create an instance of {@link DetailedAccCode4 }
     * 
     */
    public DetailedAccCode4 createDetailedAccCode4() {
        return new DetailedAccCode4();
    }

    /**
     * Create an instance of {@link DetailedAccCode5 }
     * 
     */
    public DetailedAccCode5 createDetailedAccCode5() {
        return new DetailedAccCode5();
    }

    /**
     * Create an instance of {@link AccountFlow }
     * 
     */
    public AccountFlow createAccountFlow() {
        return new AccountFlow();
    }

    /**
     * Create an instance of {@link LedgerAccCode }
     * 
     */
    public LedgerAccCode createLedgerAccCode() {
        return new LedgerAccCode();
    }

    /**
     * Create an instance of {@link AccVoucher }
     * 
     */
    public AccVoucher createAccVoucher() {
        return new AccVoucher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "cancelRequest")
    public JAXBElement<CancelRequest> createCancelRequest(CancelRequest value) {
        return new JAXBElement<CancelRequest>(_CancelRequest_QNAME, CancelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRequestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelRequestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "cancelRequestResponse")
    public JAXBElement<CancelRequestResponse> createCancelRequestResponse(CancelRequestResponse value) {
        return new JAXBElement<CancelRequestResponse>(_CancelRequestResponse_QNAME, CancelRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinishRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "finishRequest")
    public JAXBElement<FinishRequest> createFinishRequest(FinishRequest value) {
        return new JAXBElement<FinishRequest>(_FinishRequest_QNAME, FinishRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishRequestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinishRequestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "finishRequestResponse")
    public JAXBElement<FinishRequestResponse> createFinishRequestResponse(FinishRequestResponse value) {
        return new JAXBElement<FinishRequestResponse>(_FinishRequestResponse_QNAME, FinishRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRequestsStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "getRequestsStatus")
    public JAXBElement<GetRequestsStatus> createGetRequestsStatus(GetRequestsStatus value) {
        return new JAXBElement<GetRequestsStatus>(_GetRequestsStatus_QNAME, GetRequestsStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRequestsStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "getRequestsStatusResponse")
    public JAXBElement<GetRequestsStatusResponse> createGetRequestsStatusResponse(GetRequestsStatusResponse value) {
        return new JAXBElement<GetRequestsStatusResponse>(_GetRequestsStatusResponse_QNAME, GetRequestsStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSanaInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserveSanaInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "reserveSanaInfo")
    public JAXBElement<ReserveSanaInfo> createReserveSanaInfo(ReserveSanaInfo value) {
        return new JAXBElement<ReserveSanaInfo>(_ReserveSanaInfo_QNAME, ReserveSanaInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSanaInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReserveSanaInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "reserveSanaInfoResponse")
    public JAXBElement<ReserveSanaInfoResponse> createReserveSanaInfoResponse(ReserveSanaInfoResponse value) {
        return new JAXBElement<ReserveSanaInfoResponse>(_ReserveSanaInfoResponse_QNAME, ReserveSanaInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAccGroupsCodeList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAccGroupsCodeList }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendAccGroupsCodeList")
    public JAXBElement<SendAccGroupsCodeList> createSendAccGroupsCodeList(SendAccGroupsCodeList value) {
        return new JAXBElement<SendAccGroupsCodeList>(_SendAccGroupsCodeList_QNAME, SendAccGroupsCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAccGroupsCodeListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAccGroupsCodeListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendAccGroupsCodeListResponse")
    public JAXBElement<SendAccGroupsCodeListResponse> createSendAccGroupsCodeListResponse(SendAccGroupsCodeListResponse value) {
        return new JAXBElement<SendAccGroupsCodeListResponse>(_SendAccGroupsCodeListResponse_QNAME, SendAccGroupsCodeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAccVouchers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAccVouchers }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendAccVouchers")
    public JAXBElement<SendAccVouchers> createSendAccVouchers(SendAccVouchers value) {
        return new JAXBElement<SendAccVouchers>(_SendAccVouchers_QNAME, SendAccVouchers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAccVouchersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAccVouchersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendAccVouchersResponse")
    public JAXBElement<SendAccVouchersResponse> createSendAccVouchersResponse(SendAccVouchersResponse value) {
        return new JAXBElement<SendAccVouchersResponse>(_SendAccVouchersResponse_QNAME, SendAccVouchersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAccountFlows }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAccountFlows }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendAccountFlows")
    public JAXBElement<SendAccountFlows> createSendAccountFlows(SendAccountFlows value) {
        return new JAXBElement<SendAccountFlows>(_SendAccountFlows_QNAME, SendAccountFlows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAccountFlowsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAccountFlowsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendAccountFlowsResponse")
    public JAXBElement<SendAccountFlowsResponse> createSendAccountFlowsResponse(SendAccountFlowsResponse value) {
        return new JAXBElement<SendAccountFlowsResponse>(_SendAccountFlowsResponse_QNAME, SendAccountFlowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendBankAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendBankAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendBankAccounts")
    public JAXBElement<SendBankAccounts> createSendBankAccounts(SendBankAccounts value) {
        return new JAXBElement<SendBankAccounts>(_SendBankAccounts_QNAME, SendBankAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendBankAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendBankAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendBankAccountsResponse")
    public JAXBElement<SendBankAccountsResponse> createSendBankAccountsResponse(SendBankAccountsResponse value) {
        return new JAXBElement<SendBankAccountsResponse>(_SendBankAccountsResponse_QNAME, SendBankAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCostCenters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCostCenters }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendCostCenters")
    public JAXBElement<SendCostCenters> createSendCostCenters(SendCostCenters value) {
        return new JAXBElement<SendCostCenters>(_SendCostCenters_QNAME, SendCostCenters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCostCentersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCostCentersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendCostCentersResponse")
    public JAXBElement<SendCostCentersResponse> createSendCostCentersResponse(SendCostCentersResponse value) {
        return new JAXBElement<SendCostCentersResponse>(_SendCostCentersResponse_QNAME, SendCostCentersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode1S }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode1S }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode1s")
    public JAXBElement<SendDetailedAccCode1S> createSendDetailedAccCode1S(SendDetailedAccCode1S value) {
        return new JAXBElement<SendDetailedAccCode1S>(_SendDetailedAccCode1S_QNAME, SendDetailedAccCode1S.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode1SResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode1SResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode1sResponse")
    public JAXBElement<SendDetailedAccCode1SResponse> createSendDetailedAccCode1SResponse(SendDetailedAccCode1SResponse value) {
        return new JAXBElement<SendDetailedAccCode1SResponse>(_SendDetailedAccCode1SResponse_QNAME, SendDetailedAccCode1SResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode2S }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode2S }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode2s")
    public JAXBElement<SendDetailedAccCode2S> createSendDetailedAccCode2S(SendDetailedAccCode2S value) {
        return new JAXBElement<SendDetailedAccCode2S>(_SendDetailedAccCode2S_QNAME, SendDetailedAccCode2S.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode2SResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode2SResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode2sResponse")
    public JAXBElement<SendDetailedAccCode2SResponse> createSendDetailedAccCode2SResponse(SendDetailedAccCode2SResponse value) {
        return new JAXBElement<SendDetailedAccCode2SResponse>(_SendDetailedAccCode2SResponse_QNAME, SendDetailedAccCode2SResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode3S }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode3S }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode3s")
    public JAXBElement<SendDetailedAccCode3S> createSendDetailedAccCode3S(SendDetailedAccCode3S value) {
        return new JAXBElement<SendDetailedAccCode3S>(_SendDetailedAccCode3S_QNAME, SendDetailedAccCode3S.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode3SResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode3SResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode3sResponse")
    public JAXBElement<SendDetailedAccCode3SResponse> createSendDetailedAccCode3SResponse(SendDetailedAccCode3SResponse value) {
        return new JAXBElement<SendDetailedAccCode3SResponse>(_SendDetailedAccCode3SResponse_QNAME, SendDetailedAccCode3SResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode4S }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode4S }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode4s")
    public JAXBElement<SendDetailedAccCode4S> createSendDetailedAccCode4S(SendDetailedAccCode4S value) {
        return new JAXBElement<SendDetailedAccCode4S>(_SendDetailedAccCode4S_QNAME, SendDetailedAccCode4S.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode4SResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode4SResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode4sResponse")
    public JAXBElement<SendDetailedAccCode4SResponse> createSendDetailedAccCode4SResponse(SendDetailedAccCode4SResponse value) {
        return new JAXBElement<SendDetailedAccCode4SResponse>(_SendDetailedAccCode4SResponse_QNAME, SendDetailedAccCode4SResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode5S }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode5S }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode5s")
    public JAXBElement<SendDetailedAccCode5S> createSendDetailedAccCode5S(SendDetailedAccCode5S value) {
        return new JAXBElement<SendDetailedAccCode5S>(_SendDetailedAccCode5S_QNAME, SendDetailedAccCode5S.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode5SResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDetailedAccCode5SResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendDetailedAccCode5sResponse")
    public JAXBElement<SendDetailedAccCode5SResponse> createSendDetailedAccCode5SResponse(SendDetailedAccCode5SResponse value) {
        return new JAXBElement<SendDetailedAccCode5SResponse>(_SendDetailedAccCode5SResponse_QNAME, SendDetailedAccCode5SResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendGeneralAccCodes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendGeneralAccCodes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendGeneralAccCodes")
    public JAXBElement<SendGeneralAccCodes> createSendGeneralAccCodes(SendGeneralAccCodes value) {
        return new JAXBElement<SendGeneralAccCodes>(_SendGeneralAccCodes_QNAME, SendGeneralAccCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendGeneralAccCodesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendGeneralAccCodesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendGeneralAccCodesResponse")
    public JAXBElement<SendGeneralAccCodesResponse> createSendGeneralAccCodesResponse(SendGeneralAccCodesResponse value) {
        return new JAXBElement<SendGeneralAccCodesResponse>(_SendGeneralAccCodesResponse_QNAME, SendGeneralAccCodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIncomes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendIncomes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendIncomes")
    public JAXBElement<SendIncomes> createSendIncomes(SendIncomes value) {
        return new JAXBElement<SendIncomes>(_SendIncomes_QNAME, SendIncomes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendIncomesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendIncomesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendIncomesResponse")
    public JAXBElement<SendIncomesResponse> createSendIncomesResponse(SendIncomesResponse value) {
        return new JAXBElement<SendIncomesResponse>(_SendIncomesResponse_QNAME, SendIncomesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendLedgerAccCodes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendLedgerAccCodes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendLedgerAccCodes")
    public JAXBElement<SendLedgerAccCodes> createSendLedgerAccCodes(SendLedgerAccCodes value) {
        return new JAXBElement<SendLedgerAccCodes>(_SendLedgerAccCodes_QNAME, SendLedgerAccCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendLedgerAccCodesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendLedgerAccCodesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendLedgerAccCodesResponse")
    public JAXBElement<SendLedgerAccCodesResponse> createSendLedgerAccCodesResponse(SendLedgerAccCodesResponse value) {
        return new JAXBElement<SendLedgerAccCodesResponse>(_SendLedgerAccCodesResponse_QNAME, SendLedgerAccCodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrganizations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendOrganizations }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendOrganizations")
    public JAXBElement<SendOrganizations> createSendOrganizations(SendOrganizations value) {
        return new JAXBElement<SendOrganizations>(_SendOrganizations_QNAME, SendOrganizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOrganizationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendOrganizationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendOrganizationsResponse")
    public JAXBElement<SendOrganizationsResponse> createSendOrganizationsResponse(SendOrganizationsResponse value) {
        return new JAXBElement<SendOrganizationsResponse>(_SendOrganizationsResponse_QNAME, SendOrganizationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPlans }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPlans }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendPlans")
    public JAXBElement<SendPlans> createSendPlans(SendPlans value) {
        return new JAXBElement<SendPlans>(_SendPlans_QNAME, SendPlans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPlansResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPlansResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendPlansResponse")
    public JAXBElement<SendPlansResponse> createSendPlansResponse(SendPlansResponse value) {
        return new JAXBElement<SendPlansResponse>(_SendPlansResponse_QNAME, SendPlansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPrograms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPrograms }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendPrograms")
    public JAXBElement<SendPrograms> createSendPrograms(SendPrograms value) {
        return new JAXBElement<SendPrograms>(_SendPrograms_QNAME, SendPrograms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendProgramsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendProgramsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendProgramsResponse")
    public JAXBElement<SendProgramsResponse> createSendProgramsResponse(SendProgramsResponse value) {
        return new JAXBElement<SendProgramsResponse>(_SendProgramsResponse_QNAME, SendProgramsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendProjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendProjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendProjects")
    public JAXBElement<SendProjects> createSendProjects(SendProjects value) {
        return new JAXBElement<SendProjects>(_SendProjects_QNAME, SendProjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendProjectsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendProjectsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "sendProjectsResponse")
    public JAXBElement<SendProjectsResponse> createSendProjectsResponse(SendProjectsResponse value) {
        return new JAXBElement<SendProjectsResponse>(_SendProjectsResponse_QNAME, SendProjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServerException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InternalServerException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "InternalServerException")
    public JAXBElement<InternalServerException> createInternalServerException(InternalServerException value) {
        return new JAXBElement<InternalServerException>(_InternalServerException_QNAME, InternalServerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "DataNotFoundException")
    public JAXBElement<DataNotFoundException> createDataNotFoundException(DataNotFoundException value) {
        return new JAXBElement<DataNotFoundException>(_DataNotFoundException_QNAME, DataNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestNotOpenException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestNotOpenException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "RequestNotOpenException")
    public JAXBElement<RequestNotOpenException> createRequestNotOpenException(RequestNotOpenException value) {
        return new JAXBElement<RequestNotOpenException>(_RequestNotOpenException_QNAME, RequestNotOpenException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "AccessException")
    public JAXBElement<AccessException> createAccessException(AccessException value) {
        return new JAXBElement<AccessException>(_AccessException_QNAME, AccessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenSanaInfoExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenSanaInfoExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "OpenSanaInfoExistException")
    public JAXBElement<OpenSanaInfoExistException> createOpenSanaInfoExistException(OpenSanaInfoExistException value) {
        return new JAXBElement<OpenSanaInfoExistException>(_OpenSanaInfoExistException_QNAME, OpenSanaInfoExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MisMatchNationalCodeException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MisMatchNationalCodeException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicebus.sana.ir/PushSana/v5/", name = "MisMatchNationalCodeException")
    public JAXBElement<MisMatchNationalCodeException> createMisMatchNationalCodeException(MisMatchNationalCodeException value) {
        return new JAXBElement<MisMatchNationalCodeException>(_MisMatchNationalCodeException_QNAME, MisMatchNationalCodeException.class, null, value);
    }

}
