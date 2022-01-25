
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for costCenter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="costCenter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="costcenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costcenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costcenterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "costCenter", propOrder = {
    "costcenterCode",
    "costcenterName",
    "costcenterType",
    "description"
})
public class CostCenter
    extends Data
{

    protected String costcenterCode;
    protected String costcenterName;
    protected String costcenterType;
    protected String description;

    /**
     * Gets the value of the costcenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcenterCode() {
        return costcenterCode;
    }

    /**
     * Sets the value of the costcenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("CostcenterCode")
    public void setCostcenterCode(String value) {
        this.costcenterCode = value;
    }

    /**
     * Gets the value of the costcenterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcenterName() {
        return costcenterName;
    }

    /**
     * Sets the value of the costcenterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("CostcenterName")
    public void setCostcenterName(String value) {
        this.costcenterName = value;
    }

    /**
     * Gets the value of the costcenterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcenterType() {
        return costcenterType;
    }

    /**
     * Sets the value of the costcenterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("CostcenterType")
    public void setCostcenterType(String value) {
        this.costcenterType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("Description")
    public void setDescription(String value) {
        this.description = value;
    }

}
