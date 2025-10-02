package Exercise2.Problem3;

public class Obstacle implements GridComponent {
    private int x, y;

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isObstacle(int x, int y) {
        return this.x == x && this.y == y;
    }
    
}
