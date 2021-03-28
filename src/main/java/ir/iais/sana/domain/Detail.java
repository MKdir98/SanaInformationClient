package ir.iais.sana.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

public class Detail implements Serializable {
    @XmlAttribute(name = "CheckNo")
    private String checkNo;
    @XmlAttribute(name = "Zinaf")
    private String zinaf;
    @XmlAttribute(name = "Expense")
    private long expense;
    @XmlAttribute(name = "Date")
    private String date;
    @XmlAttribute(name = "Description")
    private String description;
    @XmlAttribute(name = "DocNo")
    private String docNo;
    @XmlAttribute(name = "DocDate")
    private String docDate;
}
