import java.util.Scanner;
public class Lection2DZ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение числа: ");
        int a = in.nextInt();
        System.out.println();
        if (a<=2019) {
            System.out.println("No");
        } else if (a >= 2021){
            System.out.println("Yes");
        } else if (a == 2020) {
            System.out.println("ERROR");
        }
    }
}
