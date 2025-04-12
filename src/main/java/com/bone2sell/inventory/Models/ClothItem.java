package com.bone2sell.inventory.Models;

public class ClothItem implements Inventory{
    private int id;
    private String name;
    private Long price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(Long price) {
        this.price = price;
    }

    public ClothItem(int id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public long getPrice() {
        return price;
    }
}
