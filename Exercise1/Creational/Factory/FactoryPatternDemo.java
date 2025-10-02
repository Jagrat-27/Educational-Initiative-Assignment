package Exercise1.Creational.Factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape square = ShapeFactory.createShape("square");
        square.draw();
    }
}
