import java.util.Scanner;

public class Lection3DZ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
//        int bcount = 0;
        int csum = 0;
        String d = "Сумма нечетных элементов = ";
        while (a != 0) {
            if ((a % 2) != 0) {
                csum = a + csum;
            }
            a = in.nextInt();
//            bcount++;
        }
        System.out.println(d + csum);
    }
}