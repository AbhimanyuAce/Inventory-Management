package com.bone2sell.inventory.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello user";
    }

}
