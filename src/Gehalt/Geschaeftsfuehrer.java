package Gehalt;

public class Geschaeftsfuehrer extends Manager {

    private final int zulage;

    public Geschaeftsfuehrer(int gGehalt, int provision, int Umsatz, int zulage) {
        super(gGehalt, provision, Umsatz);
        this.zulage = zulage;
    }

    @Override
    public int berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
