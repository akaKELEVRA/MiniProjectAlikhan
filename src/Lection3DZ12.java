import java.util.Scanner;

public class Lection3DZ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = in.nextInt();
        String b = "Натуральные делители числа x: ";
        for (int i=1; i<=x; i++) {
            if ((x%i) == 0){
                System.out.println(b + i);
            }
        }
    }
}
