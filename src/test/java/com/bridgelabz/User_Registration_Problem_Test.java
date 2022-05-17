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

    /*@Test
    public void givePassword_WhenProper_ShouldReturnFalse() {
        boolean result2 = userRegistrationProblem.Password("saurabh@123");
        System.out.println(result2);
        Assertions.assertFalse(result2);
    }*/

}
