package oop.block;

import java.sql.Timestamp;
import java.util.Date;

public class Card {
    /**
     * contains next private fields: id; number; expireDate; cvv; cardType.
     * cardType can be only one from next values: Visa or MasterCard.
     * id must be generated, like user id. All values except of id must
     * be added in process of creation Card object. Also, card class
     * must have getters and setters for all fields except of setter for id.
     */

    private String id = idGenerator();
    private String number;
    private Date expireDate;
    private int cvv;
    private String cardType;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }


    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    private static String idGenerator() {
        Date date = new Date();
        java.sql.Timestamp ts = new Timestamp(date.getTime());
        return "1_" + ts.getTime() / 10000;
    }


}
