import java.util.Scanner;
public class Lection3prac4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        int sum = 0;
        while (n!=0) {
            sum = sum+n;
            n = in.nextInt();
            counter++;
        }
        System.out.println("Количество = "+counter);
        System.out.println("Сумма = "+sum);
        System.out.println("Среднее значение = " + (double)sum/counter);
    }
}
