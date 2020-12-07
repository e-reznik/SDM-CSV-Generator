package com.mycompany.sdmcsvgenerator.model;

public class Properties {

    private int bestBeforeMin;
    private int bestBeforeMax;

    private int priceMin;
    private int priceMax;

    private int qualityMin;
    private int qualityMax;

    public Properties(int bestBeforeMin, int bestBeforeMax, int priceMin, int priceMax, int qualityMin, int qualityMax) {
        this.bestBeforeMin = bestBeforeMin;
        this.bestBeforeMax = bestBeforeMax;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
        this.qualityMin = qualityMin;
        this.qualityMax = qualityMax;
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

    public int getQualityMin() {
        return qualityMin;
    }

    public void setQualityMin(int qualityMin) {
        this.qualityMin = qualityMin;
    }

    public int getQualityMax() {
        return qualityMax;
    }

    public void setQualityMax(int qualityMax) {
        this.qualityMax = qualityMax;
    }

}
