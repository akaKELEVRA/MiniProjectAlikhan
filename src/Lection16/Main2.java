package Lection16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
        String s;
        while ((s=br.readLine()) != null) {
            System.out.println(s);
        }

    }
}
