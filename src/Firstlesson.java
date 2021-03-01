import java.util.Scanner;
public class Firstlesson{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number:");
        int a = in.nextInt();
        System.out.println("Insert second number:");
        int b = in.nextInt();
        int e = a;
        a = b;
        b = e;
        String c = "a = ";
        String d = "b = ";
        System.out.println(c + a);
        System.out.println(d + b);
        System.out.println();
        System.out.println("Insert number:");
        int a1 = in.nextInt();
        System.out.println("Insert second number:");
        int b1 = in.nextInt();
        int e1 = a1;
        a1 = b1;
        b1 = e1;
        String c1 = "a = ";
        String d1 = "b = ";
        System.out.println(c1 + a1);
        System.out.println(d1 + b1);
    }
}
