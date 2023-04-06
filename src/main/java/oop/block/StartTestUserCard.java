package oop.block;

public class StartTestUserCard {

    public static void main(String[] args) {

        User admin = new User("John Dow", "john@j.com", new Role (UserRoles.ADMIN));
        User mainCustomer = new User("John2",  "Dow2", "john2@j.com", new Role (UserRoles.MAIN_CUSTOMER));
        User customer = new User("Bob Dilan", "BobD@j.com", new Role (UserRoles.CUSTOMER));
        User viewer = new User("Jessica" , "Carpet","j@j.com", new Role (UserRoles.VIEWER));

        admin.setPhoneNumber();
        mainCustomer.setPhoneNumber();
        customer.setPhoneNumber();
        viewer.setPhoneNumber();

        admin.setBillingAddress("address 1");
        mainCustomer.setBillingAddress("address 2");
        customer.setBillingAddress("address 3");
        viewer.setBillingAddress("address 4");

        admin.printUserInfo();
        customer.printUserInfo();
        mainCustomer.printUserInfo();
        viewer.printUserInfo();
    }

    public static void printUserInfo(User user) {
        System.out.println("This user FullName : " + user.getFullName() + "\nThis user email\t:  " + "" + user.getEmail());
    }


}
