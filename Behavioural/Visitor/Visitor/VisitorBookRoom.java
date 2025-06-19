package Visitor;

import Element.ElementDeluxeRoom;
import Element.ElementDoubleRoom;
import Element.ElementSingleRoom;

public class VisitorBookRoom implements VisitorI{
    
    @Override
    public void visit(ElementSingleRoom singleRoom){
        System.out.println(singleRoom.name + " has been booked at " + singleRoom.price);
    }

    @Override
    public void visit(ElementDoubleRoom doubleRoom){
        System.out.println(doubleRoom.name + " has been booked at " + doubleRoom.price);
    }

    @Override
    public void visit(ElementDeluxeRoom deluxeRoom){
        System.out.println(deluxeRoom.name + " has been booked at " + deluxeRoom.price);
    }   

}
