package org.practiceBasicCode.libraryMgmt;

/* Library Management System
 *  Throw OutOfException when no books avalb and if User try to borrow more than specified books throw a exception
 *Print book details with avaialablity status and borrowed books status with user
 * method which print list all books
 * method which add books
 * method to remove books
 * Book object which contains Title author status
 *
 * */

import java.util.*;

public class LIBRARYMANAGEMENT {
    public static void main(String[] args) throws OutOfStockException, ThresholdException {
        Library lib = new LibrarySystem();
        lib.addBook(new Book("Geeta", "Krishna"));
        lib.addBook(new Book("Geeta", "Krishna"));
        lib.addBook(new Book("Geeta", "Krishna"));
        lib.addBook(new Book("Geeta", "Krishna"));
        lib.addBook(new Book("Ramayana", "Tulsidas"));
        System.out.println("List of books : "+ lib.listOfBooks());
        lib.borrowBook("Deep","Geeta");
        lib.borrowBook("Deep","Geeta");
        lib.borrowBook("Deep","Geeta");
        lib.borrowBook("Deepa","Geeta");
//        lib.borrowBook("Deep","Geeta");
        lib.displayInventory();
    }
}

class Book {
    String title;
    String author;
    boolean status;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        status = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}

interface Library {
    int BookBorrowingThresholdValue = 3;

    Book addBook(Book book);

    void borrowBook(String user, String title) throws OutOfStockException, ThresholdException;

    List<Book> listOfBooks();

    void displayInventory();
}

class LibrarySystem implements Library {

    List<Book> booksList = new LinkedList<>();
    Map<String, Integer> booksCount = new HashMap<>();
    Map<String, List<String>> userBookMap = new HashMap<>();


    @Override
    public Book addBook(Book book) {
        if (booksCount.containsKey(book.getTitle())) {
            booksCount.put(book.getTitle(), booksCount.get(book.getTitle()) + 1);
        } else {
            booksList.add(book);
            booksCount.put(book.getTitle(), 1);
        }
        return book;
    }

    @Override
    public void borrowBook(String user, String title) throws OutOfStockException, ThresholdException {
        if (userBookMap.containsKey(user) && userBookMap.get(user).size() >= 3) {
            throw new ThresholdException(user + " already reached the borrow limit");
        } else if (isBookAvlb(title)) { // update book status
            List<String> tmpList = new ArrayList<>(userBookMap.getOrDefault(user, new ArrayList<>()));
            tmpList.add(title);
            userBookMap.put(user, tmpList);
            booksCount.put(title, booksCount.get(title) - 1);
            updateBookStatusInBookList(title);
        } else
            throw new OutOfStockException(title + " is not available, please check later");
    }

    @Override
    public List<Book> listOfBooks() {
        return booksList;
    }

    @Override
    public void displayInventory() {
        System.out.println("Book list : " + booksList);
        System.out.println("User and thier borrowed books : " + userBookMap);
    }

    // Utility methods
    boolean isBookAvlb(String title) {
        for (Book book : booksList) {
            if (book.title.equalsIgnoreCase(title)) {
                return book.status;
            }
        }
        return false;
    }

    private void updateBookStatusInBookList(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (booksCount.get(title) <= 0) book.status = false;
            }
        }
    }
}

// Custom Exceptions
class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

class ThresholdException extends Exception {
    ThresholdException(String msg) {
        super(msg);
    }
}
