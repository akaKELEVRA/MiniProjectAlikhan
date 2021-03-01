import java.util.Scanner;
public class Mathprac9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number of bytes:");
        int by = in.nextInt();
        int kb = by / 1024;
        String a = "Result = ";
        String b = "KB";
        System.out.println(a + kb +b);
        System.out.println();
        System.out.println("Insert number of bytes:");
        int by1 = in.nextInt();
        int kb1 = by1 / 1024;
        System.out.println(a + kb1 +b);
    }
}
