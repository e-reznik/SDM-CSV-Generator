package com.mycompany.sdmcsvgenerator.model;

import com.mycompany.sdmcsvgenerator.interfaces.Properties;

public class Product implements Properties {

    private ProductTypes type;
    private String title;
    private int quality;
    private int bestBefore;
    private double price;

    public Product(ProductTypes type, String title, int quality, int bestBefore, double price) {
        this.type = type;
        this.title = title;
        this.quality = quality;
        this.bestBefore = bestBefore;
        this.price = price;
    }

    public ProductTypes getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public int getQuality() {
        return quality;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public double getPrice() {
        return price;
    }

}
