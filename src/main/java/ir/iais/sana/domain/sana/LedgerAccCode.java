
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ledgerAccCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ledgerAccCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="divanLedgerAcccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gnrlAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ledgerAccTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ledgerAcccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ledgerAccCode", propOrder = {
    "divanLedgerAcccode",
    "gnrlAccCode",
    "ledgerAccTitle",
    "ledgerAcccode"
})
public class LedgerAccCode
    extends Data
{

    protected String divanLedgerAcccode;
    protected String gnrlAccCode;
    protected String ledgerAccTitle;
    protected String ledgerAcccode;

    /**
     * Gets the value of the divanLedgerAcccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivanLedgerAcccode() {
        return divanLedgerAcccode;
    }

    /**
     * Sets the value of the divanLedgerAcccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("DivanLedgerAcccode")
    public void setDivanLedgerAcccode(String value) {
        this.divanLedgerAcccode = value;
    }

    /**
     * Gets the value of the gnrlAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGnrlAccCode() {
        return gnrlAccCode;
    }

    /**
     * Sets the value of the gnrlAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("GnrlAccCode")
    public void setGnrlAccCode(String value) {
        this.gnrlAccCode = value;
    }

    /**
     * Gets the value of the ledgerAccTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerAccTitle() {
        return ledgerAccTitle;
    }

    /**
     * Sets the value of the ledgerAccTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("LedgerAccTitle")
    public void setLedgerAccTitle(String value) {
        this.ledgerAccTitle = value;
    }

    /**
     * Gets the value of the ledgerAcccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerAcccode() {
        return ledgerAcccode;
    }

    /**
     * Sets the value of the ledgerAcccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("LedgerAcccode")
    public void setLedgerAcccode(String value) {
        this.ledgerAcccode = value;
    }

}
