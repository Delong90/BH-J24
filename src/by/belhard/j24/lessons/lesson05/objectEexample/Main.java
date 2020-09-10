package by.belhard.j24.lessons.lesson05.objectEexample;

import by.belhard.j24.lessons.lesson03.Person;
import by.belhard.j24.lessons.lesson03.Sex;

public class Main {

    public static void main(String[] args) {

        Object o = new Object();
        System.out.println(o);

        Person person1 = new Person("Vasily", 15,
                Sex.MALE, "Belarus", 220000);
        System.out.println(person1);
        Person person2 = new Person("Vasily", 15,
                person1.getCountry(), Sex.MALE);
        System.out.println(person2);


        //12398698124
        //12398936124
        //1A03FB9
        //1A34FF0
    }
}
