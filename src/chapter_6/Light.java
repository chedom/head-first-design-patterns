package chapter_6;

public class Light {
    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println("Turn on light " + roomName);
    }
    public void off() {
        System.out.println("Turn off light " + roomName);
    }
}
