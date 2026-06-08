package ProductOrderApp.Demo.Controller;

import ProductOrderApp.Demo.Entities.Order;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.HashMap;

@RestController
public class OrderController {
    HashMap<Integer, Order> orderHashMap=new HashMap<>();
    // empty constructor to add values to HashMap
    public OrderController(){
        orderHashMap.put(1,new Order(01,"Muscat","Shipped"));
        orderHashMap.put(2,new Order(02,"Nizwa","Delivered"));
        orderHashMap.put(3,new Order(03,"Sohar","Pending"));
    }

    @PutMapping("update-Stock/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String shippingAddress,@RequestParam String orderStatus){
        if(!orderHashMap.containsKey(orderId)){
            return "Order with ID "+ orderId+ " NOT Found...";
        }
        Order order=orderHashMap.get(orderId);
        order.setShippingAddress(shippingAddress);
        order.setOrderStatus(orderStatus);
        return "*** Order Information Updated SUCCESSFULLY... ***"+"\n"+
                "Order ID: "+order.getOrderId()+"\n"+
                "Updated Order Shipping Address: "+order.getShippingAddress()+"\n"+
                "Updated Order Status: "+order.getOrderStatus();
    }
}
