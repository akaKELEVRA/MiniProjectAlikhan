package OOP.Lection8;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player [] players;

    public Club() {}

    public Club (String name, String country, int ratingPoints) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRatingPoints() {
        return ratingPoints;
    }
    public void setRatingPoints(int ratingPoints) {
        this.ratingPoints = ratingPoints;
    }

    public Player[] getPlayers() {
        return players;
    }
    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
