package by.belhard.j24.homeworks.hw5.task01_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Title1", 100, BookFormat.A3,
                new Author("fn1", "ln1"),
                new Author("fn2", "ln2"),
                new Author("fn3", "ln3"));

        Book book2 = new Book("Title2", 100, BookFormat.A3, new Author("fn1", "ln1"));
        Book book3 = new Book("Title3", 100, BookFormat.A3, new Author("fn2", "ln2"));
        Book book4 = new Book("Title4", 100, BookFormat.A3, new Author("fn3", "ln3"));
        Book book5 = new Book("Title5", 100, BookFormat.A3,
                new Author("fn1", "ln1"),
                new Author("fn2", "ln2"));
        Book book6 = new Book("Title6", 100, BookFormat.A3,
                new Author("fn1", "ln2"),
                new Author("fn2", "ln1"));
        Book book7 = new Book("Title7", 100, BookFormat.A3, new Author("fn3", "ln3"));

        Cartoteka cartoteka = new Cartoteka(book1, book2, book3, book4, book5, book6, book7);

        System.out.println(Arrays.toString(cartoteka.getBooksByAuthor("fn2", "ln1")));
    }
}
