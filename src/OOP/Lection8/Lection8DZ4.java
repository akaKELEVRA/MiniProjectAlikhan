package OOP.Lection8;

import java.util.Scanner;

public class Lection8DZ4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Player [] players = new Player[5];
        players [0] = new Player (1, "Thibaut", "Courtois", "Goalkepeer");
        players [1] = new Player (4, "Sergio", "Ramos", "Centre-Back");
        players [2] = new Player (6, "Nacho", "Fernandez", "Centre-Back");
        players [3] = new Player (10, "Luka", "Modric", "Centre Midfield");
        players [4] = new Player (9, "Karim", "Benzema", "Centre-Forward");
        Player [] players1 = new Player[5];
        players1 [0] = new Player(1, "Marc-Andre", "ter Stegen", "Goalkepeer");
        players1 [1] = new Player(3, "Gerard", "Pique", "Centre-Back");
        players1 [2] = new Player(18, "Jordi", "Alba", "Centre-Back");
        players1 [3] = new Player(1, "Sergio", "Busquets", "Centre Midfield");
        players1 [4] = new Player(10, "Lionel", "Messi", "Forward");
//        Club [][] clubs = new Club ("Real Madrid", "Spain", 100, Player();
//        Club [][] clubs1 = new Club ("Barcelona", "Spain", 90, Player[] players1 [5]);
//        for (int i=0; i<clubs.length; i++) {
//            for (int j=0; j<clubs[i].length;j++) {
//                System.out.println(players.toString());
//            }
//        }
    }
}
