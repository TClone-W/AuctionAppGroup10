package com.auction.model.entity;

/**
 * Trang thai vong doi cua phien dau gia:
 * OPEN -> RUNNING -> FINISHED -> PAID / CANCELED
 */
public enum AuctionStatus {
    OPEN,
    RUNNING,
    FINISHED,
    PAID,
    CANCELED
}