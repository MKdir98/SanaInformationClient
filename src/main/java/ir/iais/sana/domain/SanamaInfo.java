package ir.iais.sana.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "SanamaInfo")
public class SanamaInfo implements Serializable {
    @XmlAttribute(name = "ProtocolName")
    private String protocolName;
    @XmlAttribute(name = "ProtocolVer")
    private String protocolVer;
    @XmlAttribute(name = "ProtocolType")
    private String protocolType;
    @XmlAttribute(name = "MainOrgID")
    private String mainOrgID;
    @XmlAttribute(name = "MainOrgCode")
    private String mainOrgCode;
    @XmlAttribute(name = "Year")
    private Integer year;
    @XmlAttribute(name = "Month")
    private Integer month;
    @XmlElement(name = "Attachment_List")
    private List<Attachment> attachments;
    @XmlElement(name = "Report_List")
    private List<Report> reports;
    @XmlElement(name = "ContrastAccount_list")
    private List<ContrastAccount> contrastAccounts;
}
