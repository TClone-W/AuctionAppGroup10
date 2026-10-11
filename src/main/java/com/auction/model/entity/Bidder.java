package com.auction.model.entity;

/**
 * Nguoi tham gia dau gia (Bidder). Ke thua User.
 */
public class Bidder extends User {
    private static final long serialVersionUID = 1L;
    private int totalBidsPlaced;

    public Bidder(String id, String username, String fullName, String email, double balance) {
        super(id, username, fullName, email, balance);
        this.totalBidsPlaced = 0;
    }

    @Override
    public String getRoleName() {
        return "BIDDER";
    }

    @Override
    public boolean canCreateAuction() {
        return false;
    }

    @Override
    public boolean canPlaceBid() {
        return true;
    }

    public void incrementBidCount() {
        this.totalBidsPlaced++;
    }

    public int getTotalBidsPlaced() {
        return totalBidsPlaced;
    }
}