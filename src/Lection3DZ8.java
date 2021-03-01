import java.util.Scanner;
public class Lection3DZ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        int maxi = n;
        String maxis = "Максимальное значение = ";
        while (n != 0) {
            n = in.nextInt();
            if (n>maxi) maxi = n;
            }
        System.out.println();
        System.out.println(maxis+maxi);
    }
}
