import java.util.Scanner;
public class Mathprac14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину окружности L:");
        int L = in.nextInt();
        double pi = 3.14;
        double R = L / (2*pi);
        double S = pi * Math.pow(R,2);
        String a = "Радиус окружности = ";
        String b = "Площадь круга = ";
        System.out.println(a + R);
        System.out.println(b+S);
    }
}
