public class Main{
    public static void main(String[] args) {
        OrderFacade orderFacade1 = new OrderFacade(1, "Apple MacBook Pro M3");
        orderFacade1.createOrder();
        OrderFacade orderFacade2 = new OrderFacade(2, "Sony PS5");
        orderFacade2.createOrder();
        orderFacade1.cancelOrder();
    }
}