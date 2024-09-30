package CreationalPatterns.FactoryDesignPattern;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");
        Shape circle = shapeFactory.getShape("CIRCLE");

        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
