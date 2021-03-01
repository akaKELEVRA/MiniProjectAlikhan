import java.util.Scanner;
public class Lection2DZ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int usd = 420;
        int eur = 490;
        int gbp = 550;
        String a = "Insert amount in KZT: ";
        String b = "Choose currency";
        String c = "[1] USD";
        String d = "[2] EUR";
        String f = "[3] GBP";
        System.out.print(a);
        int kzt = in.nextInt();
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        int ch = in.nextInt();
        System.out.println();
        if (ch == 1) {
            System.out.println((double)kzt/usd + " USD");
        }
        if (ch == 2) {
            System.out.println((double)kzt/eur + " EUR");
        }
        if (ch == 3) {
            System.out.println((double)kzt/gbp + " GBP");
        }
    }
}
