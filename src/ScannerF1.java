import java.util.Scanner;
public class ScannerF1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        String name = in.next();
        System.out.println(a*a);
        System.out.println(b*b);
        System.out.println("My name is "+name);
    }
}
