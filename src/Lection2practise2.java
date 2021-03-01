import java.util.Scanner;
public class Lection2practise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n:");
        int n = in.nextInt();
        if (n>=10&&n<=20) System.out.println("Yes");
        else System.out.println("No");
    }
}
