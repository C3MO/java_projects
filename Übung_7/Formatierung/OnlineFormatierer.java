package Formatierung;
import Datenansammlung.Bestellung;
import Datenansammlung.Bestellungsursprung;
import Datenansammlung.Ort;

import java.time.LocalDateTime;

/**
 * Created by cemsaygili on 13.12.17.
 */
public class OnlineFormatierer extends LadenFormatierer {

    public OnlineFormatierer()
    {
        state = Stand.ERZEUGEN;
    }
    @Override
    protected LocalDateTime parseDate(String eingabe) {
        return LocalDateTime.parse(eingabe);
    }
    @Override
    public Bestellung splitDenString(Ort ortsangabe, String datenString)
    {
        if (state == Stand.ERZEUGEN)
        {
            state = Stand.ZEIT_EINSTELLEN;
        } else if
                (state == Stand.ZEIT_EINSTELLEN) {
            state = Stand.LIEFERER;
        } else if
                (state == Stand.LIEFERER)
        {
            state = Stand.PART;
        } else if (datenString.toLowerCase().matches("---*"))
        {
            state = Stand.DAS_ENDE;
        }

        switch (state)
        {
            case ERZEUGEN:
            case ZEIT_EINSTELLEN:
            {
                bestellung = new Bestellung();
                bestellung.setOrt(ortsangabe);
                bestellung.setBestellungsursprung(Bestellungsursprung.ONLINE);

                bestellung.setZeitstempel(parseDate(datenString));
                break;
            }
            case PART:
            {
                addArtikel(datenString, new int[]{0, 1, 3, 2});
                break;
            }
            case LIEFERER:
            {
                setLieferung(datenString);
                break;
            }
            case DAS_ENDE:
            {
                state = Stand.ERZEUGEN;
                return bestellung;
            }
            default:
            {
                return null;
            }
        }

        return null;
    }


}
