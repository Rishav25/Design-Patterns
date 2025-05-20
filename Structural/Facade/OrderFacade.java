public class OrderFacade {
    
    Product product;
    Payment payment;
    Invoice invoice;
    Notification notification;

    public OrderFacade(int productId, String productName) {
        this.product = new Product(productId, productName);
        this.payment = new Payment();
        this.invoice = new Invoice();
        this.notification = new Notification();
    }

    public void createOrder(){
        product.getProductDetails();
        payment.makePayment();
        invoice.generateOrderPlaceInvoice();
        notification.sendOrderPlacedNotification();
        System.out.println("\n");
    }
    
    public void cancelOrder(){
        product.getProductDetails();
        payment.reversePayment();
        invoice.generateOrderCancelInvoice();
        notification.sendOrderCancelledNotification();
        System.out.println("\n");
    }

}
