package com.bone2sell.inventory.Models;

public class FoodItem implements Inventory{
    private int id;
    private String name;
    private long price;

    public FoodItem(int id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

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



    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public long getPrice() {
        return 0;
    }
}
