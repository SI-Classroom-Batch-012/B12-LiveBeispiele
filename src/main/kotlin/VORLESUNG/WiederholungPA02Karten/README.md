<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Kartenspiel</h3>
<br>

<p align="center">
  <img width="175" height="300" src="img/img.jpg" />
</p>

### Beschreibung
In dieser Aufgabe soll ein Kartenspiel entwickelt werden. Du triffst dich mit deinen Freundinnen oder Freunden, um Karten zu spielen. Aber heute hat niemand von euch ein Kartendeck dabei. Da kommt dir eine brillante Idee: Warum nicht einfach ein digitales Kartenspiel programmieren? Du bist neugierig und entschlossen, es auszuprobieren. 
Du öffnest IntelliJ und legst los!

Datei für alle Aufgaben: *Main.kt*

> #### Hinweise zur Bearbeitung
> - Achte darauf, dass dein Quellcode sauber ist. Besonders die Einrückungen sind wichtig!
> - Verwende Dokumentationskommentare, um deinen Code zu erklären und zu dokumentieren.
> - Teste deinen Code. Er sollte nicht nur kompilieren und ausführbar sein, sondern auch das gewünschte Ergebnis liefern.
> - `Commit & Push` dein Ergebnis am Ende des Tages
<br>

<details>
<summary> <b> Aufgabe 1 - Kartenstapel mischen</b> </summary>

Schau dir den vorgegebenen Code in der `Main.kt` Datei an. Lies dir die Beschreibungen der Variablen durch

Zuerst müssen die Karten gemischt werden.

- bringe die Karten in der `cards` Liste in eine zufällige Reihenfolge. Das sind die Spielkarten.

</details>

---

<details>
<summary> <b> Aufgabe 2 - Spielernamen eingeben </b> </summary>

Um das Spiel zu starten, müssen vorher die Spielernamen eingegeben werden

- Programmiere eine Benutzerinteraktion
- Speichere die Namen von Spieler1 und Spieler2 in Variablen ab

So könnte die Konsolenausgabe aussehen:

```text
Spieler 1, bitte gib deinen Namen ein...
Max
Spieler 2, bitte gib deinen Namen ein...
Moritz
```

</details>

---

<details>
<summary> <b> Aufgabe 3 - Karten ziehen </b> </summary>

Das Spiel geht los! Jeder Spieler zieht drei Karten aus dem Stapel und nimmt sie auf die Hand.

- Gib beiden Spielern eine "Hand" (Liste)
- Beide Spieler ziehen abwechselnd die erste Karte aus dem Stapel bis jeder Spieler drei Karten auf der Hand hat
- Der Stapel hat am Ende 6 Karten weniger
- Gib auf der Konsole aus, wenn jemand eine Karte gezogen hat
- Gib aus, welche Karten die Spieler jetzt haben

So könnte die Konsolenausgabe aussehen:

```text
Max zieht eine Karte...
Moritz zieht eine Karte...
Max zieht eine Karte...
Moritz zieht eine Karte...
Max zieht eine Karte...
Moritz zieht eine Karte...

Max's Karten: [♦️10, ♣️D, ♥️9]
Moritz's Karten: [♠️9, ♣️9, ♠️A]
```

</details>

---

<details>
<summary> <b> Aufgabe 4 - Spieler stehlen Gegner-Karte </b> </summary>

Die Regeln besagen, dass die Spieler jetzt die Möglichkeit haben, eine Karte vom Gegenspieler zu stehlen

- Entferne eine zufällige Karte von Spieler 2 und gib sie Spieler 1
- Entferne eine zufällige Karte von Spieler 1 und gib sie Spieler 2
- Gib auf der Konsole aus, **welche Karte** jeweils gestohlen wurde
- Gib aus, welche Karten die Spieler jetzt haben

So könnte die Konsolenausgabe aussehen:

```text
Max hat die Karte ♣️9 von Moritz gestohlen
Moritz hat die Karte ♣️D von Max gestohlen

️Max's Karten: [♦️10, ♥️9, ♣️9]
Moritz's Karten: [♠️9, ♠️A, ♣️D]
```

</details>

---

<details>
<summary> <b> Aufgabe 5 - Spieler dürfen Karte neu ziehen </b> </summary>

Die Spieler haben jetzt noch einmal die Möglichkeit, eine Karte abzuwerfen und eine neue Karte aus dem Stapel zu ziehen.

- Programmiere eine Benutzerinteraktion
- Beide Spieler sollen nacheinander eine Zahl zwischen 1 und 3 eingeben können
- Die entsprechende Karte soll entfernt werden
- Die oberste Karte aus dem Stapel soll gezogen werden
- Gib jeweils auf der Konsole aus, welche Karte abgeworfen wurde und welche gezogen wurde

So könnte die Konsolenausgabe aussehen:

```text
Max, wirf eine Karte ab! Welche willst du abwerfen? 1 / 2 / 3
3
Max hat die Karte ♣️9 abgeworfen und die Karte ♦️B gezogen

Moritz, wirf eine Karte ab! Welche willst du abwerfen? 1 / 2 / 3
1
Moritz hat die Karte ♠️9 abgeworfen und die Karte ♣️B gezogen
```

</details>

---

<details>
<summary> <b> Aufgabe 6 - Wer hat bessere Karten?</b> </summary>

Das Spiel ist beendet! Gewonnen hat der Spieler mit den meisten Gesamtpunkten auf der Hand!
Dafür werden die Werte aller Karten auf der Hand zusammengerechnet.

- Rechne den Gesamtwert der Karten für jeden Spieler aus. Nutze dafür die `cardValues` Map
- Gib für jeden Spieler die Information aus

So könnte die Konsolenausgabe aussehen:

```text
Max's Karten [♦️10, ♥️9, ♦️B] haben einen Wert von: 12
Moritz's Karten [♠️A, ♣️D, ♣️B] haben einen Wert von: 19
```

</details>

---

<details>
<summary> <b> Bonus - Mehr Spielzüge </b> </summary>

Erfinde weitere Spielregeln und Spielzüge und baue sie in das Programm ein!
Beispiele:

- Es gewinnt der Spieler mit der wertvollsten Karte
- Ein Spieler darf den anderen nach einer Karte fragen. Falls dieser die Karte hat, muss er sie abgeben
- ...

</details>

---
