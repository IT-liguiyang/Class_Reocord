package cn.web.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;

public class ActivityThought implements Serializable {
    private String atno;
    private String username;
    private Date attime;
    private String atcontent;
    private String atname;


    public ActivityThought() {
    }

    public ActivityThought(String atno, String username, Date attime, String atcontent, String atname) {
        this.atno = atno;
        this.username = username;
        this.attime = attime;
        this.atcontent = atcontent;
        this.atname = atname;
    }

    public String getAtno() {
        return atno;
    }

    public void setAtno(String atno) {
        this.atno = atno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAttime() {
        return attime;
    }

    public void setAttime(Date attime) {
        this.attime = attime;
    }

    public String getAtcontent() {
        return atcontent;
    }

    public void setAtcontent(String atcontent) {
        this.atcontent = atcontent;
    }

    public String getAtname() {
        return atname;
    }

    public void setAtname(String atname) {
        this.atname = atname;
    }

    @Override
    public String toString() {
        return "ActivityThought{" +
                "atno='" + atno + '\'' +
                ", username='" + username + '\'' +
                ", attime=" + attime +
                ", atcontent='" + atcontent + '\'' +
                ", atname='" + atname + '\'' +
                '}';
    }
}