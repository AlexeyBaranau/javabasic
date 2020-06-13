package lesson8_homework;

import lesson8_homework.domain.Book;
import lesson8_homework.domain.Student;
import lesson8_homework.util.StudentsUtilClass;
import lesson8_homework.util.UtilClass;
import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;

import static lesson8_homework.util.StudentsUtilClass.*;
import static lesson8_homework.util.UtilClass.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("**********************TASK1**********************");
        System.out.println();
        LinkedList<Book> booksLinkedList = generateLinkedListBooks(20);
        System.out.println("Books list:");
        for (Book book : booksLinkedList) {
            System.out.println(book);
        }
        booksLinkedList.remove(7);
        System.out.println();
        System.out.println("Books list after removing book # 7");
        for (Book book : booksLinkedList) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("**********************TASK2**********************");
        System.out.println();
        Set<Book> booksSet = generateSetBooks(25);
        System.out.println("Books Set size:");
        System.out.println(booksSet.size());
        char [] vowels = {'A', 'E', 'I', 'O', 'U'};
        System.out.println("Books Set starting with a vowel:");
        for (Book book : booksSet) {
            char firstLetter = book.getBookName().charAt(0);
            for (char vowel : vowels) {
                if (firstLetter == vowel) {
                    System.out.println(book);
                }
            }
        }

        System.out.println();

        System.out.println("**********************TASK3**********************");
        System.out.println();
        LinkedList<Book> booksLinkedListforSort = generateLinkedListBooks(25);
        System.out.println("BooksLinkedListSort by bookname");
        booksLinkedList.sort(Comparator.comparing(Book::getBookName));
        for (Book book : booksLinkedList) {
            System.out.println(book);}
        System.out.println();
        System.out.println("BooksLinkedListSort by BookAuthorName");
        booksLinkedList.sort(Comparator.comparing(Book::getBookAuthorName));
        for (Book book : booksLinkedList) {
            System.out.println(book);  }
        System.out.println();
        System.out.println("BooksLinkedListSort by BookAuthorMiddleName");
        booksLinkedList.sort(Comparator.comparing(Book::getBookAuthorMiddleName));
        for (Book book : booksLinkedList) {
            System.out.println(book);  }
        System.out.println();
        System.out.println("BooksLinkedListSort by BookAuthorSurname");
        booksLinkedList.sort(Comparator.comparing(Book::getBookAuthorSurname));
        for (Book book : booksLinkedList) {
            System.out.println(book);  }

        System.out.println();

        System.out.println("**********************TASK4**********************");
        System.out.println();
        Set <Student> studentsSet = generateStudentSet(20);
        System.out.println("Students list:");
        for (Student student : studentsSet) {
            System.out.println(student);
        }
        System.out.println("Student set size: " + studentsSet.size());
        System.out.println();
        System.out.println("List of even students:");
        for (Student student : studentsSet) {
            int studentId = student.getStudentId();
            if (studentId % 2 == 0 && studentId != 0) {
                System.out.println(student);
            }
            else {
                studentsSet.remove(student);
            }
        }
        System.out.println("Student set size: " + studentsSet.size());
}
}