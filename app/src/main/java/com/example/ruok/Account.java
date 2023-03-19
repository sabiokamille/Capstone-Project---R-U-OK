package com.example.ruok;

import java.util.Date;

public class Account {
    private Student student;
    private String email;
    private String pswrd;

    public void setEmail(String email) {
        if(email.matches("([a-zA-Z] | [0-9])+@scarletmail.rutgers.edu$")) {
            this.email = email;
        } else {
            System.out.println("Please enter a valid email");
        }
    }

    public void setStudent(String pswrd) {
        if(pswrd.isEmpty()) {
            System.out.println("Please enter a valid password");
        } else if (pswrd.matches("^([a-zA-z] | [0-9])+$")) {
            this.pswrd = pswrd;
            
        }
    }



}
