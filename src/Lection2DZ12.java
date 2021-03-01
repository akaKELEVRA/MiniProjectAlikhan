import java.util.Scanner;
public class Lection2DZ12 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите номер года: ");
    int a = in.nextInt();
    if (a%4 == 0) {
        System.out.println("Yes");
        }
    else System.out.println("No");
    }
}