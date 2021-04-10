package com.csa.entity;

import java.io.Serializable;
import java.util.Date;
//user 表的实体类
public class User implements Serializable {

    private Integer id;
    private String username; //用户名
    private String mobile; //手机号
    private String password; //登录密码
    private String name; //真实姓名
    private Date birthday; //生日
    private String sex; //性别
    private String email; //邮箱
    private Date createtime; //创建日期
    private Date updateTime; //更新日期
//setter、getter 请自己补充

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "User:" +
                "\n\tid= " + id +
                "\n\tusername= " + username +
                "\n\tmobile= " + mobile +
                "\n\tpassword= " + password +
                "\n\tname= " + name +
                "\n\tbirthday= " + birthday +
                "\n\tsex= " + sex +
                "\n\temail= " + email +
                "\n\tcreatetime= " + createtime +
                "\n\tupdateTime= " + updateTime +
                '\n';
    }
}