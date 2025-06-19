import Element.*;
import Visitor.*;

public class Main {
    public static void main(String[] args) {
        ElementI singleRoom1 = new ElementSingleRoom("Room 101");
        ElementI doubleRoom1 = new ElementDoubleRoom("Room 201");
        ElementI deluxeRoom1 = new ElementDeluxeRoom("Room 301");

        VisitorI priceSetter = new VisitorPriceSetter();
        VisitorI bookRoom = new VisitorBookRoom();
        VisitorI maintainRoom = new VisitorMaintainingRoom();
        VisitorI checkoutRoom = new VisitorCheckoutRoom();

        singleRoom1.accept(priceSetter);
        singleRoom1.accept(bookRoom);
        singleRoom1.accept(maintainRoom);
        singleRoom1.accept(checkoutRoom);

        singleRoom1.accept(priceSetter);

        doubleRoom1.accept(priceSetter);
        doubleRoom1.accept(bookRoom);
        doubleRoom1.accept(maintainRoom);
        doubleRoom1.accept(checkoutRoom);

        deluxeRoom1.accept(priceSetter);
        deluxeRoom1.accept(bookRoom);
        deluxeRoom1.accept(maintainRoom);
        deluxeRoom1.accept(checkoutRoom);

    }
}
