import java.util.Scanner;
public class Lection2DZ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "1 - Science";
        String b = "2 - Humanitarian subjects";
        String c = "3 - Art";
        String d = "4 - Sport";
        String a1 = "1 - Math";
        String a2 = "2  Physics";
        String b1 = "1 - History";
        String b2 = "2 - Foreign languages";
        String c1 = "1 - Drawing";
        String c2 = "2 - Singing";
        String d1 = "1 - Team";
        String d2 = "2 - Individual";
        String e = "Choose your branch:";
        String e1 = "Choose next branch:";
        String a11 = "You are Financier";
        String a21 = "You are Engineer";
        String b11 = "You are Historic or Diplomat";
        String b21 = "You are Translator";
        String c11 = "You are Painter or Architect";
        String c21 = "You are Singer or Tamada";
        String d11 = "You are Footballer or Basketball player";
        String d21 = "You are boxer or tennis player";
        System.out.println();
        System.out.println(e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        int ch = in.nextInt();
        if (ch == 1) {
            System.out.println(e1);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println();
            int ch1 = in.nextInt();
            if (ch1 == 1) {
                System.out.println(a11);
            } else if (ch1 == 2) {
                System.out.println(a21);
            }
        }
        if (ch == 2) {
            System.out.println(e1);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println();
            int ch1 = in.nextInt();
            if (ch1 == 1) {
                System.out.println(b11);
            } else if (ch1 == 2){
                System.out.println(b21);
            }
        }
        if (ch == 3) {
            System.out.println(e1);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println();
            int ch1 = in.nextInt();
            if (ch1 == 1) {
                System.out.println(c11);
            } else if (ch1 == 2) {
                System.out.println(c21);
            }
        }
        if (ch == 4) {
            System.out.println(e1);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println();
            int ch1 = in.nextInt();
            if (ch1 == 1) {
                System.out.println(d11);
            } else if (ch1 == 2) {
                System.out.println(d21);
            }
        }
    }
}
