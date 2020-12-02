package com.mycompany.sdm;

import com.mycompany.sdm.dto.IProperties;
import com.mycompany.sdm.dto.IProperties.Cheeses;
import com.mycompany.sdm.logic.ProductGenerator;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App implements IProperties {

    public static void main(String[] args) {
        ProductGenerator pg = new ProductGenerator();
        Map<Enum[], Integer> map = new HashMap<>();

        map.put(Cheeses.values(), 10);
        map.put(Wines.values(), 20);

        //TODO: Reihenfolge prüfen. Type übergeben.
        // Neues Produkt: Äpfel
        //map.put(Apples.values(), 15);
        try {
            pg.generate(map, "/home/evgenij/products.csv");
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
