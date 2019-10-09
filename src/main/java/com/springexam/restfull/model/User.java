package com.springexam.restfull.model;

public class User {

    private int id;
    private String userName;
    private String name;
    private String hairColor;
    private String birthday;
    private String adrress;

    public User (){

    }

    public User(int id,String userName, String name, String hairColor, String birthday, String adrress) {
        this.id=id;
        this.userName = userName;
        this.name = name;
        this.hairColor = hairColor;
        this.birthday = birthday;
        this.adrress = adrress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
