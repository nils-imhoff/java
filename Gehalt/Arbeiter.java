package Gehalt;

public class Arbeiter extends Mitarbeiter {
    private final int stundenLohn;
    private final int stunden;

    public Arbeiter(int stundenLohn, int stunden) {
        this.stundenLohn = stundenLohn;
        this.stunden = stunden;
    }

    @Override
    public int berechneGehalt() {
        return stunden * stundenLohn;
    }
}