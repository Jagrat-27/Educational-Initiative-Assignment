package Exercise2.Problem3;

public class LeftCommand implements Command {
    private Rover rover;

    public LeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
    
}
