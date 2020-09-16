package by.belhard.j24.homeworks.hw5.task01_2;

public class Cartoteka {

    private final Book[] books;

    public Cartoteka(Book... books) {
        this.books = books;
    }

    public Book[] getBooksByAuthor(String firstname, String lastname) {

        Book[] result = new Book[books.length];
        int i = 0;

        for (Book book : books) { // итерируемся по всем книгам
            for (Author author : book.getAuthors()) { // итерируемся по всем авторам текущей книги book
                if (author.getFirstName().equals(firstname) &&
                        author.getLastName().equals(lastname)) {
                    result[i] = book;
                    i++; // i += 1; // i = i + 1;
                    break;
                }
            }
        }

        return result;
    }
}
