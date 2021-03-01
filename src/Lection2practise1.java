import java.util.Scanner;
public class Lection2practise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your ball");
        int ball = in.nextInt();
        if (ball >= 90) System.out.println("Grade = A"); // балл должен быть больше или равен 90
        else if (ball>=75) System.out.println("Grade = B"); // балл должен быть меньше 90 и больше или равно 75
        else if (ball >= 60) System.out.println("Grade = C");
        else if (ball >= 50) System.out.println("Grade  = D");
        else System.out.println("Grade = F");
    }
}
