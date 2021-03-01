package OOP.Lection10;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimetr();
    public void showInfo() {
        System.out.println("Area is equal to " + getArea() + " m2");
        System.out.println("Perimetr is equal to " + getPerimetr() + " m");
    }
}
