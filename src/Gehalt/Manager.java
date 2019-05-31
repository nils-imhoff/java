package Gehalt;

public class Manager extends Mitarbeiter {

    private final int gGehalt;
    private final int provision;
    private final int Umsatz;

    public Manager(int gGehalt, int provision, int Umsatz) {
        this.gGehalt = gGehalt;
        this.provision = provision;
        this.Umsatz = Umsatz;
    }

    @Override
    public int berechneGehalt() {
        return gGehalt + provision * Umsatz;
    }
}