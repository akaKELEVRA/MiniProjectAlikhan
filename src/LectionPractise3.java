import java.util.Scanner;
public class LectionPractise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int u = 420;
        int e = 490;
        int g = 550;
        System.out.println("Insert amount in KZT:");
        int a = in.nextInt();
        System.out.println("Choose currency:");
        System.out.println("[1] USD");
        System.out.println("[2] EUR");
        System.out.println("[3] GBP");
        int choice = in.nextInt();
        if (choice==1) System.out.println((double)a/u + " USD");
        if (choice==2) System.out.println((double)a/e + " EUR");
        if (choice==3) System.out.println((double)a/g + " GBP");
    }
}
