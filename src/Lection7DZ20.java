import java.util.Scanner;

public class Lection7DZ20 {
    public static void main (String[] args) {
        int [] winter = {1,2,12};
        int [] spring = {3,4,5};
        int [] summer = {6,7,8};
        int [] autumn = {9,10,11};
        method(winter, spring, summer, autumn);
    }
    public static void method (int [] winter, int [] spring, int [] summer, int [] autumn) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int a = in.nextInt();
        for(int i=0; i<winter.length; i++) {
            if (a == winter[i]) {
                System.out.println("Winter");
            }
        }
        for (int i=0; i< spring.length; i++) {
            if (a == spring[i]) {
                System.out.println("Spring");
            }
        }
        for (int i=0; i< spring.length; i++) {
            if (a == summer[i]) {
                System.out.println("Summer");
            }
        }
        for (int i=0; i< spring.length; i++) {
            if (a == autumn[i]) {
                System.out.println("Autumn");
            }
        }
    }
}
