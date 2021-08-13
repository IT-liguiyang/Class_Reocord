package cn.web.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;

public class CommentActivityThought implements Serializable {
    private String cano;
    private String username;
    private String atno;
    private String cacontent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date catime;

    public CommentActivityThought(){}

    public CommentActivityThought(String cano, String username, String atno, String cacontent, Date catime) {
        this.cano = cano;
        this.username = username;
        this.atno = atno;
        this.cacontent = cacontent;
        this.catime = catime;
    }

    public String getCano() {
        return cano;
    }

    public void setCano(String cano) {
        this.cano = cano;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAtno() {
        return atno;
    }

    public void setAtno(String atno) {
        this.atno = atno;
    }

    public String getCacontent() {
        return cacontent;
    }

    public void setCacontent(String cacontent) {
        this.cacontent = cacontent;
    }

    public Date getCatime() {
        return catime;
    }

    public void setCatime(Date catime) {
        this.catime = catime;
    }

    @Override
    public String toString() {
        return "CommentActivityThought{" +
                "cano='" + cano + '\'' +
                ", username='" + username + '\'' +
                ", atno='" + atno + '\'' +
                ", cacontent='" + cacontent + '\'' +
                ", catime=" + catime +
                '}';
    }
}
