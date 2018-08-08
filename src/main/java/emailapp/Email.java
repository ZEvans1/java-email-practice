package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String compnaySuffix = "company.com";
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    //Constructor for first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //call method asking for dpt
        this.department = setDepartment();

        //call method for password
        this.password = randomPassowrd(defaultPasswordLength);
        System.out.println("Password: " + this.password);

        //
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + compnaySuffix;
        System.out.println("Email is: " + this.email);
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
        char[] password = new char[length];
        for (int i=0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailbox capacity

    //Set alt email

    //Passwords
}
