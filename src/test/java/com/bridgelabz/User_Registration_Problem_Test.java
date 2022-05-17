package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class User_Registration_Problem_Test {
    User_Registration_Problem userRegistrationProblem = new User_Registration_Problem();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate.validate("Saurabh"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnfalse() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate.validate("saurabh"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnnull() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate.validate(null));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnEmpty() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate.validate(""));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

   /* @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = userRegistrationProblem.First_Name("saurabh");
        System.out.println(result);
        Assertions.assertFalse(result);
    }*/

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate_LName.validate("Kodam"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnfalse() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate_LName.validate("kodam"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnNull() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate_LName.validate(null));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnEmpty() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidate_LName.validate(""));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    /*@Test
    public void giveLastName_WhenProper_ShouldReturnFalse() {
        boolean result1 = userRegistrationProblem.Last_Name("kodam");
        System.out.println(result1);
        Assertions.assertFalse(result1);
    }*/

    @Test
    public void giveEmail_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMail.validate("saurabh.kodam@gmail.com"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveEmail_WhenProper_ShouldReturnfalse() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMail.validate("@saurabh.kodam@gmail.com"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveEmail_WhenProper_ShouldReturnNUll() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMail.validate(null));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveEmail_WhenProper_ShouldReturnEmpty() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMail.validate(""));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    /*@Test
    public void giveEmail_WhenProper_ShouldReturnfalse() {
        boolean result2 = userRegistrationProblem.Email_id("@saurabhkodam@gmail.com");
        System.out.println(result2);
        Assertions.assertFalse(result2);
    }*/

    @Test
    public void giveMobileNo_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMB.validate("91 9890333349"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveMobileNo_WhenProper_ShouldReturnfalse() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMB.validate("91 980333349"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveMobileNo_WhenProper_ShouldReturnNull() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMB.validate(null));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void giveMobileNo_WhenProper_ShouldReturnEmpty() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidateMB.validate(""));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

   /* @Test
    public void giveMobileNo_WhenProper_ShouldReturnFalse() {
        boolean result2 = userRegistrationProblem.Mobile_Number("91 989033349");
        System.out.println(result2);
        Assertions.assertFalse(result2);
    }*/

    @Test
    public void givePassword_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidatePassword.validate("Saurabh@123"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void givePassword_WhenProper_ShouldReturnfalse() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidatePassword.validate("saurabh@123"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void givePassword_WhenProper_ShouldReturnNull() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidatePassword.validate(null));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void givePassword_WhenProper_ShouldReturnEmpty() {
        try {
            Assertions.assertTrue(userRegistrationProblem.userValidatePassword.validate(""));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    /*@Test
    public void givePassword_WhenProper_ShouldReturnFalse() {
        boolean result2 = userRegistrationProblem.Password("saurabh@123");
        System.out.println(result2);
        Assertions.assertFalse(result2);
    }*/

}
