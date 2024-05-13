package com.king.entity;

/**
 * @packageNme com.king.entity
 * @Author: jinguoguang
 * @Date: 2024/5/10 15:22
 * @Version: v1.0.0
 **/
public class User {

    private String id;
    private String name;

    private int age;

    private String gender;
    public void say(){
        System.out.println("Spring build success!!!");
    }


    public User() {
    }

    public User(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
