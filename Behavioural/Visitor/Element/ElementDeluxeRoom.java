package Element;

import Visitor.VisitorI;

public class ElementDeluxeRoom implements ElementI{
    public String name;
    public int price;

    public ElementDeluxeRoom(String name) {
        this.name = name;
    }

    @Override
    public void accept(VisitorI visitor){
        visitor.visit(this);
    }

}
