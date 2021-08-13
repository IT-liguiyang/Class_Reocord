package cn.web.domain;


import org.springframework.format.annotation.DateTimeFormat;

import java.awt.*;
import java.io.Serializable;
import java.sql.Date;

public class Activity implements Serializable {
    private String ano;
    private String cno;
    private String aplace;
    private Date atime;
    private String acontent;
    private Image aimages;

    public Activity(){}

    public Activity(String ano, String cno, String aplace, Date atime, String acontent, Image aimages) {
        this.ano = ano;
        this.cno = cno;
        this.aplace = aplace;
        this.atime = atime;
        this.acontent = acontent;
        this.aimages = aimages;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getAplace() {
        return aplace;
    }

    public void setAplace(String aplace) {
        this.aplace = aplace;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public Image getAimages() {
        return aimages;
    }

    public void setAimages(Image aimages) {
        this.aimages = aimages;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "ano='" + ano + '\'' +
                ", cno='" + cno + '\'' +
                ", aplace='" + aplace + '\'' +
                ", atime=" + atime +
                ", acontent='" + acontent + '\'' +
                ", aimages=" + aimages +
                '}';
    }
}
