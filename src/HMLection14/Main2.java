package HMLection14;

import java.util.Scanner;

public class Main2 {
    public static void main (String[] agrs) {
        Library libr1 = new Library("Central library", "Almaty");
        libr1.addBook(new Book (1, "For whom the bell talls", "Ernest Hemingway"));
        libr1.addBook(new Book (2, "The old man and the sea", "Ernest Hemingway"));
        libr1.addBook(new Book (3, "Idiot", "Fyodor Dostoevskiy"));
        libr1.addBook(null);
        libr1.addBook(new Book (4, "The white steamship", "Chinghiz Aitmatov"));
        libr1.addBook(new Book (5, "the white steamship 1", "Chinghiz Aitmatov 1"));
        libr1.printBooks();




    }
}
