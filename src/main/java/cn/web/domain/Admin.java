package cn.web.domain;

public class Admin {

    private String adno;
    private String password;
    private String realname;

    public Admin() {

    }

    public Admin(String adno, String password, String realname) {
        this.adno = adno;
        this.password = password;
        this.realname = realname;
    }

    public String getAdno() {
        return adno;
    }

    public void setAdno(String adno) {
        this.adno = adno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adno='" + adno + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
