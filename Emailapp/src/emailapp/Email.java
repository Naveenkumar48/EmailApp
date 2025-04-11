package emailapp;

import java.util.Scanner;

public class Email {
    private final String firstName;
    private final String lastName;
    public final String password;
    public final String department;
    private final String email;
    public final int emailBoxCapacity = 500;
    //private String alternativeEmail;
    public final String companySuffix = "MicroSoft.com";

    // Constructor to receive the firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword();


        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix ;

    }

    // Ask for the department
    private String setDepartment() {
        Scanner in = new Scanner(System.in);

        int depChoice;
        while (true) {
            System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
            depChoice = in.nextInt();
            if (depChoice >= 0 && depChoice <= 3) break;
            System.out.println("Invalid input. Please try again.");
        }

        if (depChoice == 1) return "Sales";
        else if (depChoice == 2) return "Development";
        else if (depChoice == 3) return "Accounting";
        else return "";
    }


    // Generate a random password
    private String randomPassword() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&";
        char[] password = new char[10];
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //  set Mailbox Capacity
//    public void setEmailBoxCapacity(int capacity){
//        this.emailBoxCapacity = capacity;
//    }
//    //  set Alternative Email
//    public void setAlternativeEmail(String altEmail){
//        this.alternativeEmail = altEmail;
//    }
//    //  changePassword
//    public void changePassword(String password){
//        this.password = password;
//    }
//
//    public int getEmailBoxCapacity(){
//        return emailBoxCapacity;
//    }
//
//    public String getAlternativeEmail(){
//        return alternativeEmail;
//    }
//
   public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                 "\nMAILBOX CAPACITY: "+ emailBoxCapacity + "mb";
    }


}
