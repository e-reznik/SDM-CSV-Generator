package com.mycompany.sdm.dto;

import java.util.Map;

public interface IProperties {

    /* Produktbezeichnungen */
    public enum Cheeses {
        BERGKAESE,
        BRIMSEN,
        BRIE,
        CAMEMBERT,
        CHEDDAR,
        EMMENTALER,
        EDAMER,
        FETA,
        GORGONZOLA,
        GOUDA,
        HALLOUMI,
        HARZER,
        MOZZARELLA,
        PARMESAN,
        TILSITER
    }

    public enum Wines {
        RIESLING,
        SAUVIGNON_BLANC,
        CHARDONNAY,
        CHENIN_BLANC,
        GRAUBURGUNDER,
        CABERNET_SAUVIGNON,
        SPAETBURGUNDER,
        MERLOT,
        TEMPRANILLO,
        SANGIOVESE;
    }

    public enum Apples {
        GRANNY_SMITH,
        ELSTAR,
        BOSKOP,
        GOLDEN_DELICIOUS,
        BRAEBURN,
        JONAGOLD,
        ROYAL_GALA,
        PINK_LADY
    }

    /*
    bestBeforeMin;
    bestBeforeMax;
    priceMin;
    priceMax;
     */
    final Map<Integer, Properties> PROPS = Map.of(
            0, new Properties(5, 30, 100, 1000), // Käse
            1, new Properties(30, 365, 300, 5000), // Wein
            2, new Properties(14, 28, 100, 400) // Äpfel
    );
}
