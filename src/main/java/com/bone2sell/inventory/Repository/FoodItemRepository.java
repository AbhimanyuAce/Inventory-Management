package com.bone2sell.inventory.Repository;

import com.bone2sell.inventory.Models.FoodItem;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


    @Repository
    public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
        // Default CRUD methods are inherited, including:
        // List<FoodItem> findAll();
        // FoodItem save(FoodItem foodItem);
    }

