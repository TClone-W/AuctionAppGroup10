package com.auction.model.entity;

/**
 * Quan tri vien he thong (Admin).
 */
public class Admin extends User {
    private static final long serialVersionUID = 1L;

    public Admin(String id, String username, String fullName, String email) {
        super(id, username, fullName, email, 0.0);
    }

    @Override
    public String getRoleName() {
        return "ADMIN";
    }

    @Override
    public boolean canCreateAuction() {
        return true;
    }

    @Override
    public boolean canPlaceBid() {
        return false;
    }
}