package by.belhard.j24.lessons.lesson06.equalsExample;

import java.util.Objects;

public class Country {

    private String title;

    public Country(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(title, country.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
