package lesson8_homework.domain;

import java.util.Objects;

public class Book {
    private Long bookId;
    private String bookAuthorName;
    private String bookAuthorSurname;
    private String bookName;
    private String bookAuthorMiddleName;


    public Book() {
    }

    public Book(Long bookId, String bookAuthorName, String bookAuthorSurname, String bookName) {
        this.bookId = bookId;
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorSurname = bookAuthorSurname;
        this.bookName = bookName;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {        this.bookId = bookId;    }

    public String getBookAuthorName() {        return bookAuthorName;    }

    public void setBookAuthorName(String bookAuthorName) {        this.bookAuthorName = bookAuthorName;    }

    public String getBookAuthorSurname() {        return bookAuthorSurname;    }

    public void setBookAuthorSurname(String bookAuthorSurname) {        this.bookAuthorSurname = bookAuthorSurname;    }

    public String getBookName() {        return bookName;    }

    public void setBookName(String bookName) {        this.bookName = bookName;    }

    public String getBookAuthorMiddleName() {        return bookAuthorMiddleName;    }

    public void setBookAuthorMiddleName(String bookAuthorMiddleName) { this.bookAuthorMiddleName = bookAuthorMiddleName; }

    @Override
    public String toString() {
        return "Book №" +
                " " + bookId +
                "\t \"" + bookName + "\"" +
                "\t " + bookAuthorName +
                " " + bookAuthorMiddleName +
                " " + bookAuthorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  Objects.equals(bookAuthorName, book.bookAuthorName) &&
                Objects.equals(bookAuthorSurname, book.bookAuthorSurname) &&
                Objects.equals(bookAuthorMiddleName, book.bookAuthorMiddleName) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookAuthorName, bookAuthorMiddleName, bookAuthorSurname, bookName);
    }
}
