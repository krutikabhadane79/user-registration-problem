package com.bridgelabz.userregistration;

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

    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Kruti"));
        System.out.println(userRegistration.validateLatName("Patil"));
    }
}