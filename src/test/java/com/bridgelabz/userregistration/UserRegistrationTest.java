package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturns_True() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("Kruti");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenValid_ShouldReturns_False() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("kruti");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturn_True() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateLastName("Patil");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturn_False() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateLastName("patil");
        Assert.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com"})
    public void givenEmail_WhenValid_ShouldReturn_True(String email) throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        Assert.assertTrue(user.validateEmail(email));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"abc","abc@.com.my"})
    public void givenEmail_WhenValid_ShouldReturn_False(String email) throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        Assert.assertFalse(user.validateEmail(email));
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturn_True() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePhone("91 8878564543");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturn_False() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePhone("5436546546");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturn_True() throws UserRegistrationException {
        UserRegistration user=new UserRegistration();
        boolean result=user.validatePassword("Kpatil#123");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturn_False() throws UserRegistrationException {
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