
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalAccCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalAccCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="divanGnrlAccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gnrlAccTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gnrlaccCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalAccCode", propOrder = {
    "divanGnrlAccCode",
    "gnrlAccTitle",
    "gnrlaccCode"
})
public class GeneralAccCode
    extends Data
{

    protected String divanGnrlAccCode;
    protected String gnrlAccTitle;
    protected String gnrlaccCode;

    /**
     * Gets the value of the divanGnrlAccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivanGnrlAccCode() {
        return divanGnrlAccCode;
    }

    /**
     * Sets the value of the divanGnrlAccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("DivanGnrlAccCode")
    public void setDivanGnrlAccCode(String value) {
        this.divanGnrlAccCode = value;
    }

    /**
     * Gets the value of the gnrlAccTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGnrlAccTitle() {
        return gnrlAccTitle;
    }

    /**
     * Sets the value of the gnrlAccTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("GnrlAccTitle")
    public void setGnrlAccTitle(String value) {
        this.gnrlAccTitle = value;
    }

    /**
     * Gets the value of the gnrlaccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGnrlaccCode() {
        return gnrlaccCode;
    }

    /**
     * Sets the value of the gnrlaccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("GnrlaccCode")
    public void setGnrlaccCode(String value) {
        this.gnrlaccCode = value;
    }

}
