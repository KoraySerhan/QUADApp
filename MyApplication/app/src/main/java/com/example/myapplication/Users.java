package com.example.myapplication;

public class Users {
    private String name, age, gender, height, weight;

    public Users(String name, String age, String gender, String height, String weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAge(){
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHeight(){
        return height;
    }

    public String getWeight(){
        return weight;
    }

}
