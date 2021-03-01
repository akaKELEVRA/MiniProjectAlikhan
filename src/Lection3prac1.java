import java.util.Scanner;
public class Lection3prac1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int i = n;
        while (i<=m) {
            System.out.println(i+"  "+ i*i);
            i++;
        }
    }
}
