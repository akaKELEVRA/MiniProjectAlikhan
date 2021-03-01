import java.util.Scanner;
public class Lection2DZ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую координату для ладьи: ");
        int a = in.nextInt();
        System.out.println("Введите вторую координату для ладьи: ");
        int b = in.nextInt();
        System.out.println("Введите первую координату другой фигуры: ");
        int c = in.nextInt();
        System.out.println("Введите вторую координату другой фигуры: ");
        int d = in.nextInt();
        System.out.println();
        if (a == c) {
            System.out.println("Yes");
        } else if (b == d) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
