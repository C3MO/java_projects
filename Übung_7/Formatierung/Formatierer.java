package Formatierung;

import Datenansammlung.Bestellung;
import Datenansammlung.Ort;

/**
 * Created by cemsaygili on 13.12.17.
 */

public interface Formatierer
{

        public Bestellung splitDenString(Ort ortsangabe, String daten);

    public enum Stand
{
    ZEIT_EINSTELLEN,
    ERZEUGEN,
    LIEFERER,
    PART,
    DAS_ENDE
}
}