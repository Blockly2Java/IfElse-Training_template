Oft soll ein bestimmter Programmteil nur ausgeführt werden, wenn eine Bedingung erfüllt ist, z.B.
- Wenn ein Felsen das Raumschiff trifft, soll ein Leben abgezogen werden.
- Wenn die Anzahl der Leben auf 0 sinkt, ist das Spiel beendet.
- …

Für diese Zwecke gibt es die if-Anweisung.

Zur Auffrischung kannst du dieses [Video von The Simple Club](https://youtu.be/BBNrEkv_Sw4?si=OtRK7QROp1fbxEEo) schauen.

---

## Aufgaben

Wie immer kannst du deine Methoden in der main-Methode testen. Die Vorlage enthält bereits alle Methodenaufrufe in der main.
Du kannst sie beliebig anpassen.

#### Aufgabe 1: Hallo!
Die Vorlage enthält bereits einen Block, der den Nutzer nach einer Texteingabe fragt.

Je nach Eingabe soll eine andere Ausgabe auf der Konsole erfolgen (zur Erinnerung: das geht mit print):
- Wenn der Nutzer "Hallo" eingibt, soll `"Servus!"` ausgegeben werden.
- Ansonsten `"Keine Ahnung, was du willst."`

#### Aufgabe 2
Die Methodenvorlage enthält bereits zwei Parameter. Aufgabe ist es, deren Werte zu vergleichen und einen entsprechenden 
Text auf der Konsole auszugeben.

Verwende hierfür die (Un)Gleichheitszeichen `=`,`<`,`>`.
Du musst keine Leerzeichen verwenden.

Ausgabe wenn die Zufallszahl `15` und `26` wären:
```java
15<26
```

#### Aufgabe 3: Blocksatz 25er Einmal-Eins

Gib für das 25er-Einmal-Eins (also alle Multiplikationen mit Faktoren 1 bis 25) eine Ergebnistabelle aus. Hierbei sollen alle Zeilen exakt gleich lang sein. Bei Zahlen mit weniger Ziffern als die größte Zahl müssen daher führende Nuller eingefügt werden. Die einzelnen Zahlen werden dabei durch genau ein Leerzeichen getrennt.

Für das 5er-Einmal-Eins würde die Tabelle folgendermaßen aussehen:
```java
01 02 03 04 05 
02 04 06 08 10 
03 06 09 12 15 
04 08 12 16 20 
05 10 15 20 25 
```

Für das 25er-Einmal-Eins dann entsprechend so:
```java
001 002 ... 025 
020 004 ... 050 
... ... ... ... 
025 050 ... 625
```

Tipp: Eine Ausgabe, nach der **keine neue Zeile** begonnen wird, macht man mit folgender Methode: `System.out.print("Ausgabetext")` 
