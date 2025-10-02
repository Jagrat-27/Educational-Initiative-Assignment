package Exercise1.Creational.Factory;

public class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
