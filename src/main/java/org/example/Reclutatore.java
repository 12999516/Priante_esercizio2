package org.example;

import net.datafaker.Faker;

public class Reclutatore {
    private final Faker faker;

    public Reclutatore() {
        this.faker = new Faker();
    }

    public void reclutaEroe(int difficoltaMissione) throws EroeNonIdoneoException {
        // Generazione di nome e livello tramite Datafaker (estremo superiore 101 escluso -> da 1 a 100)
        String nomeEroe = faker.superhero().name();
        int livelloPotere = faker.number().numberBetween(1, 101);

        System.out.printf("Candidato presentato: %s (Livello Potere: %d/100)%n", nomeEroe, livelloPotere);

        // Verifica del requisito di idoneità
        if (livelloPotere < difficoltaMissione) {
            throw new EroeNonIdoneoException(
                    "Livello di potere inferiore alla soglia richiesta dalla missione.",
                    nomeEroe,
                    livelloPotere
            );
        }

        // Se non viene lanciata l'eccezione, il candidato è ammesso
        System.out.printf("--> IDONEO! %s è stato reclutato con successo per la missione.%n", nomeEroe);
    }
}