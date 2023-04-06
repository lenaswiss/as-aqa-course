package oop.block;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 * create User class that will contain next private fields:
 * id;
 * fullName;
 * billingAddress;
 * role;
 * firstName;
 * email;
 * deliveryAddress;
 * manager;
 * lastName;
 * phoneNumber;
 * cards;      * , that contains
 * <p>
 * methods:
 * setters for phoneNumber, billingAddress, deliveryAddress, a card and manager. Setter for cards
 * field must add one card to the list;
 * getters for all fields;
 * toString(this method must be created for all classes);
 * printUserInfo(this method must print all user info except of id, cards and manager);
 * <p>
 * A User object must be created with values of fullName, email and role type or firstName, lastName, email and
 * role type. fullName value is a firstName and lastName combination separated with space.
 * - id value must be generated automatically after user is created. This value is unique for
 * each created user and starts from value 1.
 * <p>
 * A User object must be created with values of fullName, email and role type or firstName,
 * lastName, email and role type. fullName value is a firstName and lastName combination
 * separated with space.
 */
public class User {

    private String id = idGenerator();
    private String fullName;

    private String billingAddress;

    private Role role;
    private String firstName;
    private String lastName;


    private String phoneNumber;
    private String email;
    private String deliveryAddress;
    private String manager;
    private ArrayList<Card> cards;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public User() {//TODO
        System.out.println("Test constructor");
    }

    public User(String fullName, String email, Role role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role; //TODO
    }

    public User(String firstName, String lastName, String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role; //TODO
    }

    public String getId() {
        return id;
    }

    private static String idGenerator() {
        Date date = new Date();
        java.sql.Timestamp ts = new Timestamp(date.getTime());
        return "1_" + ts.getTime() / 1000;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setPhoneNumber() {
        try {
            System.out.println("Please enter your phone number. Phone should contain digits and begin from + symbol.");
            String tempRhone = reader.readLine();
            while (!tempRhone.matches("^(\\+)(\\d{10})")) {
                System.out.println("Invalid phone number format");
                tempRhone = reader.readLine();
            }
            System.out.println("Phone successfully saved.");
            this.phoneNumber = tempRhone;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printUserInfo() {
        System.out.println("User id: " + this.id);
        System.out.println("Full name: " + this.fullName);
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println(this.fullName + "hase role " + this.role.getName());
        System.out.println("Billing address" + this.billingAddress);
        System.out.println("Phone: " + this.getPhoneNumber());
        System.out.println("Permissions: ");
        if (this.role.getName() == "ADMIN") {
            System.out.println("- can view All");
            System.out.println("- can view All");
            System.out.println("- can edit All");
            System.out.println("- can delete All");
        }
        if (this.role.getName() == "MAIN_CUSTOMER") {
            System.out.println("- can view All");
            System.out.println("- can view All");
            System.out.println("- can edit All");
        }
        if (this.role.getName() == "CUSTOMER") {
            System.out.println("- can view All");
            System.out.println("- can view All");
        }
        if (this.role.getName() == "VIEWER") {
            System.out.println("- view All");
        }

    }
}
