
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accGroupsCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accGroupsCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://servicebus.sana.ir/PushSana/v5/}data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accGroupsTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divanAccGroupsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accGroupsCode", propOrder = {
    "accGroupsTitle",
    "code",
    "divanAccGroupsCode"
})
public class AccGroupsCode
    extends Data
{

    protected String accGroupsTitle;
    protected String code;
    protected String divanAccGroupsCode;

    public String getAccGroupsTitle() {
        return accGroupsTitle;
    }

    @SetterPoiColumn("AccGroupsCode")
    public void setAccGroupsTitle(String value) {
        this.accGroupsTitle = value;
    }

    public String getCode() {
        return code;
    }

    @SetterPoiColumn("AccGroupsTitle")
    public void setCode(String value) {
        this.code = value;
    }

    public String getDivanAccGroupsCode() {
        return divanAccGroupsCode;
    }

    @SetterPoiColumn("DivanAccGroupsCode")
    public void setDivanAccGroupsCode(String value) {
        this.divanAccGroupsCode = value;
    }

}
