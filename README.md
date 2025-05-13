# DevOps 07 CI1

## Lernjournal

| Schritt | Beschreibung | Screenshot |
|--------|--------------|------------|
| 1 | Ich habe ein neues Repository erstellt und die Grundstruktur mit `frontend`, `backend` und `gradle` vorbereitet. Dazu habe ich die `README.md` und `build.gradle` Datei hochgeladen.. | ![CI-01.png](images/CI-01.png) |
| 2 | Anschliessend habe ich die `build.gradle` Datei angepasst und das `jacoco` Plugin hinzugefügt, um später die Testabdeckung zu messen. Danach habe ich erfolgreich ein erstes Build mit `./gradlew build` durchgeführt. | ![CI-02.png](images/CI-02.png) |
| 3 | Ich habe die `build.gradle` Datei um die benötigten `dependencies` und den Task `jacocoTestReport` erweitert. Damit wird beim Testen automatisch ein HTML-Report erzeugt. | ![CI-03.png](images/CI-03.png) |
| 4 | Ich habe in `ExampleTest.java` einen einfachen Unit-Test geschrieben, um JUnit korrekt einzubinden. Der Test wurde mit `./gradlew test` erfolgreich ausgeführt. | ![CI-04.png](images/CI-04.png) |
| 5 | Der Test wurde mit `./gradlew test` erfolgreich ausgeführt. | ![CI-05.png](images/CI-05.png) |
| 6 | Anschliessend habe ich die `FizzBuzz` Klasse erstellt und begonnen, verschiedene Testfälle in der `FizzBuzzTest.java` Datei zu schreiben, z. B. für Vielfache von 3, 5 und 15. | ![CI-06.png](images/CI-06.png) |
| 7 | Ich habe die Methode `convert()` in der `FizzBuzz.java` Datei implementiert, um je nach Eingabe entsprechende Strings zurückzugeben. | ![CI-07.png](images/CI-07.png) |
| 8 | Nach dem Ausführen der Tests habe ich mit JaCoCo den Coverage-Report geöffnet und überprüft. Die `FizzBuzz`-Tests waren vollständig abgedeckt. | ![CI-08.png](images/CI-08.png) |
| 9 | Ich habe zusätzliche Testfälle für negative Zahlen implementiert (z. B. `-1`, `-3`, `-5`, `-15`) und so die Testabdeckung weiter erhöht. | ![CI-09.png](images/CI-09.png) |
