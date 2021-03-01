import java.util.Scanner;

public class Lection7DZ5 {
    public static void main(String[] args) {
        int a = 0;
        counter(a);
    }
    public static void counter (int a) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String s = in.nextLine();
        System.out.print("Введите букву: ");
        String s1 = in.nextLine();
        for (int i=0; i<s.length(); i++) {
            if ((s.charAt(i)+"").equalsIgnoreCase(s1))
                a++;
        }
        System.out.print("Сколька раз встречается введенная буква в заданном слове = " + a);
    }
}
