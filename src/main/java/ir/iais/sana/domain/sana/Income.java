
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for income complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="income"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incomeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incomeTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "income", propOrder = {
    "incomeCode",
    "incomeTitle"
})
public class Income
    extends Data
{

    protected String incomeCode;
    protected String incomeTitle;

    /**
     * Gets the value of the incomeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeCode() {
        return incomeCode;
    }

    /**
     * Sets the value of the incomeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("incomeCode")
    public void setIncomeCode(String value) {
        this.incomeCode = value;
    }

    /**
     * Gets the value of the incomeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeTitle() {
        return incomeTitle;
    }

    /**
     * Sets the value of the incomeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @SetterPoiColumn("incomeTitle")
    public void setIncomeTitle(String value) {
        this.incomeTitle = value;
    }

}
