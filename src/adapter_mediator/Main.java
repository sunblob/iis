package adapter_mediator;

import adapter_mediator.adapter.Robot;
import adapter_mediator.adapter.RobotToUserAdapter;
import adapter_mediator.adapter.SimpleChatRobot;
import adapter_mediator.mediator.Admin;
import adapter_mediator.mediator.SimpleTextChat;
import adapter_mediator.mediator.SimpleUser;
import adapter_mediator.mediator.User;

public class Main {

    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        Robot robot = new SimpleChatRobot(chat, "Logger bot");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        chat.addUserToChat(new RobotToUserAdapter(robot));

        user1.sendMessage("Hello!");
        robot.sendRobotMessage("Im totally not a robot");
    }
}
