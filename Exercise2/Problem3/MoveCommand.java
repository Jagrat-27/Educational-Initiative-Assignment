package Exercise2.Problem3;

public class MoveCommand implements Command{
    private Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
    }
}
