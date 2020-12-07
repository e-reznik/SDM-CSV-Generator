package com.mycompany.sdmcsvgenerator;

import com.mycompany.sdmcsvgenerator.interfaces.IProperties;
import com.mycompany.sdmcsvgenerator.logic.ProductGenerator;
import com.mycompany.sdmcsvgenerator.interfaces.IProperties.Cheeses;
import com.mycompany.sdmcsvgenerator.model.ProductList;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App implements IProperties {

    public static void main(String[] args) {
        ProductGenerator pg = new ProductGenerator();
//        Map<Enum[], Integer> map = new HashMap<>();
        List<ProductList> list = new ArrayList<>();

        list.add(new ProductList(ProductTypes.KAESE, Cheeses.values(), 10));
        list.add(new ProductList(ProductTypes.WEIN, Wines.values(), 20));
        list.add(new ProductList(ProductTypes.AEPFEL, Apples.values(), 15));

        try {
            pg.generate(list, "/home/evgenij/products.csv");
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
