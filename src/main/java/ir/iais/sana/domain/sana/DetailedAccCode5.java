
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedAccCode5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailedAccCode5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailedAccCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedAccTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "detailedAccCode5", propOrder = {
    "detailedAccCode5",
    "detailedAccTitle",
    "ledgerAcccode"
})
public class DetailedAccCode5
    extends Data
{

    protected String detailedAccCode5;
    protected String detailedAccTitle;
    protected String ledgerAcccode;

    /**
     * Gets the value of the detailedAccCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedAccCode5() {
        return detailedAccCode5;
    }

    /**
     * Sets the value of the detailedAccCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("DetailedAccCode5")
    public void setDetailedAccCode5(String value) {
        this.detailedAccCode5 = value;
    }

    /**
     * Gets the value of the detailedAccTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedAccTitle() {
        return detailedAccTitle;
    }

    /**
     * Sets the value of the detailedAccTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("DetailedAccTitle")
    public void setDetailedAccTitle(String value) {
        this.detailedAccTitle = value;
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
