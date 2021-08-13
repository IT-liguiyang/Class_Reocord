package cn.web.domain;

import java.io.Serializable;

public class Student implements Serializable
{
    private String username;//用户名，账号
    private String cno;//班级号
    private String password;//密码
    private String realname;//真实姓名
    private String sex;//男或女
    private String birthday;//出生日期
    private String birthplace;//籍贯
    private String email;//邮箱
    private String telephone;//手机号
    private String hobby;//爱好
    private String signature;//个性签名

//
//    private String status;//激活状态，Y代表激活，N代表未激活
//    private String code;//激活码（要求唯一）

    /**
     * 无参构造方法
     */
    public Student() {
    }

    public Student(String username, String cno,String password, String realname, String sex, String birthday, String birthplace, String email, String telephone, String hobby, String signature) {
        this.username = username;
        this.cno = cno;
        this.password = password;
        this.realname = realname;
        this.sex = sex;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.email = email;
        this.telephone = telephone;
        this.hobby = hobby;
        this.signature = signature;
//        this.status = status;
//        this.code = code;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCno() { return cno;}

    public void setCno(String cno) {this.cno = cno; }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }



    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", cno='" + cno + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", hobby='" + hobby + '\'' +
                ", signature='" + signature + '\'' +

                '}';
    }
}
