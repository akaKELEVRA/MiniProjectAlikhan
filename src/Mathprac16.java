import java.util.Scanner;
public class Mathprac16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x:");
        int x = in.nextInt();
        int y = 4*(x-3) - 7*(x-3) + 2;
        String a = "y = 4*(x-3) - 7*(x-3) + 2 = ";
        System.out.println(a + y);
    }
}
