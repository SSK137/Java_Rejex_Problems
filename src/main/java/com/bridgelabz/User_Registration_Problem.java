package com.bridgelabz;
import java.util.*;
import java.util.regex.*;
public class User_Registration_Problem {
    public static Scanner scanner=new Scanner(System.in);

    public static boolean First_Name(){
        System.out.println("Enter the First Name : ");
        String F_Name=scanner.next();
        System.out.println("Enter the Last Name : ");
        String L_Name=scanner.next();
        String Fname_rejex="^[A-Z]{1}[a-z]{2,}$";
        String Lname_rejex="^[A-Z]{1}[a-z]{2,}$";
        Pattern P=Pattern.compile(Fname_rejex);
        Pattern P1=Pattern.compile(Lname_rejex);
        Matcher M=P.matcher(F_Name);
        Matcher M1=P.matcher(L_Name);
        boolean R=M.matches();
        boolean R1=M1.matches();

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
        String F_Name=scanner.next();
        String rejex="^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+$";
        Pattern P=Pattern.compile(rejex);
        Matcher M=P.matcher(F_Name);
        boolean R=M.matches();

        if(R)
            System.out.println("Entered Mail-id is Valid");
        else
            System.out.println("Entered Mail-d is Invalid");
        return R;
    }
}
