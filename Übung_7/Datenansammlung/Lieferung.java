package Datenansammlung;

/**
 * Created by cemsaygili on 12.12.17.
 */
public class Lieferung {
    private boolean liefern;
    private float abstand;

    public Lieferung(final boolean liefern, final float abstand)
    {
        this.liefern = liefern;
        this.abstand = abstand;
    }

    public Lieferung()
    {
        this(false, 0);
    }

    public boolean wirdGeliefert() {
        return liefern;
    }

    public float getAbstand() {
        return abstand;
    }
}
