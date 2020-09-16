package by.belhard.j24.homeworks.hw5.task01_2;

import java.util.Arrays;

public class Book {

    private static final int DEFAULT_PAGES_QUANTITY = 3;
    private static final String DEFAULT_BOOK_TITLE = "default title";

    private final String title;
    private int pages;
    private final BookFormat format;
    private Author[] authors;

    public Book(String title, int pages, BookFormat format, Author author, Author... authors) {

        if (title == null || title.isEmpty())
            title = DEFAULT_BOOK_TITLE;
        this.title = title;
        if (!validatePages(pages))
            pages = DEFAULT_PAGES_QUANTITY;

        this.pages = pages;
        this.format = format;
        this.authors = new Author[authors.length + 1];
        this.authors[0] = author;
        System.arraycopy(authors, 0, this.authors, 1, authors.length);
    }

    @Override
    public String toString() {

        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", format=" + format +
                ", authors=" + Arrays.toString(authors) +
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

    public Author[] getAuthors() {

        return authors;
    }
}
