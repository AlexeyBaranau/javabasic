package lesson8_homework.util;

import lesson8_homework.domain.Book;
import lesson9_exceptions.ResourceNotFoundException;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ExceptionsUtil {

    public static Book searchInBooks (String query, LinkedList<Book> books) {
        for (Book book : books) {
            if (book.getBookAuthorName().contains(query)){
                return book;
            }
        }
        throw new ResourceNotFoundException("This book`s author name not found by query " + query);
    }
}
