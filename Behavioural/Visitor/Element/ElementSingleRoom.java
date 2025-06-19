package Element;

import Visitor.VisitorI;

public class ElementSingleRoom implements ElementI{
    public String name;
    public int price;

    public ElementSingleRoom(String name) {
        this.name = name;
    }

    @Override
    public void accept(VisitorI visitor){
        visitor.visit(this);
    }
}
