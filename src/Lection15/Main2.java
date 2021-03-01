package Lection15;

import HMLection14.Book;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book 1", "Author 1"));
        books.add(new Book(2, "Book 2", "Author 2"));
        books.add(new Book(3, "Book 3", "Author 3"));

        for (Book b : books) {
            System.out.println(b.getData());
        }
    }
}
