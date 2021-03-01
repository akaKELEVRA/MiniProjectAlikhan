package OOP.Lection10;

import java.util.Scanner;

public class Lection10prac2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        FerrariEngine fer1 = new FerrariEngine(6, 12, 200);
        FerrariEngine fer2 = new FerrariEngine(5, 10, 180);
        FerrariEngine fer3 = new FerrariEngine(4, 8, 160);
        FerrariEngine fer4 = new FerrariEngine(3.5, 8, 150);
        FerrariEngine fer5 = new FerrariEngine(3, 6, 150);
        RenaultEngine ren1 = new RenaultEngine(3, 6, 200, 0.5);
        RenaultEngine ren2 = new RenaultEngine(2.5, 4, 180, 0.7);
        RenaultEngine ren3 = new RenaultEngine(4, 8, 210, 0.3);
        RenaultEngine ren4 = new RenaultEngine(4.4, 8, 250, 0.2);
        RenaultEngine ren5 = new RenaultEngine(1.6, 4, 120, 1.5);
        Engine [] engines = {fer1, fer2, fer3, fer4, fer5, ren1, ren2, ren3, ren4, ren5};
        for (int i=0; i< engines.length; i++) {
            System.out.println("MAX speed = " + engines[i].getMaxSpeed() + " km/h");
        }
    }
}
