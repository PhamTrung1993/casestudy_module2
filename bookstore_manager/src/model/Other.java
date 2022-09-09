package model;

import java.io.Serializable;

public class Other implements Serializable,Comparable<Other> {
    public String ID;
    private String name;
    private String category;
    private String origin;
    private long price;
    private int amount;

    public Other(String ID, String name, String category, String origin, long price,int amount) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.origin = origin;
        this.price = price;
        this.amount = amount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Other other) {
        return (this.ID).compareTo(other.ID);
    }

    @Override
    public String toString() {
        return "Other{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

