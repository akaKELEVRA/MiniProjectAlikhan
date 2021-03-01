package HMLection17;

import OOP.Lection8.Player;

import java.io.Serializable;

public class Players implements Serializable {
    String nickName;
    double rating;

    public Players(String nickName, double rating) {
        this.nickName = nickName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Players{" +
                "nickName='" + nickName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
