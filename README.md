# SDM CSV-Generator
Dies ist der CSV-Generator für die SDM-Produkte.  
[Das Hauptprogramm finden Sie hier.](https://github.com/e-reznik/SDM) Als externe Bibliothek wurde [opencsv](http://opencsv.sourceforge.net/) verwendet.

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
