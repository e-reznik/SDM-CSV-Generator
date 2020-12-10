package com.mycompany.sdmcsvgenerator;

import com.mycompany.sdmcsvgenerator.logic.ProductGenerator;
import com.mycompany.sdmcsvgenerator.interfaces.Properties.Cheeses;
import com.mycompany.sdmcsvgenerator.model.ProductList;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.sdmcsvgenerator.interfaces.Properties;

public class App implements Properties {

    public static void main(String[] args) {
        ProductGenerator pg = new ProductGenerator();
        List<ProductList> list = new ArrayList<>();
        int numCheeses = 10;
        int numWines = 20;
        int numApples = 5;

        list.add(new ProductList(ProductTypes.KAESE, Cheeses.values(), numCheeses));
        list.add(new ProductList(ProductTypes.WEIN, Wines.values(), numWines));
        list.add(new ProductList(ProductTypes.AEPFEL, Apples.values(), numApples));

        try {
            pg.generate(list, "/home/evgenij/products.csv");
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
