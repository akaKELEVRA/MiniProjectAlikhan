package HMLection17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();

        while (true) {
            System.out.println("PRESS [1] TO CREATE GAME");
            System.out.println("PRESS [2] TO ADD PLAYER TO GAME");
            System.out.println("PRESS [3] TO PLAY GAME");
            System.out.println("PRESS [0] TO EXIT");
            while (true) {
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("INSERT GAME NAME:");
                    String gameName = in.next();
                    System.out.println("INSERT IP ADDRESS:");
                    String ipAddress = in.next();
                    System.out.println("INSERT PORT:");
                    int port = in.nextInt();
                    games.add(new Game(gameName, ipAddress, port));

                }
                if (choice == 2) {
                    System.out.println("CHOOSE GAME:");
                    for (Game gm : games) {
                        System.out.println(games.indexOf(gm) + " " + gm);
                    }
                    int index = in.nextInt();
                    System.out.println("INSERT NICKNAME:");
                    String nickName = in.next();
                    System.out.println("INSERT RATING:");
                    double rating = in.nextDouble();
                    games.get(index).addPlayer(new Players(nickName, rating));
                    saveGame(games);

                }
                if (choice == 3) {
                    System.out.println("CHOOSE GAME:");
                    int index = in.nextInt();
                    for (Game g : games) {
                        System.out.println(games.indexOf(g) + " " + g);
                    }
                    if (games.get(index).players.size() == 0) {
                        System.out.println(games.get(index) + "No players");
                    }
                    else {
                        System.out.println(games.get(index));
                    }
                }
                if (choice == 0) {
                    break;
                }
            }
        }
    }

    public static ArrayList<Players> getPlayers() throws IOException, ClassNotFoundException {
        ArrayList<Players> players = new ArrayList<>();
        File file = new File("settings.data");
        if (file.exists()) {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            ArrayList<Players> rePlayers = (ArrayList<Players>)  inputStream.readObject();
        }
        return players;
    }



    public static void saveGame (ArrayList<Game> games) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
        outputStream.writeObject(games);
    }
}
