package Gehalt;

import java.util.ArrayList;
import java.util.List;

public class Gehaltsberechnung {

    private List<Mitarbeiter> aMitarbeiter;

    public Gehaltsberechnung(List<Mitarbeiter> aMitarbeiter) {
        this.aMitarbeiter = aMitarbeiter;
    }

    public int berechneAlleGehaelter() {
        int result = 0;
        for (Mitarbeiter mitarbeiter : aMitarbeiter) {
            result += mitarbeiter.berechneGehalt();
        }
        return result;
    }

    public int berechneAlleGehaelter8() {
        return aMitarbeiter.stream()
                .map(a -> a.berechneGehalt())
                .reduce((a1, a2) -> a1 + a2).orElseGet(() -> 0);
    }


    public static List<Mitarbeiter> aMitarbeiter() {
        List<Mitarbeiter> result = new ArrayList<>();
        result.add(new Arbeiter(10, 150));
        result.add(new Angestellter(3000, 1000));
        return result;
    }

    public static void main(String[] args) {
        List<Mitarbeiter> bMitarbeiter = aMitarbeiter();

        Gehaltsberechnung gehaltsberechnung = new Gehaltsberechnung(bMitarbeiter);
        System.out.println(gehaltsberechnung.berechneAlleGehaelter());
    }
}
