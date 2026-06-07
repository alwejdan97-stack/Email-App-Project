package ProductApp.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

import java.util.HashMap;

@RestController
public class ProductsController {
    HashMap<Integer, Product> productHashMap=new HashMap<>();
    public ProductsController(){
        productHashMap.put(1,new Product("P1-01","IPHONE",350));
        productHashMap.put(2,new Product("P2-02","HONOR",235));
        productHashMap.put(03,new Product("P3-03","Laptop",175));
    }
}
