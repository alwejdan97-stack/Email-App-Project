package ProductApp.Demo;

public class Order {
    private int orderId;
    private String shippingAddress;
    private String orderStatus;

    public Order(int orderId, String shippingAddress, String orderStatus) {
        this.orderId = orderId;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
    }
}
