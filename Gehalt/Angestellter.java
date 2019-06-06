package Gehalt;

public class Angestellter extends Mitarbeiter {
    private final int  gGehalt;
    private final int zulage;

    public Angestellter(int gGehalt, int zulage) {
        this.gGehalt = gGehalt;
        this.zulage = zulage;
    }

    @Override
    public int berechneGehalt() {

        return gGehalt + zulage;
    }
}
