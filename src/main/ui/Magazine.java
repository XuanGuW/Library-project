package main.ui;

public class Magazine implements Book {

    String name;
    String publishYear;

    public Magazine(String name, Integer publishYear) {
        this.name = name;
        this.publishYear = publishYear.toString();

    }




    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public Customer getBorrower() {
        return null;
    }



}
