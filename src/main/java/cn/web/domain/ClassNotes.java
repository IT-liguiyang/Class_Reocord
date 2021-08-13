package cn.web.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;

public class ClassNotes implements Serializable {
    private String cnno;
    private String cno;
    private Date cntime;
    private String cncontent;
    private String cnsubject;
    private String cnpublisher;
    private String cnreader;

    public ClassNotes() {
    }

    public ClassNotes(String cnno, String cno, Date cntime, String cncontent, String cnsubject, String cnpublisher, String cnreader) {
        this.cnno = cnno;
        this.cno = cno;
        this.cntime = cntime;
        this.cncontent = cncontent;
        this.cnsubject = cnsubject;
        this.cnpublisher = cnpublisher;
        this.cnreader = cnreader;
    }

    public String getCnno() {
        return cnno;
    }

    public void setCnno(String cnno) {
        this.cnno = cnno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Date getCntime() {
        return cntime;
    }

    public void setCntime(Date cntime) {
        this.cntime = cntime;
    }

    public String getCncontent() {
        return cncontent;
    }

    public void setCncontent(String cncontent) {
        this.cncontent = cncontent;
    }

    public String getCnsubject() {
        return cnsubject;
    }

    public void setCnsubject(String cnsubject) {
        this.cnsubject = cnsubject;
    }

    public String getCnpublisher() {
        return cnpublisher;
    }

    public void setCnpublisher(String cnpublisher) {
        this.cnpublisher = cnpublisher;
    }

    public String getCnreader() {
        return cnreader;
    }

    public void setCnreader(String cnreader) {
        this.cnreader = cnreader;
    }

    @Override
    public String toString() {
        return "ClassNotes{" +
                "cnno='" + cnno + '\'' +
                ", cno='" + cno + '\'' +
                ", cntime=" + cntime +
                ", cncontent='" + cncontent + '\'' +
                ", cnsubject='" + cnsubject + '\'' +
                ", cnpublisher='" + cnpublisher + '\'' +
                ", cnreader='" + cnreader + '\'' +
                '}';
    }
}
