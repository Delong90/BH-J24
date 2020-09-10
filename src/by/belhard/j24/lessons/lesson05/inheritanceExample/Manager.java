package by.belhard.j24.lessons.lesson05.inheritanceExample;

public class Manager extends Employee {

    private int phoneNumber;

    public Manager(String name, int age, int phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
