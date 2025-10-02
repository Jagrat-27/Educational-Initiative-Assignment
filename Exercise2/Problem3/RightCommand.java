package Exercise2.Problem3;

public class RightCommand implements Command{
    private Rover rover;

    public RightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
    
}
