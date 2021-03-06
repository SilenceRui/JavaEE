package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Silence
 * @creat 2019-11-05  15:54
 */
public class User {
    private String name;
    private int age;
    private Date birthday;

    public String getBirStr(){
        if (birthday!=null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            String date = simpleDateFormat.format("yyyy-MM-ddHH:mm:ss");
            return date;
        }
        return "";
    }

    public User(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
