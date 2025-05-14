package shapefactory;

import shapeobject.ShapeCircle;
import shapeobject.ShapeInterface;
import shapeobject.ShapeRectangle;

public class ShapeFactory {
    public ShapeInterface createShape(String shape){
        switch (shape) {
            case "CIRCLE" -> {
                return new ShapeCircle();
            }
            case "SQUARE" -> {
                return new ShapeRectangle();
            }
            case "RECTANGLE" -> {
                return new ShapeRectangle();
            }
            default -> throw new AssertionError();
        }
    }
}
