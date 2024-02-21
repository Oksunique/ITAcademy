package homework16From21022024.SingletonShape;
/* Фигругы. Создайте класс ShapeType с типами фигур, интерфейс Shape с методом подсчета
площади фигуры и классы фигур которые наследуют его, класс ShapeFactory, который будет
создавать объекты фигур на основе ShapeType .*/

public class ShapeMain {
    public static void main(String[] args) {
        Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE, 4.0, 3.0);
        System.out.println("The area of a triangle: " + triangle.calculateArea());

        Shape square = ShapeFactory.createShape(ShapeType.SQUARE, 5.0);
        System.out.println("Square area: " + square.calculateArea());
    }
}
