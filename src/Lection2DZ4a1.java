import java.util.Scanner;
public class Lection2DZ4a1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение первого числа: ");
        int a = in.nextInt();
        System.out.print("Введите значение второго числа: ");
        int b = in.nextInt();
        String res = "Наименьшее число:";
        System.out.println();
        if (a<b){
            System.out.println(res+a);
        }
        else System.out.println(res+b);
    }
}
