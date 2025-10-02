package Exercise2.Problem3;

public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        Position newPos = position.copy();
        newPos.move(direction);
        if (!grid.isWithinBounds(newPos)) {
            System.out.println("⚠ Rover cannot move outside grid boundaries!");
            return;
        }
        if (grid.isObstacle(newPos.getX(), newPos.getY())) {
            System.out.println("⚠ Obstacle detected at " + newPos + ". Movement stopped.");
            return;
        }
        position = newPos;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getStatus() {
        return "Rover is at " + position + " facing " + direction;
    }
}
