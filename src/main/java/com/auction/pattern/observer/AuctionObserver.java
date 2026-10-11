package com.auction.pattern.observer;

import com.auction.model.entity.BidTransaction;

/**
 * Observer Pattern: lang nghe su kien cap nhat tu phien dau gia
 */
public interface AuctionObserver {
    void onNewBidPlaced(String auctionId, BidTransaction transaction, double currentPrice);
    void onAuctionTimeExtended(String auctionId, long remainingSeconds, String reason);
    void onAuctionStatusChanged(String auctionId, String newStatus, String winnerName, double finalPrice);
}