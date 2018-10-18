package chapter_6;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("test");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
