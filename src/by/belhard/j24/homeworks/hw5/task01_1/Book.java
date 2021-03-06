package by.belhard.j24.homeworks.hw5.task01_1;

public class Book {

    private static final int DEFAULT_PAGES_QUANTITY = 3;
    private static final String DEFAULT_BOOK_TITLE = "default title";

    private final String title;
    private int pages;
    private final BookFormat format;
    private final Author author;

    public Book(String title, int pages, BookFormat format, Author author) {
        if (title == null || title.isEmpty())
            title = DEFAULT_BOOK_TITLE;
        this.title = title;
        if (!validatePages(pages))
            pages = DEFAULT_PAGES_QUANTITY;

        this.pages = pages;
        this.format = format;
        this.author = author;
    }

    public Book(String title, int pages, BookFormat format, String firstName, String lastName) {
        this(title, pages, format, new Author(firstName, lastName));
    }

    @Override
    public String toString() {

        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", format=" + format +
                ", author=" + author +
                '}';
    }

    public void setPages(int pages) {

        if (!validatePages(pages))
            pages = DEFAULT_PAGES_QUANTITY;

        this.pages = pages;
    }

    private boolean validatePages(int pages) {

        return pages >= DEFAULT_PAGES_QUANTITY;
    }
}
