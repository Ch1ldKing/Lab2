package com.example.weblab2;

import java.sql.Date;

public class Student {
    private String sid;
    private String name;
    private char gender;
    private int age;
    private Date birthday;

    public Student(){

    }
    public Student(String sid, String name, int age,Date birthday){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }
    // 构造器、getter和setter省略
}
