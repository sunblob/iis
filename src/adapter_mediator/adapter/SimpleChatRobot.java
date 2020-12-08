package adapter_mediator.adapter;

import adapter_mediator.mediator.Chat;

public class SimpleChatRobot implements Robot {
    Chat chat;
    String name;

    public SimpleChatRobot(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendRobotMessage(String robotMessage) {
        chat.sendMessage(robotMessage + " BEEP BOOP", new RobotToUserAdapter(this));
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + ": receiving message " + message + ". BEEP BEEP!");
    }
}
