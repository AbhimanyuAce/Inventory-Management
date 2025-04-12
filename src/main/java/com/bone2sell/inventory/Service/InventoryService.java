package com.bone2sell.inventory.Service;

import com.bone2sell.inventory.Models.ClothItem;
import com.bone2sell.inventory.Models.FoodItem;
import com.bone2sell.inventory.Repository.ClothItemRepository;
import com.bone2sell.inventory.Repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

        private final FoodItemRepository foodRepo;
        private final ClothItemRepository clothRepo;

        public InventoryService(FoodItemRepository foodRepo, ClothItemRepository clothRepo) {
            this.foodRepo = foodRepo;
            this.clothRepo = clothRepo;
        }

        // --- Food Item methods ---

        public List<FoodItem> getAllFoodItems() {
            return foodRepo.findAll();
        }

        public FoodItem addFoodItem(FoodItem item) {
            return foodRepo.save(item);
        }

        // --- Cloth Item methods ---

        public List<ClothItem> getAllClothItems() {
            return clothRepo.findAll();
        }

        public ClothItem addClothItem(ClothItem item) {
            return clothRepo.save(item);
        }
    }
