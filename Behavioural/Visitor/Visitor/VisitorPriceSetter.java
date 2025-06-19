package Visitor;

import Element.ElementDeluxeRoom;
import Element.ElementDoubleRoom;
import Element.ElementSingleRoom;

public class VisitorPriceSetter implements VisitorI{
    
    @Override
    public void visit(ElementSingleRoom singleRoom){
        singleRoom.price = (int)(Math.random()*1000) + 1000;
        System.out.println(singleRoom.name + " price has been set to " + singleRoom.price);
    }

    @Override
    public void visit(ElementDoubleRoom doubleRoom){
        doubleRoom.price = (int)(Math.random()*1000) + 2500;
        System.out.println(doubleRoom.name + " price has been set to " + doubleRoom.price);
    }

    @Override
    public void visit(ElementDeluxeRoom deluxeRoom){
        deluxeRoom.price = (int)(Math.random()*1000) + 3000;
        System.out.println(deluxeRoom.name + " price has been set to " + deluxeRoom.price);
    }

}
