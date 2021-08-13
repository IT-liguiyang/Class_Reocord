package cn.web.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Commentforum implements Serializable {
    private String cfno;
    private String username;
    private String rno;
    private String cfname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cftime;
    private String cfcontent;

    public Commentforum(){}

    public Commentforum(String cfno, String username, String rno, String cfname, Date cftime, String cfcontent) {
        this.cfno = cfno;
        this.username = username;
        this.rno = rno;
        this.cfname = cfname;
        this.cftime = cftime;
        this.cfcontent = cfcontent;
    }

    public String getCfno() {
        return cfno;
    }

    public void setCfno(String cfno) {
        this.cfno = cfno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getCfname() {
        return cfname;
    }

    public void setCfname(String cfname) {
        this.cfname = cfname;
    }

    public Date getCftime() {
        return cftime;
    }

    public void setCftime(Date cftime) {
        this.cftime = cftime;
    }

    public String getCfcontent() {
        return cfcontent;
    }

    public void setCfcontent(String cfcontent) {
        this.cfcontent = cfcontent;
    }

    @Override
    public String toString() {
        return "Commentforum{" +
                "cfno='" + cfno + '\'' +
                ", username='" + username + '\'' +
                ", rno='" + rno + '\'' +
                ", cfname='" + cfname + '\'' +
                ", cftime=" + cftime +
                ", cfcontent='" + cfcontent + '\'' +
                '}';
    }
}
