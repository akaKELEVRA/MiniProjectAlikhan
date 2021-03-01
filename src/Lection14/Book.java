package Lection14;

public class Book {
    int id;
    String name;
    String author;

    public Book (int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData () {
        return id + ". " + name + " " + ".Author: " + author;
    }
//    public printBooks () {
//        for (int i=0; i<books.length; i++) {
//            try {
//                System.out.println("The book is empty");
//            }
//            catch (Exception e) {
//
//            }
//
//        }
//        return
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
