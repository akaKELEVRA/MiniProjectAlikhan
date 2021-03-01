import java.util.Scanner;

public class Lection6DZ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        int [][] arr = new int [n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.println("Введите значение для [" + i + "][" + j + "]");
                arr[i][j] = in.nextInt();
            }
        }
        int max = arr[0][0];
        int maxi1 = 0;
        int maxi2 = 0;
        String a = "Значение MAX элемента = ";
        String b = "Индекс значения MAX элемента = ";
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxi1 = i;
                    maxi2 = j;
                }
            }
            System.out.println();
        }
        System.out.println(a+max);
        System.out.println(b + maxi1 + " " + maxi2);
    }
}