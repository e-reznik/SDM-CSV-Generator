package com.mycompany.sdmcsvgenerator.logic;

import java.util.Random;
import com.mycompany.sdmcsvgenerator.model.Product;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.sdmcsvgenerator.model.ProductList;
import com.mycompany.sdmcsvgenerator.interfaces.Properties;

public class ProductGenerator implements Properties {

    private final Random rand = new Random();

    /**
     * Generierung einer CSV mit Beispieldaten von Produkten mit vordefinierten
     * Bereichen.
     *
     * @param list Liste mit den Produkten und deren vordefinierten Bereichen
     * @param path Pfad, wo die zu erstellende CSV abgelegt wird
     * @throws IOException falls der Pfad nicht existiert
     * @throws CsvDataTypeMismatchException der für die Konvertierung angegebene
     * Zeichenfolgenwert kann nicht in den erforderlichen Typ des Zielfelds
     * konvertiert werden
     * @throws CsvRequiredFieldEmptyException ein als erforderlich markiertes
     * Feld in der CSV-Datei ist leer
     */
    public void generate(List<ProductList> list, String path) throws IOException,
            CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        List<Product> products = new ArrayList<>();

        list.forEach(pl -> {
            ProductTypes p = pl.getP();
            Enum[] e = pl.getE();
            int num = pl.getNum();

            products.addAll(generateProductByType(p, e, num));
        });

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
    private List<Product> generateProductByType(ProductTypes pt, Enum[] title, int num) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < num; i++) {

            int bestBefore = getRandom(rand, PROPS.get(pt).getBestBeforeMin(), PROPS.get(pt).getBestBeforeMax());
            int price = getRandom(rand, PROPS.get(pt).getPriceMin(), PROPS.get(pt).getPriceMax());
            int quality = getRandom(rand, PROPS.get(pt).getQualityMin(), PROPS.get(pt).getQualityMax());

            int rnd = rand.nextInt(title.length);
            products.add(new Product(pt, title[rnd].name(), quality, bestBefore, price));
        }
        return products;
    }

    /**
     * Erstellt eine CSV.
     *
     * @param path Pfad, wo die CSV abgelegt werden soll
     * @param products Liste der Produkte
     * @throws IOException falls der Pfad nicht existiert
     * @throws CsvDataTypeMismatchException der für die Konvertierung angegebene
     * Zeichenfolgenwert kann nicht in den erforderlichen Typ des Zielfelds
     * konvertiert werden
     * @throws CsvRequiredFieldEmptyException ein als erforderlich markiertes
     * Feld in der CSV-Datei ist leer
     */
    private void writeCsv(String path, List<Product> products) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try (Writer writer = new FileWriter(path)) {
            StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder<List<Product>>(writer)
                    .withSeparator(com.opencsv.ICSVWriter.DEFAULT_SEPARATOR)
                    .withQuotechar(com.opencsv.ICSVWriter.NO_QUOTE_CHARACTER)
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
     * @return die generierte Zufallszahl
     */
    private int getRandom(Random rand, int min, int max) {
        // max ist exklusiv (wird nicht mitgezählt), sodass max+1 gerechnet wird
        return rand.nextInt((max + 1) - min) + min;
    }
}
