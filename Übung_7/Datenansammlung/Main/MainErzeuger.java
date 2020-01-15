package Datenansammlung.Main;

import Datenansammlung.Bestellung;
import Datenansammlung.Ort;
import Formatierung.Formatierer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cemsaygili on 17.12.17.
 */
public class MainErzeuger {

    private List<Bestellung> derCache;
    private boolean benutzeCache = false;

    public MainErzeuger()
    {
    }

    public void generiereDenCache()
    {
        this.benutzeCache = true;
        this.derCache = new ArrayList<Bestellung>();
    }

    public List<Bestellung> getCache()
    {
        return this.derCache;
    }

    public List<Bestellung> toBestellungList(final Ort ortsangabe, String[] eingabe, final Formatierer formatierer)
    {
        List<Bestellung> list;

        if (benutzeCache)
            list = this.derCache;
        else
            list = new ArrayList<Bestellung>();

        for (String daten : eingabe)
        {
            Bestellung best = formatierer.splitDenString(ortsangabe, daten);

            if (best != null)
                list.add(best);
        }

        if (benutzeCache)
            return null;
        return list;
    }
}
