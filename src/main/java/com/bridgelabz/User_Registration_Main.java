package com.bridgelabz;

import java.util.Scanner;

public class User_Registration_Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Rejex Problems");
        User_Registration_Problem userRegistrationProblem=new User_Registration_Problem();
        System.out.println("Enter Your Choice \n1)First Name and Last Name : \n2)Email-id :");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch (choice)
        {
            case 1:
                userRegistrationProblem.First_Name();
                break;
            case 2:
                userRegistrationProblem.Email_id();
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
