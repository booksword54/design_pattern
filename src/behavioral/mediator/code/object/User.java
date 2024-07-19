package behavioral.mediator.code.object;

import behavioral.mediator.code.mediator.ChatRoom;

public class User {

    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

}
