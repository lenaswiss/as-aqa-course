package oop.block;

/**
 * There are 4 types of roles: Admin, Main Customer, Customer and Viewer.
 * One from this values must be added in process of creation of user.
 * role field is an object that contains next private fields: viewAll;
 * editAll; addAll; deleteAll. All this values must be added in process of
 * creation Role object and never changed again.
 */

public class Role {
  //  private UserRoles user_role;
    private String name;
    private static boolean viewAl;
    private static boolean addAll;
    private static boolean editAll;
    private static boolean deleteAl;

    public Role(UserRoles user_role) {

        this.name = String.valueOf(user_role);
        if (this.name == "ADMIN") {
            this.viewAl = true;
            this.addAll = true;
            this.editAll = true;
            this.deleteAl = true;
        }

        if (this.name == "CUSTOMER"){
            this.viewAl = true;
            this.addAll = true;
        }

        if (this.name == "VIEWER"){
            this.viewAl = true;
        }

        if (this.name == "MAIN_CUSTOMER"){
            this.viewAl = true;
            this.addAll = true;
            this.editAll = true;
        }
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
