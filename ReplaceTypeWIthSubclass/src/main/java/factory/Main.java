package factory;

public class Main {
    public static void main(String[] args) {
        Shape line  = Shape.createShape( ShapeFactory.LineFactory.getInstance(), 0, 0, 100, 200);
        Shape rectangle  = Shape.createShape(ShapeFactory.RectangleFactory.getInstance(), 10, 20, 30, 40);
        Shape oval  = Shape.createShape(ShapeFactory.OvalFactory.getInstance(),0, 200, 300, 400);


        Shape[] shapes = {line, rectangle, oval};

        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}
