package Exercise2.Problem3;

import java.util.ArrayList;
import java.util.List;

public class Grid implements GridComponent {
     private int width, height;
    private List<GridComponent> children = new ArrayList<>();

    public Grid(int width, int height) {
        this.width = width; this.height = height;
    }

    public void add(GridComponent component) {
        children.add(component);
    }

    public boolean isWithinBounds(Position pos) {
        return pos.getX() >= 0 && pos.getY() >= 0 &&
               pos.getX() < width && pos.getY() < height;
    }

    @Override
    public boolean isObstacle(int x, int y) {
        for (GridComponent c : children) {
            if (c.isObstacle(x, y)) return true;
        }
        return false;
    }
    
}
