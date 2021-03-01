import java.util.Scanner;

public class Lection5DZ15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.next();
        int count = 0;
        char [] ch = s.toCharArray();
        for (int i=0; i<ch.length; i++) {
            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
                count++;
            }
        }
        System.out.println("Количество гласных букв = " + count);
    }
}