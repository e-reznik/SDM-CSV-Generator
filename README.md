# SDM CSV-Generator
Dies ist der CSV-Generator für die SDM-Produkte.  
[Das Hauptprogramm finden Sie hier.](https://github.com/e-reznik/SDM) Als externe Bibliothek wurde [opencsv](http://opencsv.sourceforge.net/) verwendet.

## Struktur

Die generierte CSV hat die folgende Struktur

```csv
BESTBEFORE,PRICE,QUALITY,TITLE,TYPE
55,917.0,14,FETA,KAESE
71,390.0,33,CAMEMBERT,KAESE
80,696.0,6,HARZER,KAESE
193,4590.0,23,SANGIOVESE,WEIN
250,3509.0,42,SANGIOVESE,WEIN
16,312.0,19,JONAGOLD,AEPFEL
```

# Eigenschaften
Ein Produkt hat eine Reihe von Eigenschaften, die zufällig aus vorher definierten Bereichen gewählt werden.

## Produkttypen
Die Produkte können vom folgenden Typ sein:
 - Käse  (vorgegeben)
 - Wein (vorgegeben)
 - Apfel
 
Dabei gibt es für jeden Produkttypen eine Reihe von möglichen Bezeichnungen:

 - Käse
   - BERGKAESE
   - BRIMSEN
   - BRIE
   - ...
 - Wein
   - RIESLING
   - SAUVIGNON_BLANC
   - CHARDONNAY
   - ...
 - Äpfel
   - GRANNY_SMITH
   - ELSTAR
   - BOSKOP

##  Kriterien
Weiterhin hat ein Produkt die folgenden Kriterien
 - MHD (Mindesthaltbarkeitsdatum in Tagen)
 - Preis (in Cent)
 - Qualität
 
 Wobei für jeden Produkttypen individuelle Kriterienbereiche definiert wurden. Beispielsweise wird das MHD beim Käse zufällig aus einem Bereich von 10 bis 100 Tagen ausgewählt, während es beim Wein zwischen 30 und 365 Tagen betragen kann.
