package com.example.ruokapp.Model;

public class User {

    private String name,studentID,email;

    public User() {
    }

    public User(String name, String studentID, String email) {
        this.name = name;
        this.studentID = studentID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
