package Lection14;

public class Library {
    String name;
    String city;
    private Book [] books = new Book[20];
    int index = 0;

    public Library(String name, String city, Book[] books, int index) {
        this.name = name;
        this.city = city;
        this.books = books;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
