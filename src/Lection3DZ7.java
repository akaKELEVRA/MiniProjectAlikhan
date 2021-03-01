import java.util.Scanner;
public class Lection3DZ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        int bcount = 0;
        int asum = 0;
        String amount = "Количество = ";
        String average = "Среднее значение = ";
        while (n != 0) {
            asum = asum+n;
            n = in.nextInt();
            bcount++;
        }
        System.out.println(amount+bcount);
        System.out.println(average+(double)asum/bcount);
    }
}
