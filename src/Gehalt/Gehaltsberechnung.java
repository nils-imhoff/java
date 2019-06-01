package Gehalt;



public class Gehaltsberechnung {
    
    public static void main(String[] args) {
        Arbeiter aMitarbeiter = new Arbeiter(10, 40);
        Angestellter bMitarbeiter = new Angestellter(5000, 300 );
        Geschaeftsfuehrer cMitarbeiter = new Geschaeftsfuehrer(10000, 1000, 500, 700);

        double Lohn = aMitarbeiter.berechneGehalt();
        double Gehalt = bMitarbeiter.berechneGehalt();
        double bGehalt = cMitarbeiter.berechneGehalt();
        System.out.println("Arbeiter: " + Lohn + " Angestellter: " + Gehalt +" Geschaeftsfuehrer: " + bGehalt);
    }
}
