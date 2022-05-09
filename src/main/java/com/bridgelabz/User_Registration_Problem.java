package com.bridgelabz;
import java.util.*;
import java.util.regex.*;
public class User_Registration_Problem {
    public static Scanner scanner=new Scanner(System.in);

    public static boolean First_Name(){
        System.out.println("Enter the First Name : ");
        String F_Name=scanner.next();
        String rejex="^[A-Z]{1}[a-z]{2,}$";
        Pattern P=Pattern.compile(rejex);
        Matcher M=P.matcher(F_Name);
        boolean R=M.matches();

        if(R)
            System.out.println("Entered Name is Valid");
        else
            System.out.println("Entered Name is Invalid");
        return R;
    }
}
