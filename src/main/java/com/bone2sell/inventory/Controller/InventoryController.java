package com.bone2sell.inventory.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello user";
    }

    @PostMapping
    public List<String> addFoodTtem(@RequestBody FoodItem food_item) {
        return food_item.
    }
}
