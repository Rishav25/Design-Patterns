public class Product {
    int productId;
    String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public void getProductDetails(){
        System.out.println("Product Name : " + this.productName + "\nProduct Id : " + this.productId);
    }
    
}
