package by.belhard.j24.lessons.lesson03;

public class PersonExample {

    public static void main(String[] args) {

        Person person1 = new Person();

        System.out.println(person1.age + " " + person1.name);

        person1.name = "Igor";
        person1.age = 20;
        person1.country = new Country();
        person1.sex = Sex.MALE;

        person1.country.title = "Belarus";
        person1.country.zipCode = 220000;

        Person person2 = new Person();
        person2.name = "Olga";
        person2.age = 19;
        person2.country = person1.country;
        person2.sex = Sex.FEMALE;

        System.out.println(person2.name + " " + person2.country.title);

//        person2.country.title = "Brazil";

        person2.country = new Country();
        person2.country.title = "Brazil";
        person2.country.zipCode = 123456;

        System.out.println("====");
        System.out.println(person1.name + " " + person1.country.title);
        System.out.println(person2.name + " " + person2.country.title);

        person1.walk();
        person2.eat("ice-cream");
        System.out.println(person1.name + " is " + person1.age + " years old");
        int newAge = person1.growOld();
        System.out.println(person1.name + " is growing old: " + newAge);
        System.out.println(person1.name + " is " + person1.age + " years old");
    }
}
