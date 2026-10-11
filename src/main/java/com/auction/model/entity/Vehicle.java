package com.auction.model.entity;

public class Vehicle extends Item {
    private static final long serialVersionUID = 1L;
    private int mileageKm;
    private String fuelType;

    public Vehicle(String id, String name, String description, double startingPrice, 
                   String sellerId, int mileageKm, String fuelType) {
        super(id, name, description, startingPrice, sellerId);
        this.mileageKm = mileageKm;
        this.fuelType = fuelType;
    }

    @Override
    public String getCategoryName() {
        return "VEHICLE";
    }

    @Override
    public double calculateCommissionRate() {
        return 0.08; // 8% hoa hong cho phuong tien
    }

    @Override
    public String getSpecializedDetails() {
        return String.format("ODO: %,d km | Nhien lieu: %s", mileageKm, fuelType);
    }

    public int getMileageKm() {
        return mileageKm;
    }

    public String getFuelType() {
        return fuelType;
    }
}