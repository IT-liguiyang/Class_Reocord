package cn.web.domain;

import java.io.Serializable;

public class Work implements Serializable {
    private String comno;
    private String username;
    private String comname;
    private String comaddress;
    private String comduty;

    public Work(String comno, String username, String comname, String comaddress, String comduty) {
        this.comno = comno;
        this.username = username;
        this.comname = comname;
        this.comaddress = comaddress;
        this.comduty = comduty;
    }

    public Work() {

    }

    public String getComno() {
        return comno;
    }

    public void setComno(String comno) {
        this.comno = comno;
    }

    @Override
    public String toString() {
        return "Work{" +
                "comno='" + comno + '\'' +
                ", username='" + username + '\'' +
                ", comname='" + comname + '\'' +
                ", comaddress='" + comaddress + '\'' +
                ", comduty='" + comduty + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComaddress() {
        return comaddress;
    }

    public void setComaddress(String comaddress) {
        this.comaddress = comaddress;
    }

    public String getComduty() {
        return comduty;
    }

    public void setComduty(String comduty) {
        this.comduty = comduty;
    }


}
