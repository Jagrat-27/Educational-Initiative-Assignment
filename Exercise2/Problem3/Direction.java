package Exercise2.Problem3;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    // Turn left without if-else (circular rotation)
    public Direction turnLeft() {
        return values()[(this.ordinal() + 3) % 4];
    }

    // Turn right without if-else (circular rotation)
    public Direction turnRight() {
        return values()[(this.ordinal() + 1) % 4];
    }
}
