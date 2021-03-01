package Lection15;

import java.util.ArrayList;

public class Main3 {
    public static void main (String[] args) {
        ArrayList<Players> playersArrayList = new ArrayList<>();
        playersArrayList.add(new Players("Player 1", 1000, 25));
        playersArrayList.add(new Players("Player 2", 1100, 26));
        playersArrayList.add(new Players("Player 3", 1050, 24));
        playersArrayList.add(new Players("Player 4", 1250, 23));
        playersArrayList.add(new Players("Player 5", 1350, 27));
        playersArrayList.add(new Players("Player 6", 1150, 28));
        playersArrayList.add(new Players("Player 7", 1750, 21));
        playersArrayList.add(new Players("Player 8", 900, 22));
        playersArrayList.add(new Players("Player 9", 1050, 29));
        playersArrayList.add(new Players("Player 10", 1450, 30));
        int averageCost = 0;
        int sumOfcost = 0;
        int sumOfages = 0;
        for (Players p : playersArrayList) {
            sumOfcost += p.getPrice();
            sumOfages += p.getAge();
        }
        System.out.println("Среднее значение цены = " + (averageCost = sumOfcost / playersArrayList.size()));
        System.out.println("Сумма возрастов игроков =  "+ sumOfages);
    }
}
