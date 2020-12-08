package adapter_mediator.adapter;

import adapter_mediator.mediator.User;

public class RobotToUserAdapter implements User {
    Robot robot;

    public RobotToUserAdapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sendMessage(String message) {
        robot.sendRobotMessage(message);
    }

    @Override
    public void getMessage(String message) {
        robot.getMessage(message);
    }
}
