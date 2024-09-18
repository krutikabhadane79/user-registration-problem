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

    public boolean validatePhone(String phone) {
        String regex = "(0|91)?[-\\s]?[6-9][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phone);
        boolean check=pattern.matcher(phone).matches();
        return check;
    }

    public boolean validatePassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean check = pattern.matcher(password).matches();
        return check;
    }


    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Kruti"));
        System.out.println(userRegistration.validateLatName("Patil"));
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(userRegistration.validatePhone("91 8878564543"));
        System.out.println(userRegistration.validatePassword("Krutika7#"));
    }
}