import java.util.Scanner;
public class Lection3DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert n:");
        int n = in.nextInt();
        int a = 0;
        System.out.println();
        while (a<=10) {
            System.out.print(n+" ");
            a++;
        }
    }
}