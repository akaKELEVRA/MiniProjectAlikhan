package Lection14;

import java.util.Scanner;

public class Main4 {
    Book [] books;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book [] books = new Book [5];
        books[0] = new Book (1, "Abay's road", "Mukhtar Auezov");
        books[1] = null;
        books[2] = new Book (2, "For whom the bell tolls", "Ernest Hemingway");
        books[3] = new Book (3, "War and peace", "Lion Tolstoy");
        books[4] = new Book (4, "Idiot", "Fedor Dostoevskiy");

        try {

        }
        catch (Exception e) {

        }
        for (int i=0; i< books.length; i++) {
            System.out.println(books[i].getData());
        }
    }


}
