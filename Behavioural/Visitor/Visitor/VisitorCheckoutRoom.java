package Visitor;

import Element.ElementDeluxeRoom;
import Element.ElementDoubleRoom;
import Element.ElementSingleRoom;

public class VisitorCheckoutRoom implements VisitorI{
    
    @Override
    public void visit(ElementSingleRoom singleRoom){
        System.out.println(singleRoom.name + " is free now.");
    }

    @Override
    public void visit(ElementDoubleRoom doubleRoom){
        System.out.println(doubleRoom.name + " is free now.");
    }

    @Override
    public void visit(ElementDeluxeRoom deluxeRoom){
        System.out.println(deluxeRoom.name + " is free now.");
    }

}
