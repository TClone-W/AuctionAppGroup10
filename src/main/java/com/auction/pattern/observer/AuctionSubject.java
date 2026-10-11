package com.auction.pattern.observer;

public interface AuctionSubject {
    void registerObserver(AuctionObserver observer);
    void removeObserver(AuctionObserver observer);
    void notifyObserversNewBid(String auctionId, com.auction.model.entity.BidTransaction transaction, double currentPrice);
    void notifyObserversTimeExtended(String auctionId, long remainingSeconds, String reason);
    void notifyObserversStatusChanged(String auctionId, String newStatus, String winnerName, double finalPrice);
}