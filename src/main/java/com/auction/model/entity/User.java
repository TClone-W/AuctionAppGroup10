package com.auction.model.entity;

/**
 * Lop truu tuong User ke thua Entity.
 * La lop cha cua Bidder, Seller, Admin.
 */
public abstract class User extends Entity {
    private static final long serialVersionUID = 1L;

    private String username;
    private String fullName;
    private String email;
    private double balance;

    public User(String id, String username, String fullName, String email, double balance) {
        super(id);
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.balance = balance;
    }

    // Abstract method the hien Polymorphism
    public abstract String getRoleName();
    public abstract boolean canCreateAuction();
    public abstract boolean canPlaceBid();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        touch();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        touch();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        touch();
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            touch();
        }
    }

    public synchronized boolean deduct(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            touch();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%s) - So du: $%.2f", getRoleName(), fullName, username, balance);
    }
}