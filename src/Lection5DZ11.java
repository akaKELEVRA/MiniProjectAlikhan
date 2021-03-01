import java.util.Scanner;

public class Lection5DZ11 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.next();
        System.out.print("Введите букву: ");
        String s1 = in.next();
        String c = "Количество раз которые заданная буква встречается в заданном слове: ";
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            int index = s.indexOf(s1);
            if (index>=0) {
                count++;
            }
        }
        System.out.print(c+count);
    }
}
