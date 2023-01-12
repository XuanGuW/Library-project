package main.ui;

import java.util.ArrayList;
import java.util.List;

public class Library implements Books {
    public List<Book> availableNormalBooks;
    int size;

    public Library() {
        this.availableNormalBooks = new ArrayList();
        this.size = 0;

    }

    //MODIFIES: this
    //EFFECTS: add a book to the library unless it was already added, in which case do nothing
    @Override
    public void addABook(Book book) {
        if (!availableNormalBooks.contains(book)) {
            availableNormalBooks.add(book);
        }
    }



    //REQUIRES: there are books in the library
    //MODIFIES: this
    //EFFECTS: print out a list of books
    @Override
    public void getBooks() {
        for (Book b : availableNormalBooks) {
//            System.out.println("Book name: " + "<" + b.name + ">" + "\nAuthor's name: " + b.author);
            toString();

        }
    }


    //EFFECTS: check if the library contains the book
    @Override
    public boolean contains(Book book) {
        return availableNormalBooks.contains(book);
    }


    //EFFECTS: return the number of books
    @Override
    public int booksNumber() {
        return availableNormalBooks.size();
    }


}

