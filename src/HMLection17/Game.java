package HMLection17;

import Lection17.Subject;
import OOP.Lection8.Player;


import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    String gameName;
    String ipAddress;
    int port;
    ArrayList<Players> players = new ArrayList<Players>();

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public String getAllPlayers () {
        String s = "";
        for (Players player : players ) {
            s = s + "\n\t" + players;
        }
        return s;
    }

    public void addPlayer (Players player) {
        players.add(player);
    }

    @Override
    public String toString() {
        return gameName + " " + ipAddress + " " + port + " " + getAllPlayers();
    }
}
