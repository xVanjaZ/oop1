public class Main {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
        randomNumbers();
        addNumbersInLoop();
        sawtoothPattern();
    }


    /**
     * ➔ Schrijf een programma dat met een for-lus getallen 1 tot en met 10 op het scherm toont.
     */
    private static void forLoop() {
        System.out.println("\nFor loop: ");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("=============\n");
    }

    /**
     * ➔ Maak een programma dat met een while-lus getallen 1 tot en met 10 uitprint.
     */
    private static void whileLoop() {
        System.out.println("\nWhile loop: ");

        int i = 0;
        while (i <= 10) {
            System.out.println("Count: " + i);
            i++;
        }

        System.out.println("=============\n");
    }

    /**
     * ➔ Schrijf een programma dat met een lus 10 willekeurige getallen op het scherm afdrukt. Gebruik methode Math.random om random getallen in het bereik 0.0 tot 1.0 te krijgen.
     */
    private static void randomNumbers() {
        System.out.println("\nRandom numbers: ");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Count: " + Math.random()); // Ik weet niet zeker of we deze moeten afronden
        }

        System.out.println("=============\n");
    }

    /**
     * ➔ Schrijf een programma dat de getallen 0 tot en met 39 met behulp van een lus optelt. Het antwoord zou 780 moeten zijn. Controleer of je programma correct is!
     */
    private static void addNumbersInLoop() {
        System.out.println("\nAdd numbers. Total should be 780: ");

        int total = 0;
        for (int i = 0; i <= 39; i++) {
            total += i;
            System.out.println("Added: " + i + ". New total: " + total);
        }
        System.out.println("Finished loop. Result should be 780. End result: " + total);
        System.out.println("=============\n");
    }

    /**
     * ➔ Schrijf een programma dat het volgende zaagtandpatroon met een for-lus op het scherm afdrukt. Gebruik een if-statement om de tekst halverwege weer terug naar “s” te zetten.
     */
    private static void sawtoothPattern() {
        System.out.println("\nSawtooth pattern");

        for (int i = 0; i <= 10; i++) {
            String tooth = "s";

            if (i % 2 == 0) {
                tooth += "s";
            }

            System.out.println(tooth);
        }
        System.out.println("=============\n");
    }
}
