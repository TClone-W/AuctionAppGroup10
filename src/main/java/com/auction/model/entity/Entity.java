package com.auction.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Lop truu tuong co so dai dien cho thuc the trong he thong.
 * Ap dung OOP: Abstraction, Encapsulation, Serializable ho tro Network Socket.
 */
public abstract class Entity implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Entity(String id) {
        this.id = id;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void touch() {
        this.updatedAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}