import java.util.Scanner;
public class Mathprac13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = in.nextDouble();
        System.out.println("Введите следующее число");
        double b = in.nextDouble();
        double d = Math.sqrt(a*b);
        String e = "Среднее геометрическое = ";
        System.out.println(e + d);
    }
}
