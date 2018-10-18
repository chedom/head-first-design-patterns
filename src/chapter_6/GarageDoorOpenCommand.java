package chapter_6;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
