package cn.web.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Releaseforum implements Serializable {
    private String rno;
    private String username;
    private String rname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date rtime;
    private String rcontent;

    public Releaseforum(){}



    @Override
    public String toString() {
        return "Releaseforum{" +
                "rno='" + rno + '\'' +
                ", username='" + username + '\'' +
                ", rname='" + rname + '\'' +
                ", rtime=" + rtime +
                ", rcontent='" + rcontent + '\'' +
                '}';
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }



}
