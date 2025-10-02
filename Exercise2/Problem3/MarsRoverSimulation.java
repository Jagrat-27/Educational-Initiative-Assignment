package Exercise2.Problem3;

import java.util.Scanner;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Grid input
        System.out.print("Enter grid size (width height): ");
        int width = sc.nextInt();
        int height = sc.nextInt();
        Grid grid = new Grid(width, height);

        // Obstacles input
        System.out.print("Enter number of obstacles: ");
        int obsCount = sc.nextInt();
        for (int i = 0; i < obsCount; i++) {
            System.out.print("Enter obstacle position (x y): ");
            int ox = sc.nextInt();
            int oy = sc.nextInt();
            grid.add(new Obstacle(ox, oy));
        }

        // Rover start position
        System.out.print("Enter starting position (x y direction[N/E/S/W]): ");
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        String dir = sc.next().toUpperCase();

        Direction startDir = switch (dir) {
            case "N" -> Direction.NORTH;
            case "S" -> Direction.SOUTH;
            case "E" -> Direction.EAST;
            case "W" -> Direction.WEST;
            default -> throw new IllegalArgumentException("Invalid direction!");
        };

        Rover rover = new Rover(new Position(sx, sy), startDir, grid);

        // Commands input
        System.out.print("Enter command sequence (M=Move, L=Left, R=Right): ");
        String commands = sc.next().toUpperCase();

        // Command pattern setup
        CommandInvoker invoker = new CommandInvoker();
        invoker.registerCommand('M', new MoveCommand(rover));
        invoker.registerCommand('L', new LeftCommand(rover));
        invoker.registerCommand('R', new RightCommand(rover));

        // Execute commands
        for (char c : commands.toCharArray()) {
            invoker.execute(c);
            System.out.println(rover.getStatus());
        }

        // Final Status
        System.out.println("✅ Final Position: " + rover.getStatus());
    }
}
