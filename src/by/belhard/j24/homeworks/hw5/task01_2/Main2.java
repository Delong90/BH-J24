package by.belhard.j24.homeworks.hw5.task01_2;

public class Main2 {

    public static void main(String[] args) {

        Book book1 = new Book("Title2", 100, BookFormat.A3,
                new Author("fn1", "ln1"),
                new Author("fn2", "ln2"),
                new Author("fn3", "ln3"));

        Book book2 = new Book("Title3", 100, BookFormat.A3, new Author("fn1", "ln1"));

        System.out.println(book1);
        System.out.println(book2);
    }
}
