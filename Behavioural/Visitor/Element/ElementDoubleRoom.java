package Element;

import Visitor.VisitorI;

public class ElementDoubleRoom implements ElementI{
    public String name;
    public int price;

    public ElementDoubleRoom(String name) {
        this.name = name;
    }

    @Override
    public void accept(VisitorI visitor){
        visitor.visit(this);
    }
}
