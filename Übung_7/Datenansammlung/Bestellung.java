package Datenansammlung;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by cemsaygili on 12.12.17.
 */
public class Bestellung {


    protected static long naechsteBestellungId = 1;
    protected Ort ortsangabe;
    protected Bestellungsursprung ursprung;
    protected List<Artikel> items;
    protected Lieferung liefern;
    protected LocalDateTime zeitstempel;
    protected final long id;

    private static float backwardsTax09 = (float) (1 / 1.09);
    private static float backwardsTax17 = (float) (1 / 1.17);

        public Bestellung()
        {
            this.items = new ArrayList<Artikel>();
            this.liefern = null;
            this.zeitstempel = null;

            this.id = naechsteBestellungId; naechsteBestellungId++;
        }

        public final long getId()
        {
            return this.id;
        }

        public void setOrt(Ort ortsangabe)
        {
            this.ortsangabe = ortsangabe;
        }

        public Ort getOrt()
        {
            return this.ortsangabe;
        }

        public void addArtikel(final Artikel artikel)
        {
            items.add(artikel);
        }

        public void setLieferung(final Lieferung liefern)
        {
            this.liefern = liefern;
        }

        public float getArtikelPreis()
    {
        float preis = 0F;
        for (Artikel item : items)
            preis += item.getPreis();

        return preis;
    }
        public LocalDateTime getZeitstempel() {
            return zeitstempel;
        }

        public void setZeitstempel(LocalDateTime zeitstempel) {
            this.zeitstempel = zeitstempel;
        }



        public boolean istGeliefert()
        {
            return liefern.wirdGeliefert();
        }

        public void setBestellungsursprung(Bestellungsursprung blu)
        {
            this.ursprung = blu;
        }

        public Bestellungsursprung getUrsprung()
        {
            return this.ursprung;
        }
        public float getBestellungspreis()
    {
        return getArtikelPreis() + getBestellungskosten();
    }

        public float getSteuern()
    {
        return getArtikelPreis() - getSteuerFrei();
    }

        public float getSteuerFrei()
    {
        float preis = 0F;

        for (Artikel item : items)
            preis += item.getPreis() * (item.getSteuern() == Steuern.NORMAL ? backwardsTax17 : backwardsTax09);

        return preis;
    }
        public float getBestellungskosten()
    {
        if (ortsangabe == Ort.BERLIN)
            if (!liefern.wirdGeliefert() || liefern.getAbstand() <= 50)
                return 0F;
            else
                return Math.max(10.0F, 0.05F * getArtikelPreis());

        else if (ortsangabe == Ort.BRANDENBURG)
            if (!liefern.wirdGeliefert() || liefern.getAbstand() <= 30)
                return 0F;
            else if (liefern.getAbstand() > 30 && liefern.getAbstand() <= 149)
                return Math.max(15.0F, 0.05F * getArtikelPreis());
            else
                return Math.max(15.0F, 0.07F * getArtikelPreis());

        return 0.0F;
    }

}


