package lesson8_homework.util;

import lesson8_homework.domain.Book;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class UtilClass {

    public static final String[] bookNames = {"War and Peace", "The Gambler", "The Master and Margarita",
            "And Quite Flows the Don", "A Hero of Our Time", "Captain's Daughter", "Fathers and Sons", "The Auditor",
            "Lolita", "Repka", "Baggage", "Anna Karenina", "Evgeniy Onegin", "Crime and Punishment", "Idiot", "Viy",
            "Taras Bulba", "Evenings on a Farm Near Dikanka"};
    public static final String[] bookAuthorNames = {"Lev", "Fedor", "Mihail", "Ivan", "Anton", "Alexander", "Nikolay",
            "Vladimir", "Alexey", "Samuil"};
    public static final String[] bookAuthorMiddleNames = {"Alexandrovich", "Alekseevich", "Ivanovich", "Petrovich",
            "Dmitrievich", "Evgenievich", "Pavlovich", "Denisovich", "Antonovich", "Victorovich"};
    public static final String[] bookAuthorSurnames = {"Tolstoy", "Dostoevskiy", "Bulgakov", "Sholokhov", "Lermontov",
            "Pushkin", "Turgenev", "Gogol", "Nabokov", "Tolstoy", "Marshak", "Mayakovskiy"};

    public static String generateBookName() {
        int namePosition = new Random().nextInt(bookNames.length);
        return bookNames[namePosition];
    }

    public static String generateBookAuthorName() {
        int authorNamePosition = new Random().nextInt(bookAuthorNames.length);
        return bookAuthorNames[authorNamePosition];
    }

    public static String generateBookAuthorMiddleName() {
        int authorMiddleNamePosition = new Random().nextInt(bookAuthorMiddleNames.length);
        return bookAuthorMiddleNames[authorMiddleNamePosition];
    }


    public static String generateBookAuthorSurname() {
        int authorSurnamePosition = new Random().nextInt(bookAuthorSurnames.length);
        return bookAuthorSurnames[authorSurnamePosition];
    }

    public static Book generateBook(long id) {
        Book book = new Book();
        book.setBookId(id);
        book.setBookName(generateBookName());
        book.setBookAuthorMiddleName(generateBookAuthorMiddleName());
        book.setBookAuthorName(generateBookAuthorName());
        book.setBookAuthorSurname(generateBookAuthorSurname());
        return book;
    }

    public static Book generateSameBook(long id) {
        Book book = new Book();
        book.setBookId(id);
        book.setBookName("Java 8");
        book.setBookAuthorName("Herbert");
        book.setBookAuthorMiddleName("The");
        book.setBookAuthorSurname("Schildt");
        return book;
    }

    public static LinkedList<Book> generateLinkedListBooks(int booksCount) {
        LinkedList<Book> books = new LinkedList<>();
        for (int i = 0; i < booksCount; i++) {
            books.add(generateBook(i));
        }
        return books;
    }

    public static HashSet<Book> generateSetBooks(int booksCount) {
        HashSet<Book> setBooks = new LinkedHashSet<>();
        for (int i = 0; i < booksCount - 6; i++) {
            setBooks.add(generateBook(i));
        }
        setBooks.add(generateSameBook(19));
        setBooks.add(generateSameBook(20));
        setBooks.add(generateSameBook(21));
        setBooks.add(generateSameBook(22));
        setBooks.add(generateSameBook(23));
        setBooks.add(generateSameBook(24));
        return setBooks;
    }
}