
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedAccCode2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailedAccCode2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailedAccCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "detailedAccCode2", propOrder = {
    "detailedAccCode2",
    "detailedAccTitle",
    "ledgerAcccode"
})
public class DetailedAccCode2
    extends Data
{

    protected String detailedAccCode2;
    protected String detailedAccTitle;
    protected String ledgerAcccode;

    /**
     * Gets the value of the detailedAccCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedAccCode2() {
        return detailedAccCode2;
    }

    /**
     * Sets the value of the detailedAccCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("DetailedAccCode2")
    public void setDetailedAccCode2(String value) {
        this.detailedAccCode2 = value;
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
