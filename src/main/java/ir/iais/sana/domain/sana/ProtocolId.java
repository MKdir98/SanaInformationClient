
package ir.iais.sana.domain.sana;

import ir.iais.sana.domain.SetterPoiColumn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protocolId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divanOrgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="producerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="producerRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protocolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolId", propOrder = {
    "description",
    "divanOrgCode",
    "endDate",
    "orgCode",
    "orgTitle",
    "producerName",
    "producerRole",
    "protocolName",
    "provinceName",
    "repDate",
    "repTime",
    "startDate",
    "version"
})
public class ProtocolId {

    protected String description;
    protected String divanOrgCode;
    protected String endDate;
    protected String orgCode;
    protected String orgTitle;
    protected String producerName;
    protected String producerRole;
    protected String protocolName;
    protected String provinceName;
    protected String repDate;
    protected String repTime;
    protected String startDate;
    protected String version;

    public String getDescription() {
        return description;
    }

    @SetterPoiColumn("Description_")
    public void setDescription(String value) {
        this.description = value;
    }

    public String getDivanOrgCode() {
        return divanOrgCode;
    }

    @SetterPoiColumn("DivanorgCode")
    public void setDivanOrgCode(String value) {
        this.divanOrgCode = value;
    }

    public String getEndDate() {
        return endDate;
    }

    @SetterPoiColumn("enddate")
    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getOrgCode() {
        return orgCode;
    }

    @SetterPoiColumn("orgCode")
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    public String getOrgTitle() {
        return orgTitle;
    }

    @SetterPoiColumn("orgtitle")
    public void setOrgTitle(String value) {
        this.orgTitle = value;
    }

    public String getProducerName() {
        return producerName;
    }

    @SetterPoiColumn("producerName")
    public void setProducerName(String value) {
        this.producerName = value;
    }

    public String getProducerRole() {
        return producerRole;
    }

    @SetterPoiColumn("producerRole")
    public void setProducerRole(String value) {
        this.producerRole = value;
    }

    public String getProtocolName() {
        return protocolName;
    }

    @SetterPoiColumn("protocolName")
    public void setProtocolName(String value) {
        this.protocolName = value;
    }

    public String getProvinceName() {
        return provinceName;
    }

    @SetterPoiColumn("provincename")
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    public String getRepDate() {
        return repDate;
    }

    @SetterPoiColumn("repdate")
    public void setRepDate(String value) {
        this.repDate = value;
    }

    public String getRepTime() {
        return repTime;
    }

    @SetterPoiColumn("reptime")
    public void setRepTime(String value) {
        this.repTime = value;
    }

    public String getStartDate() {
        return startDate;
    }

    @SetterPoiColumn("startdate")
    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getVersion() {
        return version;
    }

    @SetterPoiColumn("Version")
    public void setVersion(String value) {
        this.version = value;
    }

}
