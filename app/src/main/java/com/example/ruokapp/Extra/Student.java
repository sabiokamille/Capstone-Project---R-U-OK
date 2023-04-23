package com.example.ruokapp.Extra;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private ArrayList<CAPSEvent> events;
    private int pswrd;
    private String ruid;
    private String fname;
    private String lname;
    private Date dob;

    public Student(String ruid, String fname, String lname, Date dob) {
        this.ruid = ruid;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    public void registerAppt(){

    }
    public void registerEvent(){

    }

    public void updateAppt() {
    }

    public void updateEvent() {
    }

    public void unregisterAppt() {
    }

    public void unregisterEvent() {
    }
}

