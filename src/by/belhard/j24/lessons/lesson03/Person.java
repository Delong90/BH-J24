package by.belhard.j24.lessons.lesson03;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void eat(String dish) {
        int q = 0;
        System.out.println(name + " is eating " + dish + q + ".");
    }

    public int growOld() {
        return ++age;
    }
}
