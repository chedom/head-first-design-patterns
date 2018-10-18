package chapter_6;

public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
        garageDoor.up();
    }
}
