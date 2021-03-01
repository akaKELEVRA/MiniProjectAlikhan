import java.util.Scanner;

public class Lection7DZ6 {
    public static void main (String[] args) {
        int a = 0;
        counter(a);
    }
    public static void counter (int a) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.nextLine();
        char [] ch = s.toCharArray() ;
        for (int i=0; i<ch.length; i++) {
            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
                a++;
            }
        }
        System.out.println("Количество гласных букв = " + a);
    }
}
