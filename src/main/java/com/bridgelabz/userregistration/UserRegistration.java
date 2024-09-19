package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration  {
    public boolean validateFirstName(String fname) throws UserRegistrationException {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(fname).matches();
        if (check) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid first name "+fname);
        }
    }

    public boolean validateLastName(String lname) throws UserRegistrationException {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(lname).matches();
        if (check) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid last name "+lname);
        }
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(email).matches();
        if (check) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid email address "+email);
        }
    }

    public boolean validatePhone(String phone) throws UserRegistrationException {
        String regex = "(0|91)?[-\\s]?[6-9][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(phone).matches();
        if (check) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid phone number "+phone);
        }
    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        boolean check = pattern.matcher(password).matches();
        if (check) {
            return true;
        }
        else {
            throw new UserRegistrationException("Invalid entered password "+password);
        }
    }

    public boolean validateAllEmailSamples(String email) {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(email).matches();
        return check;
    }

    public static void main(String[] args) throws UserRegistrationException {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Kruti"));
        System.out.println(userRegistration.validateLastName("Patil"));
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(userRegistration.validatePhone("91 8878564543"));
        System.out.println(userRegistration.validatePassword("Krutika7#"));
        System.out.println(userRegistration.validateAllEmailSamples("abc@yahoo.com"));
    }
}