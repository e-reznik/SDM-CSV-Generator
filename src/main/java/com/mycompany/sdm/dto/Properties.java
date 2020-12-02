package com.mycompany.sdm.dto;

public class Properties {

    private int bestBeforeMin;
    private int bestBeforeMax;

    private int priceMin;
    private int priceMax;

    public Properties(int bestBeforeMin, int bestBeforeMax, int priceMin, int priceMax) {
        this.bestBeforeMin = bestBeforeMin;
        this.bestBeforeMax = bestBeforeMax;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    public int getBestBeforeMin() {
        return bestBeforeMin;
    }

    public void setBestBeforeMin(int bestBeforeMin) {
        this.bestBeforeMin = bestBeforeMin;
    }

    public int getBestBeforeMax() {
        return bestBeforeMax;
    }

    public void setBestBeforeMax(int bestBeforeMax) {
        this.bestBeforeMax = bestBeforeMax;
    }

    public int getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(int priceMin) {
        this.priceMin = priceMin;
    }

    public int getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(int priceMax) {
        this.priceMax = priceMax;
    }

}
