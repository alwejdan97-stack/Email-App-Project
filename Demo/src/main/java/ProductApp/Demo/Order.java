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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
