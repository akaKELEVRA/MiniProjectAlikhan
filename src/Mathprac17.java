import java.util.Scanner;
public class Mathprac17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину ребра a:");
        int a = in.nextInt();
        System.out.println("Введите длину ребра b:");
        int b = in.nextInt();
        System.out.println("Введите длину ребра c:");
        int c = in.nextInt();
        int V = a * b * c;
        int S = 2 * (a*b + b*c + a*c);
        String V1 = "Объем параллелепипеда (V) = ";
        String S1 = "Площадь параллелепипеда (S) = ";
        System.out.println();
        System.out.println(V1 + V);
        System.out.println(S1 + S);
    }
}
