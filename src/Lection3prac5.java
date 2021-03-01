import java.util.Scanner;
public class Lection3prac5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        while (n!=0){
            n = in.nextInt();
            if (n>max) max = n;
        }
        System.out.println(max);
    }
}
