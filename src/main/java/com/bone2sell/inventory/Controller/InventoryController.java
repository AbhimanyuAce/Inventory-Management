package com.bone2sell.inventory.Controller;
import com.bone2sell.inventory.Models.ClothItem;
import com.bone2sell.inventory.Models.FoodItem;
import com.bone2sell.inventory.Repository.ClothItemRepository;
import com.bone2sell.inventory.Repository.FoodItemRepository;
import com.bone2sell.inventory.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    private InventoryService iser;
    @Autowired
    public void InventoryController(InventoryService iser){
        this.iser = iser;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello user";
    }

    @PostMapping
    public String addFoodTtem(@RequestBody FoodItem food) {
        return iser.addFoodItem(food);
    }
    @PostMapping
    public String addCloth(@RequestBody ClothItem food) {
        return iser.addClothItem();
    }
}
