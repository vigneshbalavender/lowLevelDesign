package LLD.DesignPatterns.behavioralDP.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();
        Light light = new Light();
        AC ac = new AC();
        Fan fan = new Fan();
        remoteControl.setCommand(0,new LightOnCommand(light));
        remoteControl.setCommand(1,new LightOffCommand(light));
        remoteControl.setCommand(2,new ACONCommand(ac));
        remoteControl.setCommand(3,new ACOffCommand(ac));
        remoteControl.setCommand(4,new FanOnCommand(fan));
        remoteControl.setCommand(5,new FanOffCommand(fan));

        remoteControl.pressButton(2);
        remoteControl.pressButton(0);
        remoteControl.pressButton(3);
        remoteControl.pressButton(4);
        remoteControl.pressUndo();
        remoteControl.pressUndo();
    }
}
