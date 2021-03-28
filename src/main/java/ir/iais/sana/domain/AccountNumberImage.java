package ir.iais.sana.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

public class AccountNumberImage {
    @XmlElement(name = "Attachment_List")
    private List<Attachment> attachments;
}
