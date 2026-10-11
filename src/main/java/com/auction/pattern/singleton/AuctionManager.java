package com.auction.pattern.singleton;

import com.auction.model.entity.*;
import com.auction.concurrency.AuctionRoom;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Singleton Pattern: Quan ly trung tam tat ca cac phien dau gia.
 * Ap dung Double-Checked Locking va volatile dam bao thread-safe tuyet doi.
 */
public class AuctionManager {
    // Tu khoa volatile dam bao tinh ro rang (visibility) trong bo nho da luong
    private static volatile AuctionManager instance;

    // ConcurrentHashMap luu tru cac phong dau gia theo auctionId
    private final ConcurrentHashMap<String, AuctionRoom> activeAuctionRooms;
    private final ConcurrentHashMap<String, User> registeredUsers;

    // Private constructor ngan chan new truc tiep
    private AuctionManager() {
        this.activeAuctionRooms = new ConcurrentHashMap<>();
        this.registeredUsers = new ConcurrentHashMap<>();
    }

    public static AuctionManager getInstance() {
        if (instance == null) {
            synchronized (AuctionManager.class) {
                if (instance == null) {
                    instance = new AuctionManager();
                }
            }
        }
        return instance;
    }

    public void registerUser(User user) {
        registeredUsers.put(user.getId(), user);
    }

    public User getUser(String id) {
        return registeredUsers.get(id);
    }

    public void addAuctionRoom(AuctionRoom room) {
        activeAuctionRooms.put(room.getAuctionId(), room);
    }

    public AuctionRoom getAuctionRoom(String auctionId) {
        return activeAuctionRooms.get(auctionId);
    }

    public List<AuctionRoom> getAllRooms() {
        return new ArrayList<>(activeAuctionRooms.values());
    }
}