package oop.block;

/**
 * manager is a user that contains additional private fields: position;
 * responsibilityDistrict; workPhoneNumber. Manager object can be created,
 * like user object, but additionally must have position value in process of creation.
 * All additional fields must have getters and setters. Also, manager has the same
 * method printUserInfo, like a user, but this method additionally print all additional fields of manager.
 */
public class Manager extends User {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }



}
