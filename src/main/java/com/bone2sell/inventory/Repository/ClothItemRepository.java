package com.bone2sell.inventory.Repository;

import com.bone2sell.inventory.Models.ClothItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothItemRepository extends JpaRepository<ClothItem, Long> {
    // Default CRUD methods are inherited, including:
    // List<ClothItem> findAll();
    // ClothItem save(ClothItem clothItem);
}
