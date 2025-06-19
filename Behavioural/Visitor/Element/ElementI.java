package Element;

import Visitor.VisitorI;

public interface ElementI {
    public void accept(VisitorI visitor);
}
