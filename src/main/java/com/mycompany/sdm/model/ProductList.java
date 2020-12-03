package com.mycompany.sdm.model;

import com.mycompany.sdm.interfaces.IProperties;

public class ProductList implements IProperties {

    private final ProductTypes p;
    private final Enum[] e;
    private final int num;

    public ProductList(ProductTypes p, Enum[] e, int num) {
        this.p = p;
        this.e = e;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public ProductTypes getP() {
        return p;
    }

    public Enum[] getE() {
        return e;
    }

}
