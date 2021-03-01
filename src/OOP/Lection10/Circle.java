package OOP.Lection10;

public class Circle extends Shape {
    double radius;

    public Circle () {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea (double radius){
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetr() {
        return 0;
    }
}
