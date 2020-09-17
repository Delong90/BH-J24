package by.belhard.j24.lessons.lesson07.abstractExample;

public class Manager extends Employee {

    private int phone;

    public Manager(String name, int age, int phone) {
        super(name, age);
        this.phone = phone;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " works not so hard");
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                " phone=" + phone +
                '}';
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
