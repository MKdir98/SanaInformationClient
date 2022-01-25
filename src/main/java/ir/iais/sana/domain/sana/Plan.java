
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="predictedTotalCrd" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan", propOrder = {
    "endDate",
    "planCode",
    "planTitle",
    "predictedTotalCrd",
    "startDate"
})
public class Plan
    extends Data
{

    protected String endDate;
    protected String planCode;
    protected String planTitle;
    protected Long predictedTotalCrd;
    protected String startDate;

    public String getEndDate() {
        return endDate;
    }

    @SetterPoiColumn("EndDate")
    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getPlanCode() {
        return planCode;
    }

    @SetterPoiColumn("PlanCode")
    public void setPlanCode(String value) {
        this.planCode = value;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    @SetterPoiColumn("PlanTitle")
    public void setPlanTitle(String value) {
        this.planTitle = value;
    }

    public Long getPredictedTotalCrd() {
        return predictedTotalCrd;
    }

    @SetterPoiColumn("PredictedTotalCrd")
    public void setPredictedTotalCrd(Long value) {
        this.predictedTotalCrd = value;
    }

    public String getStartDate() {
        return startDate;
    }

    @SetterPoiColumn("StartDate")
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
