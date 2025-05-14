import shapefactory.ShapeFactory;
import shapeobject.ShapeInterface;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeInterface shape1 = shapeFactory.createShape("CIRCLE");
        shape1.draw();
        ShapeInterface shape2 = shapeFactory.createShape("RECTANGLE");
        shape2.draw();
    }
}
