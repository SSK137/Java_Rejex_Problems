package com.bridgelabz;

import java.util.Scanner;

public class User_Registration_Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Rejex Problems");
        Scanner scanner=new Scanner(System.in);
        int Answer;
        User_Registration_Problem userRegistrationProblem=new User_Registration_Problem();
        do{
            userRegistrationProblem.MainMenu();
            System.out.println("Do you Wants to Continue If yes then Enter 1 :");
            Answer=scanner.nextInt();
        }while (Answer==1);
    }
}
