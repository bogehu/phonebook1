package cn.PhoneBook;

/**
 * Created by xubt on 4/23/16.
 */
public class Person {

    private String name;
    private String phoneNumber;
    private int ID;

    public Person() {
    }

    public Person(String name, String phoneNumber, int ID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


