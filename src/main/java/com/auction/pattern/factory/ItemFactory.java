package com.auction.pattern.factory;

import com.auction.model.entity.*;
import java.util.Map;

/**
 * Factory Method Pattern dung de khoi tao doi tuong Item linh hoat
 * dua tren chuoi category va thong so bo sung.
 */
public class ItemFactory {

    public static Item createItem(String category, String id, String name, 
                                  String description, double startingPrice, 
                                  String sellerId, Map<String, Object> extraParams) {
        if (category == null) {
            throw new IllegalArgumentException("Category khong duoc de trong");
        }

        switch (category.toUpperCase()) {
            case "ELECTRONICS":
                int warranty = (int) extraParams.getOrDefault("warrantyMonths", 12);
                String brand = (String) extraParams.getOrDefault("brand", "Generic");
                return new Electronics(id, name, description, startingPrice, sellerId, warranty, brand);

            case "ART":
                String artist = (String) extraParams.getOrDefault("artist", "Unknown Artist");
                boolean coa = (boolean) extraParams.getOrDefault("coa", false);
                return new Art(id, name, description, startingPrice, sellerId, artist, coa);

            case "VEHICLE":
                int mileage = (int) extraParams.getOrDefault("mileageKm", 0);
                String fuel = (String) extraParams.getOrDefault("fuelType", "Gasoline");
                return new Vehicle(id, name, description, startingPrice, sellerId, mileage, fuel);

            default:
                throw new IllegalArgumentException("Khong ho tro loai san pham: " + category);
        }
    }
}