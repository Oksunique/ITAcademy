package homework16From21022024.SingletonShape;

public class ShapeFactory {
    public static Shape createShape(ShapeType shapeType, double... params) {
        switch (shapeType) {
            case TRIANGLE:
                return new Triangle(params[0], params[1]);
            case SQUARE:
                return new Square(params[0]);
            default:
                return null;
        }
    }
}
