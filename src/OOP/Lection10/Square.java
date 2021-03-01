package OOP.Lection10;

public class Square extends Shape{
    double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public double Area(double width) {
        return Math.pow(width, 2);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetr() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
