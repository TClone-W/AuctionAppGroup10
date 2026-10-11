package com.auction.model.entity;

/**
 * Nguoi ban (Seller). Ke thua User. Co the dang tao phien dau gia moi.
 */
public class Seller extends User {
    private static final long serialVersionUID = 1L;
    private double sellerRating;
    private int successfulAuctions;

    public Seller(String id, String username, String fullName, String email, double balance, double sellerRating) {
        super(id, username, fullName, email, balance);
        this.sellerRating = sellerRating;
        this.successfulAuctions = 0;
    }

    @Override
    public String getRoleName() {
        return "SELLER";
    }

    @Override
    public boolean canCreateAuction() {
        return true;
    }

    @Override
    public boolean canPlaceBid() {
        // Nguoi ban khong duoc tu dau gia san pham cua minh
        return false;
    }

    public double getSellerRating() {
        return sellerRating;
    }

    public void setSellerRating(double sellerRating) {
        this.sellerRating = sellerRating;
    }

    public int getSuccessfulAuctions() {
        return successfulAuctions;
    }

    public void incrementSuccessfulAuctions() {
        this.successfulAuctions++;
    }
}