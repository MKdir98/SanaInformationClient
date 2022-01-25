
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankbranchNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noe_hesab_banki" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shaba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shobe_bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAccount", propOrder = {
    "bankAccCode",
    "bankAccNum",
    "bankName",
    "bankbranchNum",
    "noeHesabBanki",
    "shaba",
    "shobeBank"
})
public class BankAccount
    extends Data
{

    protected String bankAccCode;
    protected String bankAccNum;
    protected String bankName;
    protected String bankbranchNum;
    @XmlElement(name = "noe_hesab_banki")
    protected Integer noeHesabBanki;
    protected String shaba;
    @XmlElement(name = "shobe_bank")
    protected String shobeBank;

    public String getBankAccCode() {
        return bankAccCode;
    }

    @SetterPoiColumn("BankAccCode")
    public void setBankAccCode(String value) {
        this.bankAccCode = value;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    @SetterPoiColumn("bankAccNum")
    public void setBankAccNum(String value) {
        this.bankAccNum = value;
    }

    public String getBankName() {
        return bankName;
    }

    @SetterPoiColumn("BankName")
    public void setBankName(String value) {
        this.bankName = value;
    }

    public String getBankbranchNum() {
        return bankbranchNum;
    }

    @SetterPoiColumn("bankbranchNum")
    public void setBankbranchNum(String value) {
        this.bankbranchNum = value;
    }

    public Integer getNoeHesabBanki() {
        return noeHesabBanki;
    }

    @SetterPoiColumn("Noe_hesab_banki")
    public void setNoeHesabBanki(Integer value) {
        this.noeHesabBanki = value;
    }

    public String getShaba() {
        return shaba;
    }

    @SetterPoiColumn("shaba")
    public void setShaba(String value) {
        this.shaba = value;
    }

    public String getShobeBank() {
        return shobeBank;
    }

    @SetterPoiColumn("shobe_bank")
    public void setShobeBank(String value) {
        this.shobeBank = value;
    }

}
