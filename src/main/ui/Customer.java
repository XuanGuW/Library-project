package main.ui;

import java.util.List;

public class Customer {
    String name;
    Integer phoneNumber;
    List<RegularBook> myBooks;

    public Customer(String name, Integer phoneNumber, List<RegularBook> myBooks) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.myBooks = myBooks;
    }

    //REQUIRES: the book is in the library
    //MODIFIES: book and this
    //EFFECTS: a customer borrow a book

    public void borrow(RegularBook regularBook) {
        if (regularBook.getBorrower() == null) {
            regularBook.availability = false;
            regularBook.borrower = this;
            myBooks.add(regularBook);
        } else {
            System.out.println("Sorry, this book is not available.");
        }
    }

    //REQUIRES: The book was lent out by the library
    //MODIFIES: book and this and book.getBorrower
    //EFFECTS: return a book to the library
    public void returnBook(RegularBook regularBook) {
        if (regularBook.borrower == this) {
            regularBook.availability = true;
            regularBook.borrower = null;
            myBooks.remove(regularBook);


        }
    }


    public List<RegularBook> getMyBooks() {
        return myBooks;
    }
}

