package com.bridgelabz;
import java.util.*;
import java.util.regex.*;
public class User_Registration_Problem {
    public static Scanner scanner=new Scanner(System.in);

    public static boolean First_Name(){
        System.out.println("Enter the First Name : ");
        String F_Name=scanner.next();           //F_Name is First Name
        System.out.println("Enter the Last Name : ");
        String L_Name=scanner.next();           //L_name is Last Name
        //Expression to check First Name and Last Name
        String Fname_rejex="^[A-Z]{1}[a-z]{2,}$";
        String Lname_rejex="^[A-Z]{1}[a-z]{2,}$";
        //Creating Object for Pattern
        Pattern P=Pattern.compile(Fname_rejex);
        Pattern P1=Pattern.compile(Lname_rejex);
        //Creating Object for Matcher
        Matcher M=P.matcher(F_Name);
        Matcher M1=P.matcher(L_Name);
        boolean R=M.matches();
        boolean R1=M1.matches();

        //Checking whether entered input is valid or not
        if(R)
            if (R1)
                System.out.println("Entered First Name and Last Name is Valid");
            else
                System.out.println("You Entered Invalid Last Name");
        else
            System.out.println("Entered Invalid First Name ");
        return R;
    }

    public static boolean Email_id(){
        System.out.println("Enter the Email-id : ");
        String mail_id=scanner.next();
        //Expression for Mail-id
        String rejex_mailid="^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+$";
        //Creating pattern object
        Pattern P2=Pattern.compile(rejex_mailid);
        //Creating matcher object
        Matcher M2=P2.matcher(mail_id);
        boolean R2=M2.matches();

        //Checking whether entered Mail-id is valid pr not
        if(R2)
            System.out.println("Entered Mail-id is Valid");
        else
            System.out.println("Entered Mail-d is Invalid");
        return R2;
    }

    public static boolean Mobile_Number(){
        System.out.println("Enter the Mobile Number : ");
        String mobile_number=scanner.next();
        //Expression for mobile Number
        String rejex_mobile="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        //Creating pattern object
        Pattern P3=Pattern.compile(rejex_mobile);
        //Creating matcher object
        Matcher M3=P3.matcher(mobile_number);
        boolean R3=M3.matches();

        //Checking whether entered Mail-id is valid pr not
        if(R3)
            System.out.println("Entered Mobile Number is Valid");
        else
            System.out.println("Entered Mobile Number is Invalid");
        return R3;
    }

    public static boolean Password(){
        System.out.println("Enter the Password Having Minimum 8 Character: ");
        String password=scanner.next();
        //Expression for Password
        String rejex_password="^[A-Z]{1}[a-zA-Z]{6,}[0-9]{1,}$";
        //Creating pattern object
        Pattern P4=Pattern.compile(rejex_password);
        //Creating matcher object
        Matcher M4=P4.matcher(password);
        boolean R4=M4.matches();

        //Checking whether entered Mail-id is valid pr not
        if(R4)
            System.out.println("Entered password is Valid");
        else
            System.out.println("Entered password is Invalid");
        return R4;
    }
}
