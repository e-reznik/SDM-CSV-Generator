package com.mycompany.sdm.dto;

public class Product {

    private int type;
    private String title;
    private int quality;
    private int bestBefore;
    private double price;

    public Product(int type, String title, int quality, int bestBefore, double price) {
        this.type = type;
        this.title = title;
        this.quality = quality;
        this.bestBefore = bestBefore;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

}
