package com.auction.model.entity;

public class Electronics extends Item {
    private static final long serialVersionUID = 1L;
    private int warrantyMonths;
    private String brand;

    public Electronics(String id, String name, String description, double startingPrice, 
                       String sellerId, int warrantyMonths, String brand) {
        super(id, name, description, startingPrice, sellerId);
        this.warrantyMonths = warrantyMonths;
        this.brand = brand;
    }

    @Override
    public String getCategoryName() {
        return "ELECTRONICS";
    }

    @Override
    public double calculateCommissionRate() {
        return 0.05; // 5% hoa hong cho do dien tu
    }

    @Override
    public String getSpecializedDetails() {
        return String.format("Hang: %s | Bao hanh: %d thang", brand, warrantyMonths);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public String getBrand() {
        return brand;
    }
}