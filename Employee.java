package com.example.listviewwithbutton3dots;

/**
 * Created by best tech on 7/26/2017.
 */

public class Employee {
    private String name ;
    private int age ;
    private int ImageId ;
    private String gender ;

    public Employee(String name, int age, int imageId, String gender) {
        this.name = name;
        this.age = age;
        ImageId = imageId;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
