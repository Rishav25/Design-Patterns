package Visitor;

import Element.ElementDeluxeRoom;
import Element.ElementDoubleRoom;
import Element.ElementSingleRoom;

public interface VisitorI {
    
    public void visit(ElementSingleRoom singleRoom);
    public void visit(ElementDoubleRoom doubleRoom);
    public void visit(ElementDeluxeRoom deluxeRoom);

}
