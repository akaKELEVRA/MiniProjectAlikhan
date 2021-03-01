import java.util.Scanner;

public class Lection7DZ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.nextLine();
        palindrome(s);
    }
    public static void palindrome(String s) {
        char [] ch = s.toCharArray();
        String s1;
        for (int i=0; i< ch.length; i++) {
            if(ch[i] == ch[ch.length - 1 - i]) {
                s1 = "Yes";
            }
            else {
                s1 = "No";
            }
            System.out.println(s1);
        }
//        int n = s.length();
//        boolean pal;
//        for (int i=0; i<n; i++) {
//            if (s.charAt(i) != s.charAt(n-i-1)) {
//                System.out.println("No");
//            }
//            else {
//                System.out.println("Yes");
//            }
//        }
//        System.out.println();
    }
}
