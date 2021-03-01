package Lection16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Data.txt"));
            while (true) {
                String s =in.next();
                if (s.equals("Exit")) break;
                else bw.write(s + "\n");
            }
            bw.close();
        }
        catch(IOException e) {
            e.printStackTrace();


        }

    }
}
