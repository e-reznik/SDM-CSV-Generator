package com.mycompany.sdm.logic;

import java.util.Random;
import com.mycompany.sdm.dto.Product;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.sdm.dto.IProperties;
import java.util.Map;

public class ProductGenerator implements IProperties {

    private final Random rand = new Random();

    public void generate(Map<Enum[], Integer> map, String path) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        List<Product> products = new ArrayList<>();

        int type = 0;
        for (Map.Entry<Enum[], Integer> entry : map.entrySet()) {
            Enum[] key = entry.getKey();
            int value = entry.getValue();

            products.addAll(generateProductByType(type, key, value));
            type++;
        }

        writeCsv(path, products);
    }

    /**
     * Generiert eine zufällige Produktliste nach Produkttyp.
     *
     * @param type id des Produkttyps
     * @param title Produktbezeichnung
     * @param num Gewünschte Anzahl der zufälligen Produkte
     * @return Liste mit den generierten Produkten
     */
    private List<Product> generateProductByType(int type, Enum[] title, int num) {
        List<Product> p = new ArrayList<>();
        for (int i = 0; i < num; i++) {

            int bestBefore = getRandom(rand, PROPS.get(type).getBestBeforeMin(), PROPS.get(type).getBestBeforeMax());
            int price = getRandom(rand, PROPS.get(type).getPriceMin(), PROPS.get(type).getPriceMax());
            // Qualität ist minimum 90. Was Geringeres kommt mir nicht in die (Einkaufs-)Tüte.
            int quality = getRandom(rand, 90, 100);

            int rnd = rand.nextInt(title.length);
            p.add(new Product(type, title[rnd].name(), quality, bestBefore, price));
        }
        return p;
    }

    /**
     * Erstellt eine CSV.
     *
     * @param path Pfad, wo die CSV abgelegt werden soll
     * @param products Liste der Produkte
     * @throws IOException
     * @throws CsvDataTypeMismatchException
     * @throws CsvRequiredFieldEmptyException
     */
    private void writeCsv(String path, List<Product> products) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try (Writer writer = new FileWriter(path)) {
            StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder<List<Product>>(writer)
                    .withSeparator(com.opencsv.ICSVWriter.DEFAULT_SEPARATOR)
                    .build();

            sbc.write(products);
        }
    }

    /**
     * Liefert eine Zufallszahl aus dem vorgegebenen Bereich.
     *
     * @param rand Random Objekt
     * @param min der untere Wert des Bereichs
     * @param max der oberen Wert des Bereichs
     * @return die Zufallszahl
     */
    private int getRandom(Random rand, int min, int max) {
        // max ist exklusiv (wird nicht mitgezählt), sodass max+1 gerechnet wird
        return rand.nextInt((max + 1) - min) + min;
    }
}
