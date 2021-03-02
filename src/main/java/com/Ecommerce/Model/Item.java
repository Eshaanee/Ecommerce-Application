package com.Ecommerce.Model;

import javax.persistence.Entity;

@Entity
public class Item {
    private int itemId;
    private String category;
    private int price;
    private int quantity;
    private byte imageIndex;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public byte getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(byte imageIndex) {
        this.imageIndex = imageIndex;
    }
}
