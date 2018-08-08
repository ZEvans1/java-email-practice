package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor for first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //call method asking for dpt
        this.department = setDepartment();
    }

    private String setDepartment() {
        System.out.println("Enter department\n1 for Sales\n2 for Dev\n3 for Act\n0 for none\nEnter department code");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    private String randomPassowrd(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    }

    //Set mailbox capacity

    //Set alt email

    //Passwords
}
