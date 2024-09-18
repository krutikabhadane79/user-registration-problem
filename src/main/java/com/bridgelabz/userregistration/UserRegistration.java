package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String fname) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(fname).matches();
        return check;
    }

    public boolean validateLatName(String lname) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(lname).matches();
        return check;
    }

    public boolean validateEmail(String email) {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        boolean check=pattern.matcher(email).matches();
        return check;
    }

    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Kruti"));
        System.out.println(userRegistration.validateLatName("Patil"));
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }
}