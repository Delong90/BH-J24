package by.belhard.j24.lessons.lesson03;

public class Person {

    private String name;
    private int age;
    Country country;
    Sex sex;

    // конструктор
    Person() {
    }

    public Person(String name, int age, Country country, Sex sex) {

        this.name = name; // this - ссылка на "этот" экземпляр класса
        this.age = age; // например, в конструкторе this ссылается на объект, который конструируется в настоящий момент
        this.country = country;
        this.sex = sex;
    }

    public Person(String name, int age, Sex sex,
                  String countryName, int countryZipCode) {

        this.name = name;
        this.age = age;
        this.sex = sex;

        this.country = new Country(countryName, countryZipCode);
    }

    public void walk() {
        System.out.println(this.name + " is walking.");
    }

    public void walk(int minutes, String mate) {
        System.out.println(name +
                " is walking for "
                + minutes +
                " minutes with "
                + mate);
    }

    public void walk(String place, int minutes) {
        System.out.println(name +
                " is walking for "
                + minutes +
                " minutes in "
                + place);
    }

    public void eat(String dish) {
        int q = 0;
        System.out.println(this.name + " is eating " + dish + q + ".");
    }

    public int growOld() {
        return ++age;
    }

    // getters & setters

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        if (name == null || name.equals(""))
            name = "DefaultName";

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private class A {

    }

    private static class B {

    }
}
