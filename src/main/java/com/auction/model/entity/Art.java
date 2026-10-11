package com.auction.model.entity;

public class Art extends Item {
    private static final long serialVersionUID = 1L;
    private String artist;
    private boolean certificateOfAuthenticity;

    public Art(String id, String name, String description, double startingPrice, 
               String sellerId, String artist, boolean certificateOfAuthenticity) {
        super(id, name, description, startingPrice, sellerId);
        this.artist = artist;
        this.certificateOfAuthenticity = certificateOfAuthenticity;
    }

    @Override
    public String getCategoryName() {
        return "ART";
    }

    @Override
    public double calculateCommissionRate() {
        return 0.12; // 12% hoa hong cho tac pham nghe thuat
    }

    @Override
    public String getSpecializedDetails() {
        return String.format("Hoa si: %s | Chung thuc goc (COA): %s", 
                artist, certificateOfAuthenticity ? "Co" : "Khong");
    }

    public String getArtist() {
        return artist;
    }

    public boolean hasCertificateOfAuthenticity() {
        return certificateOfAuthenticity;
    }
}