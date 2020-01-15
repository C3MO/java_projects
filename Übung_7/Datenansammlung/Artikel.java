package Datenansammlung;

/**
 * Created by cemsaygili on 12.12.17.
 */
public class Artikel {
    private String name;
    private int menge;
    private Steuern steuer;
    private float preis;

    public Artikel(final String name, final int menge, final float preis, final Steuern steuer)
    {
        this.name = name;
        this.menge = menge;

    }

    public Artikel(final String name, final float preis, final Steuern steuer)
    {
        this(name, 1, preis, steuer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }
    public Steuern getSteuern() {
        return steuer;
    }

    public void setSteuern(Steuern steuer) {
        this.steuer = steuer;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

}
