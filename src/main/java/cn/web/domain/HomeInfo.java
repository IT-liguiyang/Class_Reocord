package cn.web.domain;

import java.io.Serializable;

public class HomeInfo implements Serializable {
    private String hno;
    private String username;
    private String hcity;
    private String hstreet;

    public HomeInfo() {    }


    public HomeInfo(String hno, String username, String hcity, String hstreet) {
        this.hno = hno;
        this.username = username;
        this.hcity = hcity;
        this.hstreet = hstreet;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHcity() {
        return hcity;
    }



    public void setHcity(String hcity) {
        this.hcity = hcity;
    }

    public String getHstreet() {
        return hstreet;
    }

    public void setHstreet(String hstreet) {
        this.hstreet = hstreet;
    }



    @Override
    public String toString() {
        return "HomeInfo{" +
                "hno='" + hno + '\'' +
                ", username='" + username + '\'' +
                ", hcity='" + hcity + '\'' +
                ", hstreet='" + hstreet + '\'' +
                '}';
    }

}
