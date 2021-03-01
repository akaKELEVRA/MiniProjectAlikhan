import java.util.Scanner;

public class Lection5DZ16 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.next();
        int sum = 0;
//        char [] ch = s.toCharArray();
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) == true) {
//                sum = sum+ch[i];
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Сумма цифр в тексте = " + sum);
    }
}
