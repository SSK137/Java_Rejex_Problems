package com.bridgelabz;
import java.util.*;
import java.util.regex.*;

interface UserValidate{
    boolean validate(String message) throws InvalidUserException;
}
public class User_Registration_Problem {
    public static Scanner scanner=new Scanner(System.in);
    UserValidate userValidate=First_Name->{
        /*System.out.println("Enter the First Name : ");
        String F_Name=scanner.next(); */          //F_Name is First Name
        //Expression to check First Name and Last Name
        if (First_Name == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (First_Name.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        String Fname_rejex="^[A-Z]{1}[a-z]{2,}$";
        //Creating Object for Pattern
        Pattern P=Pattern.compile(Fname_rejex);
        //Creating Object for Matcher
        Matcher M=P.matcher(First_Name);
        boolean R=M.matches();

        //Checking whether entered input is valid or not
        if(R)
            System.out.println("Entered Name is in valid");
        else
            throw new InvalidUserException("Entered First Name is Invalid");
        return R;
    };

    UserValidate userValidate_LName=Last_Name->{
        /*System.out.println("Enter the Last Name : ");
        String L_Name=scanner.nextLine();*/           //L_Name is Last Name
        if (Last_Name == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (Last_Name.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        {
            //Expression for Last Name
            String rejex_LastName = "^[A-Z]{1}[a-z]{2,}$";
            //Creating pattern object
            Pattern P2 = Pattern.compile(rejex_LastName);
            //Creating matcher object
            Matcher M2 = P2.matcher(Last_Name);
            boolean R2 = M2.matches();

            //Checking whether entered Last Name is valid or not
            if (R2)
                System.out.println("Entered Last Name is Valid");
            else
                throw new InvalidUserException("Entered Last Name is Invalid");
            return R2;
        }
    };

    UserValidate userValidateMail=Email_id->{
        /*System.out.println("Enter the Email-id : ");
        String mail_id=scanner.nextLine();*/
        //Expression for Mail-id
        if (Email_id == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (Email_id.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        {
            String rejex_mailid = "^[a-zA-Z0-9.-]+@[a-zA-Z0-9.]+$";
            //Creating pattern object
            Pattern P2 = Pattern.compile(rejex_mailid);
            //Creating matcher object
            Matcher M2 = P2.matcher(Email_id);
            boolean R2 = M2.matches();
            //Checking whether entered Mail-id is valid or not
            if (R2)
                System.out.println("Entered Mail-id is Valid");
            else
                throw new InvalidUserException("Entered Mail-id id Invalid");
            return R2;
        }
    };

    UserValidate userValidateMB=Mobile_Number->{
        /*System.out.println("Enter the Mobile Number : ");
        String mobile_number=scanner.nextLine();*/
        if (Mobile_Number == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (Mobile_Number.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        {
            //Expression for mobile Number
            String rejex_mobile = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
            //Creating pattern object
            Pattern P3 = Pattern.compile(rejex_mobile);
            //Creating matcher object
            Matcher M3 = P3.matcher(Mobile_Number);
            boolean R3 = M3.matches();

            //Checking whether entered Mobile Number is valid or not
            if (R3)
                System.out.println("Entered Mobile Number is Valid");
            else
                throw new InvalidUserException("Entered Mobile Number is Invalid");
            return R3;
        }
    };

    UserValidate userValidatePassword=Password->{
        /*System.out.println("Enter the Password Having Minimum 8 Character: ");
        String password=scanner.nextLine();*/
        if (Password == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (Password.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        {
            //Expression for Password
            String rejex_password = "^[A-Z]{1}[a-zA-Z!]{5,}[@#$%^&*]{1}[0-9]{1,}$";
            //Creating pattern object
            Pattern P4 = Pattern.compile(rejex_password);
            //Creating matcher object
            Matcher M4 = P4.matcher(Password);
            boolean R4 = M4.matches();

            //Checking whether entered Password is valid pr not
            if (R4)
                System.out.println("Entered password is Valid");
            else
                throw new InvalidUserException("Entered Password is Invalid");
            return R4;
        }
    };

  /*  public void MainMenu() {
        System.out.println("Enter Your Choice\n1)First Name:\n2)Last Name: \n3)Email-id:\n4)Mobile Number\n5)Password");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                First_Name();
                break;
            case 2:
                Last_Name();
                break;
            case 3:
                Email_id();
                break;
            case 4:
                Mobile_Number();
                break;
            case 5:
                Password();
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }*/
}
