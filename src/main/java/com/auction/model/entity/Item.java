package com.auction.model.entity;

/**
 * Lop truu tuong Item ke thua Entity.
 * Cay ke thua: Item -> Electronics, Art, Vehicle.
 */
public abstract class Item extends Entity {
    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private double startingPrice;
    private String sellerId;

    public Item(String id, String name, String description, double startingPrice, String sellerId) {
        super(id);
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.sellerId = sellerId;
    }

    // Abstract methods the hien Polymorphism
    public abstract String getCategoryName();
    public abstract double calculateCommissionRate();
    public abstract String getSpecializedDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        touch();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        touch();
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public String getSellerId() {
        return sellerId;
    }
}