package Lection19;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    String userName;
    String messageText;
    Date sentDate;

    public MessageData() {}

    public MessageData(String userName, String messageText) {
        this.userName = userName;
        this.messageText = messageText;
        this.sentDate = new Date();
    }

    @Override
    public String toString() {
        return "\"" + messageText + "\" from " + userName + " at " + sentDate;
    }
}
