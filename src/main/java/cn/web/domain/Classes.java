package cn.web.domain;

import java.io.Serializable;

public class Classes implements Serializable {
    private String cno;
    private String cname;
    private String academy;
    private String specialty;
    private String grade;
    private Integer amount;
    private String description;

    public Classes() {
    }

    public Classes(String cno, String cname, String academy, String specialty, String grade, Integer amount, String description) {
        this.cno = cno;
        this.cname = cname;
        this.academy = academy;
        this.specialty = specialty;
        this.grade = grade;
        this.amount = amount;
        this.description = description;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", academy='" + academy + '\'' +
                ", specialty='" + specialty + '\'' +
                ", grade='" + grade + '\'' +
                ", amount='" + amount + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
