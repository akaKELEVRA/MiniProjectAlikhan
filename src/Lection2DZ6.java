import java.util.Scanner;
public class Lection2DZ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int day = in.nextInt();
        System.out.println();
        String dayValue = "";
        switch(day) {
            case 1: dayValue = "Monday";
            break;
            case 2: dayValue = "Tuesday";
            break;
            case 3: dayValue = "Wednesday";
            break;
            case 4: dayValue = "Thursday";
            break;
            case 5: dayValue = "Friday";
            break;
            case 6: dayValue = "Saturday";
            break;
            case 7: dayValue = "Sunday";
            break;
            default: dayValue = "No day";
        }
        System.out.println(dayValue);
    }
}
