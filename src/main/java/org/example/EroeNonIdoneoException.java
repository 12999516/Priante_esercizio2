package org.example;

public class EroeNonIdoneoException extends Exception {
    private final String nomeEroe;
    private final int livelloPotere;

    public EroeNonIdoneoException(String messaggio, String nomeEroe, int livelloPotere) {
        super(messaggio);
        this.nomeEroe = nomeEroe;
        this.livelloPotere = livelloPotere;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivelloPotere() {
        return livelloPotere;
    }
}