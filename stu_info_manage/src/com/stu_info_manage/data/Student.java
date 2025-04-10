package com.stu_info_manage.data;

public class Student {
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

    public String getId_num() {

        return this.id_num;
    }

    public void setId_num(String id_num) {
        this.id_num = id_num;
    }

    public String getClass_info() {
        return class_info;
    }

    public void setClass_info(String class_info) {
        this.class_info = class_info;
    }


    private String name;
    private int age;
    private String id_num;


    private String class_info;

}
