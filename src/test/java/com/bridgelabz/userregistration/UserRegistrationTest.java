package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturns_True() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("Kruti");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenValid_ShouldReturns_False() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("kruti");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturn_True() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateLastName("Patil");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturn_False() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateLastName("patil");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturn_True() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturn_False() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateEmail("abc.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturn_True() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePhone("91 8878564543");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturn_False() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePhone("5436546546");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturn_True() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePassword("Kpatil#123");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturn_False() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePassword("Kruti12");
        Assert.assertFalse(result);
    }

    @Test
    public void gievnEmailsamples_WhenValid_Return_True() {
        UserRegistration user=new UserRegistration();
        Assert.assertTrue(user.validateAllEmailSamples("abc@yahoo.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc-100@yahoo.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc.100@yahoo.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc111@abc.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc-100@abc.net"));
        Assert.assertTrue(user.validateAllEmailSamples("abc.100@abc.com.au"));
        Assert.assertTrue(user.validateAllEmailSamples("abc@1.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc@gmail.com.com"));
        Assert.assertTrue(user.validateAllEmailSamples("abc+100@gmail.com.com"));
    }

}