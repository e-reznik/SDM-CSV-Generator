package com.mycompany.sdmcsvgenerator.interfaces;

import com.mycompany.sdmcsvgenerator.model.Properties;
import java.util.Map;

public interface IProperties {

    /* Produkttypen */
    public enum ProductTypes {
        KAESE,
        WEIN,
        AEPFEL,
        REST
    }

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
    qualityMain;
    qualityMax
     */
    final Map<ProductTypes, Properties> PROPS = Map.of(
            ProductTypes.KAESE, new Properties(50, 100, 100, 1000, 1, 100),
            ProductTypes.WEIN, new Properties(30, 365, 300, 5000, 1, 50),
            ProductTypes.AEPFEL, new Properties(14, 28, 100, 400, 1, 100)
    );
}
