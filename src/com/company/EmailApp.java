package com.company;
import java.util.*;

public class EmailApp {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter First Name");
        String f_name = SC.next();

        System.out.println("Enter Last Name");
        String l_name = SC.next();

        //Creating object for email class
        Email em1 = new Email(f_name, l_name);
        int choice = -1;
        do {
            System.out.println("\n***** \n Enter your Choice \n1. Show info \n2. Change Password \n3. Change Mailbox Capacity \n4. Set Alternative Email \n5. Store data in File \n6. Display data from file \n7.Exit");
            choice = SC.nextInt();
            switch (choice){
                case 1:
                    em1.GetInfo();
                    break;
                case 2:
                    em1.SetPassword();
                    break;
                case 3:
                    em1.SetMailCap();
                    break;
                case 4:
                    em1.AlternateEmail();
                    break;
                case 5:
                    em1.StoreFIle();
                    break;
                case 6:
                    em1.ReadFile();
                    break;
                case 7:
                    System.out.println("Thank you for using our application");
                default:
                    System.out.println("Invalid Choice");

            }
        }
        while(choice!= 5);

    }

}
