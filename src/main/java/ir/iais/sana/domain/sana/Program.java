
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for program complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="program"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="progCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="progTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "program", propOrder = {
    "progCode",
    "progTitle"
})
public class Program
    extends Data
{

    protected String progCode;
    protected String progTitle;

    public String getProgCode() {
        return progCode;
    }

    @SetterPoiColumn("ProgCode")
    public void setProgCode(String value) {
        this.progCode = value;
    }

    public String getProgTitle() {
        return progTitle;
    }

    @SetterPoiColumn("ProgTitle")
    public void setProgTitle(String value) {
        this.progTitle = value;
    }

}
