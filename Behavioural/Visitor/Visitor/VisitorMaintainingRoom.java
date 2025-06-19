package Visitor;

import Element.ElementDeluxeRoom;
import Element.ElementDoubleRoom;
import Element.ElementSingleRoom;

public class VisitorMaintainingRoom implements VisitorI{
    
    @Override
    public void visit(ElementSingleRoom singleRoom){
        System.out.println(singleRoom.name + " undergoing Room Service.");
    }

    @Override
    public void visit(ElementDoubleRoom doubleRoom){
        System.out.println(doubleRoom.name + " undergoing Room Service ");
    }

    @Override
    public void visit(ElementDeluxeRoom deluxeRoom){
        System.out.println(deluxeRoom.name + " undergoing Room Service ");
    }

}
