package by.belhard.j24.lessons.lesson06.equalsExample;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private Country country;

    public Person(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(country, person.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, country);
    }
}
