package org.example;

public class Main {
    public static void main(String[] args) {
        Reclutatore reclutatore = new Reclutatore();
        int difficoltaMissione = 75;
        int numeroTentativi = 5;
        int eroiReclutati = 0;

        System.out.println("=== AVVIO RECLUTAMENTO MISSIONE (Difficoltà richiesta: " + difficoltaMissione + ") ===\n");

        for (int tentativo = 1; tentativo <= numeroTentativi; tentativo++) {
            System.out.println("[Tentativo " + tentativo + " di " + numeroTentativi + "]");

            try {
                reclutatore.reclutaEroe(difficoltaMissione);
                eroiReclutati++;
            } catch (EroeNonIdoneoException e) {
                System.out.printf("--> SCARTATO: %s ha un livello di potere pari a %d (deficit di %d punti).%n",
                        e.getNomeEroe(),
                        e.getLivelloPotere(),
                        (difficoltaMissione - e.getLivelloPotere()));
            }

            System.out.println("------------------------------------------------------------");
        }

        System.out.printf("%nReclutamento terminato: %d supereroi idonei su %d candidati valutati.%n",
                eroiReclutati, numeroTentativi);
    }
}