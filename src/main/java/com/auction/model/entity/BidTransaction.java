package com.auction.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BidTransaction implements Serializable, Comparable<BidTransaction> {
    private static final long serialVersionUID = 1L;

    private final String id;
    private final String auctionId;
    private final String bidderId;
    private final String bidderName;
    private final double amount;
    private final LocalDateTime timestamp;
    private final boolean isAutoBid;

    public BidTransaction(String id, String auctionId, String bidderId, 
                          String bidderName, double amount, boolean isAutoBid) {
        this.id = id;
        this.auctionId = auctionId;
        this.bidderId = bidderId;
        this.bidderName = bidderName;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.isAutoBid = isAutoBid;
    }

    public String getId() {
        return id;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public String getBidderId() {
        return bidderId;
    }

    public String getBidderName() {
        return bidderName;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isAutoBid() {
        return isAutoBid;
    }

    @Override
    public int compareTo(BidTransaction o) {
        // Sap xep theo thoi gian hoac so tien
        return Double.compare(this.amount, o.amount);
    }

    @Override
    public String toString() {
        return String.format("[%.2f$] boi %s vao luc %s%s", 
                amount, bidderName, timestamp.toLocalTime(), isAutoBid ? " (Auto-Bid)" : "");
    }
}