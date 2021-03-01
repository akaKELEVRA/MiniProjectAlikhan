package HMLection16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<GoodItem> items = getItems();
        while (true) {
            System.out.println("[1] TO ADD ITEM");
            System.out.println("[2] TO LIST ITEMS");
            System.out.println("[3] TO DELETE ITEM");
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

    public static ArrayList<GoodItem> getItems() throws IOException {
        ArrayList<GoodItem> items = new ArrayList<>();
        if ((new File("goodItems.txt").exists())) {
            BufferedReader br = new BufferedReader((new FileReader("goodItems.txt")));
            String name;
            while ((name = br.readLine()) != null) {
                int price = Integer.parseInt(br.readLine());

            }
        }
        return items;

    }

    public static void saveItems(ArrayList<GoodItem> get) {

    }
}
