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
    public InventoryController(InventoryService iser){
        this.iser = iser;
    }

    @GetMapping("/food")
    public List<FoodItem> sayHello(){
        return iser.getAllFoodItems();
    }

    @GetMapping("/cloth")
    public List<ClothItem> getcloths(){
        return iser.getAllClothItems();
    }

    @PostMapping("/addFood")
    public FoodItem addFoodTtem(@RequestBody FoodItem food) {
        return iser.addFoodItem(food);
    }
    @PostMapping("/addCloth")
    public ClothItem addCloth(@RequestBody ClothItem cloth) {
        return iser.addClothItem(cloth);
    }
}
