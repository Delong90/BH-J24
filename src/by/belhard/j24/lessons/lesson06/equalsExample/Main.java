package by.belhard.j24.lessons.lesson06.equalsExample;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Vasily", 25, new Country("Uganda"));
        Person person2 = new Person("Elena", 35, new Country("Uganda"));
        Person person3 = new Person("Elena", 35, new Country("Belarus"));

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
        System.out.println("-----------------");
        System.out.println();

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}
