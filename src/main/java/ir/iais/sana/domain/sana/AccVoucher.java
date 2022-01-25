
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accVoucher complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="accVoucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="articleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atfNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attachmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankacccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chapternum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chequeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chequeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code_Noe_shakhs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdReciporgcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdorgcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdsource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debtor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedAcccode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedAcccode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedAcccode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedAcccode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedAcccode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divanGnrlAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divanLedgerAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dolati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dore_etebar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dore_maliyat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="draftdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="draftnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiscalYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="gnrlAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kasri_abvabjamee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ledgerAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="madde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mahiyat_seporde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manba_daryaft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mojavez_khas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moshakhasat_etebar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mozoo_bedehi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mozoo_tadilat_sanavati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mozoo_tazmin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n_oragh_bahadar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n_s_daryaft_dolat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_bime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_daryaft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_etebar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_mahal_etebar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_sarmayegozari" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_sayer_manbae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_tarh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_tazmin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pardakht_gh_ghate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plancode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="progcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seconder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sh_m_mozayede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tabaghe_daraei_sabet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tabaghe_mojodiha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tabaghebandi_h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vaziat_motalebat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="voucherRowNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cOSTCENTERCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iNCOMECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rOWCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accVoucher", propOrder = {
        "articleDesc",
        "atfNum",
        "attachmentNum",
        "bankacccode",
        "chapternum",
        "chequeDate",
        "chequeNum",
        "cocode",
        "codeNoeShakhs",
        "contractNum",
        "contractTitle",
        "crdReciporgcode",
        "crdorgcode",
        "crdsource",
        "creditor",
        "debtor",
        "detailedAcccode1",
        "detailedAcccode2",
        "detailedAcccode3",
        "detailedAcccode4",
        "detailedAcccode5",
        "divanGnrlAccCode",
        "divanLedgerAccCode",
        "dolati",
        "doreEtebar",
        "doreMaliyat",
        "draftdate",
        "draftnum",
        "fiscalYear",
        "gnrlAccCode",
        "inclusion",
        "kasriAbvabjamee",
        "ledgerAccCode",
        "madde",
        "mahiyatSeporde",
        "manbaDaryaft",
        "mojavezKhas",
        "moshakhasatEtebar",
        "mozooBedehi",
        "mozooTadilatSanavati",
        "mozooTazmin",
        "nOraghBahadar",
        "nsDaryaftDolat",
        "nationalid",
        "noeBime",
        "noeDaryaft",
        "noeEtebar",
        "noeMahalEtebar",
        "noeSarmayegozari",
        "noeSayerManbae",
        "noeTarh",
        "noeTazmin",
        "pardakhtGhGhate",
        "plancode",
        "progcode",
        "projectcode",
        "recipientName",
        "seconder",
        "shMMozayede",
        "tabagheDaraeiSabet",
        "tabagheMojodiha",
        "tabaghebandiH",
        "vaziatMotalebat",
        "voucherDate",
        "voucherDesc",
        "voucherNum",
        "voucherRowNum",
        "voucherStatus",
        "voucherType",
        "costcenterCode",
        "incomecode",
        "rowcode"
})
public class AccVoucher
        extends Data {

    protected String articleDesc;
    protected String atfNum;
    protected String attachmentNum;
    protected String bankacccode;
    protected String chapternum;
    protected String chequeDate;
    protected String chequeNum;
    protected String cocode;
    @XmlElement(name = "code_Noe_shakhs")
    protected String codeNoeShakhs;
    protected String contractNum;
    protected String contractTitle;
    protected String crdReciporgcode;
    protected String crdorgcode;
    protected String crdsource;
    protected String creditor;
    protected String debtor;
    protected String detailedAcccode1;
    protected String detailedAcccode2;
    protected String detailedAcccode3;
    protected String detailedAcccode4;
    protected String detailedAcccode5;
    protected String divanGnrlAccCode;
    protected String divanLedgerAccCode;
    protected String dolati;
    @XmlElement(name = "dore_etebar")
    protected String doreEtebar;
    @XmlElement(name = "dore_maliyat")
    protected String doreMaliyat;
    protected String draftdate;
    protected String draftnum;
    protected Integer fiscalYear;
    protected String gnrlAccCode;
    protected String inclusion;
    @XmlElement(name = "kasri_abvabjamee")
    protected String kasriAbvabjamee;
    protected String ledgerAccCode;
    protected String madde;
    @XmlElement(name = "mahiyat_seporde")
    protected String mahiyatSeporde;
    @XmlElement(name = "manba_daryaft")
    protected String manbaDaryaft;
    @XmlElement(name = "mojavez_khas")
    protected String mojavezKhas;
    @XmlElement(name = "moshakhasat_etebar")
    protected String moshakhasatEtebar;
    @XmlElement(name = "mozoo_bedehi")
    protected String mozooBedehi;
    @XmlElement(name = "mozoo_tadilat_sanavati")
    protected String mozooTadilatSanavati;
    @XmlElement(name = "mozoo_tazmin")
    protected String mozooTazmin;
    @XmlElement(name = "n_oragh_bahadar")
    protected String nOraghBahadar;
    @XmlElement(name = "n_s_daryaft_dolat")
    protected String nsDaryaftDolat;
    protected String nationalid;
    @XmlElement(name = "noe_bime")
    protected String noeBime;
    @XmlElement(name = "noe_daryaft")
    protected String noeDaryaft;
    @XmlElement(name = "noe_etebar")
    protected String noeEtebar;
    @XmlElement(name = "noe_mahal_etebar")
    protected String noeMahalEtebar;
    @XmlElement(name = "noe_sarmayegozari")
    protected String noeSarmayegozari;
    @XmlElement(name = "noe_sayer_manbae")
    protected String noeSayerManbae;
    @XmlElement(name = "noe_tarh")
    protected String noeTarh;
    @XmlElement(name = "noe_tazmin")
    protected String noeTazmin;
    @XmlElement(name = "pardakht_gh_ghate")
    protected String pardakhtGhGhate;
    protected String plancode;
    protected String progcode;
    protected String projectcode;
    protected String recipientName;
    protected String seconder;
    @XmlElement(name = "sh_m_mozayede")
    protected String shMMozayede;
    @XmlElement(name = "tabaghe_daraei_sabet")
    protected String tabagheDaraeiSabet;
    @XmlElement(name = "tabaghe_mojodiha")
    protected String tabagheMojodiha;
    @XmlElement(name = "tabaghebandi_h")
    protected String tabaghebandiH;
    @XmlElement(name = "vaziat_motalebat")
    protected String vaziatMotalebat;
    protected String voucherDate;
    protected String voucherDesc;
    protected Integer voucherNum;
    protected String voucherRowNum;
    protected String voucherStatus;
    protected String voucherType;
    @XmlElement(name = "cOSTCENTERCode")
    protected String costcenterCode;
    @XmlElement(name = "iNCOMECODE")
    protected String incomecode;
    @XmlElement(name = "rOWCODE")
    protected String rowcode;

    public String getArticleDesc() {
        return articleDesc;
    }

    @SetterPoiColumn("ArticleDesc")
    public void setArticleDesc(String value) {
        this.articleDesc = value;
    }

    public String getAtfNum() {
        return atfNum;
    }

    @SetterPoiColumn("AtfNum")
    public void setAtfNum(String value) {
        this.atfNum = value;
    }

    public String getAttachmentNum() {
        return attachmentNum;
    }

    @SetterPoiColumn("AttachmentNum")
    public void setAttachmentNum(String value) {
        this.attachmentNum = value;
    }

    public String getBankacccode() {
        return bankacccode;
    }

    @SetterPoiColumn("bankacccode")
    public void setBankacccode(String value) {
        this.bankacccode = value;
    }

    public String getChapternum() {
        return chapternum;
    }

    @SetterPoiColumn("chapternum")
    public void setCOSTCENTERCode(String value) {
        this.costcenterCode = value;
    }

    public String getChequeDate() {
        return chequeDate;
    }

    @SetterPoiColumn("chequeDate")
    public void setChapternum(String value) {
        this.chapternum = value;
    }

    public String getChequeNum() {
        return chequeNum;
    }

    @SetterPoiColumn("chequeNum")
    public void setChequeDate(String value) {
        this.chequeDate = value;
    }

    public String getCocode() {
        return cocode;
    }

    @SetterPoiColumn("Cocode")
    public void setChequeNum(String value) {
        this.chequeNum = value;
    }

    public String getCodeNoeShakhs() {
        return codeNoeShakhs;
    }

    @SetterPoiColumn("code_Noe_shakhs")
    public void setCocode(String value) {
        this.cocode = value;
    }

    public String getContractNum() {
        return contractNum;
    }

    @SetterPoiColumn("contractNum")
    public void setCodeNoeShakhs(String value) {
        this.codeNoeShakhs = value;
    }

    public String getContractTitle() {
        return contractTitle;
    }

    @SetterPoiColumn("contractTitle")
    public void setContractNum(String value) {
        this.contractNum = value;
    }

    public String getCrdReciporgcode() {
        return crdReciporgcode;
    }

    @SetterPoiColumn("COSTCENTERCode")
    public void setContractTitle(String value) {
        this.contractTitle = value;
    }

    public String getCrdorgcode() {
        return crdorgcode;
    }

    @SetterPoiColumn("crdorgcode")
    public void setCrdReciporgcode(String value) {
        this.crdReciporgcode = value;
    }

    public String getCrdsource() {
        return crdsource;
    }

    @SetterPoiColumn("crdReciporgcode")
    public void setCrdorgcode(String value) {
        this.crdorgcode = value;
    }

    public String getCreditor() {
        return creditor;
    }

    @SetterPoiColumn("Crdsource")
    public void setCrdsource(String value) {
        this.crdsource = value;
    }

    public String getDebtor() {
        return debtor;
    }

    @SetterPoiColumn("Creditor")
    public void setCreditor(String value) {
        this.creditor = value;
    }

    public String getDetailedAcccode1() {
        return detailedAcccode1;
    }

    @SetterPoiColumn("Debtor")
    public void setDebtor(String value) {
        this.debtor = value;
    }

    public String getDetailedAcccode2() {
        return detailedAcccode2;
    }

    @SetterPoiColumn("detailedAcccode1")
    public void setDetailedAcccode1(String value) {
        this.detailedAcccode1 = value;
    }

    public String getDetailedAcccode3() {
        return detailedAcccode3;
    }

    @SetterPoiColumn("detailedAcccode2")
    public void setDetailedAcccode2(String value) {
        this.detailedAcccode2 = value;
    }

    public String getDetailedAcccode4() {
        return detailedAcccode4;
    }

    @SetterPoiColumn("detailedAcccode3")
    public void setDetailedAcccode3(String value) {
        this.detailedAcccode3 = value;
    }

    public String getDetailedAcccode5() {
        return detailedAcccode5;
    }

    @SetterPoiColumn("detailedAcccode4")
    public void setDetailedAcccode4(String value) {
        this.detailedAcccode4 = value;
    }

    public String getDivanGnrlAccCode() {
        return divanGnrlAccCode;
    }

    @SetterPoiColumn("detailedAcccode5")
    public void setDetailedAcccode5(String value) {
        this.detailedAcccode5 = value;
    }

    public String getDivanLedgerAccCode() {
        return divanLedgerAccCode;
    }

    @SetterPoiColumn("DivanGnrlAccCode")
    public void setDivanGnrlAccCode(String value) {
        this.divanGnrlAccCode = value;
    }

    public String getDolati() {
        return dolati;
    }

    @SetterPoiColumn("DivanLedgerAccCode")
    public void setDivanLedgerAccCode(String value) {
        this.divanLedgerAccCode = value;
    }

    public String getDoreEtebar() {
        return doreEtebar;
    }

    @SetterPoiColumn("dolati")
    public void setDolati(String value) {
        this.dolati = value;
    }

    public String getDoreMaliyat() {
        return doreMaliyat;
    }

    @SetterPoiColumn("Dore_etebar")
    public void setDoreEtebar(String value) {
        this.doreEtebar = value;
    }

    public String getDraftdate() {
        return draftdate;
    }

    @SetterPoiColumn("Dore_maliyat")
    public void setDoreMaliyat(String value) {
        this.doreMaliyat = value;
    }

    public String getDraftnum() {
        return draftnum;
    }

    @SetterPoiColumn("draftdate")
    public void setDraftdate(String value) {
        this.draftdate = value;
    }

    public Integer getFiscalYear() {
        return fiscalYear;
    }

    @SetterPoiColumn("draftnum")
    public void setDraftnum(String value) {
        this.draftnum = value;
    }

    public String getGnrlAccCode() {
        return gnrlAccCode;
    }

    @SetterPoiColumn("FiscalYear")
    public void setFiscalYear(Integer value) {
        this.fiscalYear = value;
    }

    public String getInclusion() {
        return inclusion;
    }

    @SetterPoiColumn("GnrlAccCode")
    public void setGnrlAccCode(String value) {
        this.gnrlAccCode = value;
    }

    public String getKasriAbvabjamee() {
        return kasriAbvabjamee;
    }

    @SetterPoiColumn("inclusion")
    public void setINCOMECODE(String value) {
        this.incomecode = value;
    }

    public String getLedgerAccCode() {
        return ledgerAccCode;
    }

    @SetterPoiColumn("INCOMECODE")
    public void setInclusion(String value) {
        this.inclusion = value;
    }

    public String getMadde() {
        return madde;
    }

    @SetterPoiColumn("kasri_abvabjamee")
    public void setKasriAbvabjamee(String value) {
        this.kasriAbvabjamee = value;
    }

    public String getMahiyatSeporde() {
        return mahiyatSeporde;
    }

    @SetterPoiColumn("LedgerAccCode")
    public void setLedgerAccCode(String value) {
        this.ledgerAccCode = value;
    }

    public String getManbaDaryaft() {
        return manbaDaryaft;
    }

    @SetterPoiColumn("madde")
    public void setMadde(String value) {
        this.madde = value;
    }

    public String getMojavezKhas() {
        return mojavezKhas;
    }

    @SetterPoiColumn("mahiyat_seporde")
    public void setMahiyatSeporde(String value) {
        this.mahiyatSeporde = value;
    }

    public String getMoshakhasatEtebar() {
        return moshakhasatEtebar;
    }

    @SetterPoiColumn("manba_daryaft")
    public void setManbaDaryaft(String value) {
        this.manbaDaryaft = value;
    }

    public String getMozooBedehi() {
        return mozooBedehi;
    }

    @SetterPoiColumn("mojavez_khas")
    public void setMojavezKhas(String value) {
        this.mojavezKhas = value;
    }

    public String getMozooTadilatSanavati() {
        return mozooTadilatSanavati;
    }

    @SetterPoiColumn("Moshakhasat_etebar")
    public void setMoshakhasatEtebar(String value) {
        this.moshakhasatEtebar = value;
    }

    public String getMozooTazmin() {
        return mozooTazmin;
    }

    @SetterPoiColumn("mozoo_bedehi")
    public void setMozooBedehi(String value) {
        this.mozooBedehi = value;
    }

    public String getNOraghBahadar() {
        return nOraghBahadar;
    }

    @SetterPoiColumn("mozoo_tadilat_sanavati")
    public void setMozooTadilatSanavati(String value) {
        this.mozooTadilatSanavati = value;
    }

    public String getNSDaryaftDolat() {
        return nsDaryaftDolat;
    }

    @SetterPoiColumn("mozoo_tazmin")
    public void setMozooTazmin(String value) {
        this.mozooTazmin = value;
    }

    public String getNationalid() {
        return nationalid;
    }

    @SetterPoiColumn("N_oragh_bahadar")
    public void setNOraghBahadar(String value) {
        this.nOraghBahadar = value;
    }

    public String getNoeBime() {
        return noeBime;
    }

    @SetterPoiColumn("N_s_daryaft_dolat")
    public void setNSDaryaftDolat(String value) {
        this.nsDaryaftDolat = value;
    }

    public String getNoeDaryaft() {
        return noeDaryaft;
    }

    @SetterPoiColumn("nationalid")
    public void setNationalid(String value) {
        this.nationalid = value;
    }

    public String getNoeEtebar() {
        return noeEtebar;
    }

    @SetterPoiColumn("noe_bime")
    public void setNoeBime(String value) {
        this.noeBime = value;
    }

    public String getNoeMahalEtebar() {
        return noeMahalEtebar;
    }

    @SetterPoiColumn("Noe_daryaft")
    public void setNoeDaryaft(String value) {
        this.noeDaryaft = value;
    }

    public String getNoeSarmayegozari() {
        return noeSarmayegozari;
    }

    @SetterPoiColumn("noe_etebar")
    public void setNoeEtebar(String value) {
        this.noeEtebar = value;
    }

    public String getNoeSayerManbae() {
        return noeSayerManbae;
    }

    @SetterPoiColumn("noe_mahal_etebar")
    public void setNoeMahalEtebar(String value) {
        this.noeMahalEtebar = value;
    }

    public String getNoeTarh() {
        return noeTarh;
    }

    @SetterPoiColumn("noe_sarmayegozari")
    public void setNoeSarmayegozari(String value) {
        this.noeSarmayegozari = value;
    }

    public String getNoeTazmin() {
        return noeTazmin;
    }

    @SetterPoiColumn("Noe_sayer_manbae")
    public void setNoeSayerManbae(String value) {
        this.noeSayerManbae = value;
    }

    public String getPardakhtGhGhate() {
        return pardakhtGhGhate;
    }

    @SetterPoiColumn("Noe_tarh")
    public void setNoeTarh(String value) {
        this.noeTarh = value;
    }

    public String getPlancode() {
        return plancode;
    }

    @SetterPoiColumn("noe_tazmin")
    public void setNoeTazmin(String value) {
        this.noeTazmin = value;
    }

    public String getProgcode() {
        return progcode;
    }

    @SetterPoiColumn("pardakht_gh_ghate")
    public void setPardakhtGhGhate(String value) {
        this.pardakhtGhGhate = value;
    }

    public String getProjectcode() {
        return projectcode;
    }

    @SetterPoiColumn("plancode")
    public void setPlancode(String value) {
        this.plancode = value;
    }

    public String getRecipientName() {
        return recipientName;
    }

    @SetterPoiColumn("progcode")
    public void setProgcode(String value) {
        this.progcode = value;
    }

    public String getSeconder() {
        return seconder;
    }

    @SetterPoiColumn("projectcode")
    public void setProjectcode(String value) {
        this.projectcode = value;
    }

    public String getShMMozayede() {
        return shMMozayede;
    }

    @SetterPoiColumn("recipientName")
    public void setROWCODE(String value) {
        this.rowcode = value;
    }

    public String getTabagheDaraeiSabet() {
        return tabagheDaraeiSabet;
    }

    @SetterPoiColumn("ROWCODE")
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    public String getTabagheMojodiha() {
        return tabagheMojodiha;
    }

    @SetterPoiColumn("Seconder")
    public void setSeconder(String value) {
        this.seconder = value;
    }

    public String getTabaghebandiH() {
        return tabaghebandiH;
    }

    @SetterPoiColumn("sh_m_mozayede")
    public void setShMMozayede(String value) {
        this.shMMozayede = value;
    }

    public String getVaziatMotalebat() {
        return vaziatMotalebat;
    }

    @SetterPoiColumn("tabaghe_daraei_sabet")
    public void setTabagheDaraeiSabet(String value) {
        this.tabagheDaraeiSabet = value;
    }

    public String getVoucherDate() {
        return voucherDate;
    }

    @SetterPoiColumn("tabaghe_mojodiha")
    public void setTabagheMojodiha(String value) {
        this.tabagheMojodiha = value;
    }

    public String getVoucherDesc() {
        return voucherDesc;
    }

    @SetterPoiColumn("tabaghebandi_h")
    public void setTabaghebandiH(String value) {
        this.tabaghebandiH = value;
    }

    public Integer getVoucherNum() {
        return voucherNum;
    }

    @SetterPoiColumn("Vaziat_motalebat")
    public void setVaziatMotalebat(String value) {
        this.vaziatMotalebat = value;
    }

    public String getVoucherRowNum() {
        return voucherRowNum;
    }

    @SetterPoiColumn("VoucherDate")
    public void setVoucherDate(String value) {
        this.voucherDate = value;
    }

    public String getVoucherStatus() {
        return voucherStatus;
    }

    @SetterPoiColumn("VoucherDesc")
    public void setVoucherDesc(String value) {
        this.voucherDesc = value;
    }

    public String getVoucherType() {
        return voucherType;
    }

    @SetterPoiColumn("VoucherNum")
    public void setVoucherNum(Integer value) {
        this.voucherNum = value;
    }

    public String getCOSTCENTERCode() {
        return costcenterCode;
    }

    @SetterPoiColumn("voucherRowNum")
    public void setVoucherRowNum(String value) {
        this.voucherRowNum = value;
    }

    public String getINCOMECODE() {
        return incomecode;
    }

    @SetterPoiColumn("voucherStatus")
    public void setVoucherStatus(String value) {
        this.voucherStatus = value;
    }

    public String getROWCODE() {
        return rowcode;
    }

    @SetterPoiColumn("voucherType")
    public void setVoucherType(String value) {
        this.voucherType = value;
    }

}
