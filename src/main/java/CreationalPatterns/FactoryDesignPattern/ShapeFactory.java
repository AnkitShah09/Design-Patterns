package CreationalPatterns.FactoryDesignPattern;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        return switch (shapeType) {
            case "SQUARE" -> new Square();
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }

}
