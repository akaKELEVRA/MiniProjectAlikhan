package HMLection16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<GoodItem> items = new ArrayList<>();
        while (true) {
            System.out.println("[1] TO LIST GOODS");
            System.out.println("[2] TO BUY GOOD");
            System.out.println("[3] TO LIST BY HISTORY");
            System.out.println("[0] TO EXIT");
            String choice = in.next();
            if (choice.equals("1")) {
                System.out.println("ENTER NAME:");
                String name = in.next();
                System.out.println("ENTER PRICE:");
                int price = in.nextInt();
                items.add(new GoodItem(name, price));
//                saveItems();
            }
            if (choice.equals("2")) {
                for (GoodItem gi : items) {
                    System.out.println(gi);
                }
            }
            if (choice.equals("3")) {
                System.out.println("ENTER INDEX OF DELETING ITEM: ");
                int index = in.nextInt();
                if (index<items.size()) {
                    items.remove(index);

                }
            }
            if (choice.equals("0")) {
                break;
            }
        }
    }
}
