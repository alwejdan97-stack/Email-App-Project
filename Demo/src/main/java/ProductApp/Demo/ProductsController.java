package ProductApp.Demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.*;
import java.util.HashMap;

@RestController
public class ProductsController {
    HashMap<Integer, Product> productHashMap=new HashMap<>();
    // empty constructor to add values to HashMap
    public ProductsController(){
        productHashMap.put(1,new Product(01,"IPHONE",350));
        productHashMap.put(2,new Product(02,"HONOR",235));
        productHashMap.put(3,new Product(03,"Laptop",175));
    }

    @PutMapping("updateStock/{id}")
    public String updateProduct(@PathVariable int id, @RequestParam int quantity){
        if(!productHashMap.containsKey(id)){
            return "Product with ID "+ id+ " NOT Found...";
        }
        Product product=productHashMap.get(id);
        int previousQuantity=product.getStockQuantity();
        product.setStockQuantity(quantity);
        return "*** Product Updated SUCCESSFULLY... ***"+"\n"+
                "Product ID: "+product.getId()+"\n"+
                "Product Name: "+product.getName()+"\n"+
                "Previous Quantity: "+previousQuantity+"\n"+
                "New Stock Quantity: "+product.getStockQuantity();
    }
}
