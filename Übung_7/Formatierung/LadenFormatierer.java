package Formatierung;
import Datenansammlung.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

/**
 * Created by cemsaygili on 13.12.17.
 */
public class LadenFormatierer implements Formatierer{

    protected Stand state = Stand.DAS_ENDE;
    protected Bestellung bestellung = null;



    public Bestellung splitDenString(Ort ortsangabe, String datenString) {

        if (datenString.toLowerCase().endsWith("beginn"))
        {
            state = Stand.ERZEUGEN;
        } else if
                (state == Stand.ERZEUGEN)
        {
            state = Stand.ZEIT_EINSTELLEN;
        } else if
                (state == Stand.ZEIT_EINSTELLEN) {
            state = Stand.PART;
        } else if (datenString.toLowerCase().matches
                ("(lieferung [0-9]*km)|(keine lieferung)"))
        {
            state = Stand.LIEFERER;
        } else if
                (datenString.toLowerCase().endsWith("ende"))
        {
            state = Stand.DAS_ENDE;
        }

        switch (state)
        {
            case ERZEUGEN:
            {
                bestellung = new Bestellung();
                bestellung.setOrt(ortsangabe);
                bestellung.setBestellungsursprung(Bestellungsursprung.LADEN);
                break;
            }
            case ZEIT_EINSTELLEN:
            {
                bestellung.setZeitstempel(parseDate(datenString));
                break;
            }
            case PART:
            {
                addArtikel(datenString, new int[]{0, 1, 2, 3});
                break;
            }
            case LIEFERER:
            {
                setLieferung(datenString);
                break;
            }
            case DAS_ENDE:
            {
                return bestellung;
            }
            default:
            {
                return null;
            }
        }

        return null;
    }

    protected LocalDateTime parseDate(final String eingabe)
    {
        return LocalDate.parse(eingabe).atStartOfDay();
    }

    protected void setLieferung(final String eingabe)
    {
        Lieferung lieferung;

        String line = eingabe.replaceAll("[^\\d.]", "");

        if (line.length() > 0)
            lieferung = new Lieferung(true, Integer.parseInt(line));
        else
            lieferung = new Lieferung();

        bestellung.setLieferung(lieferung);
    }
    protected void addArtikel(final String eingabe, final int[] indexArray)
    {
        String[] splits = eingabe.split(",|\\|");

        if (splits.length < 4)
        {
            System.err.println("Eingaben: " + eingabe);
            System.err.println("Läuft nicht!");

            return;
        }

        String name = splits[indexArray[0]];
        float preis = Float.parseFloat(splits[indexArray[1]]);
        int menge = Integer.parseInt(splits[indexArray[2]]);
        Steuern analyseSteuern = Steuern.analyseSteuern(splits[indexArray[3]]);

        Artikel item = new Artikel(name,menge, preis, analyseSteuern);
        bestellung.addArtikel(item);
    }


}
