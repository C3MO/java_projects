package Datenansammlung.Main;

import Datenansammlung.*;
import Formatierung.LadenFormatierer;
import Formatierung.OnlineFormatierer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cemsaygili on 17.12.17.
 */
public class Main {

    private List<Bestellung> bestellungen;

    private Main()
    {
        bestellungen = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.run();
    }

    private void run()
    {
        MainErzeuger erz = new MainErzeuger();
        erz.generiereDenCache();

        Ort ortsangabe = Ort.BERLIN;
        erz.toBestellungList(ortsangabe,Daten.getDatenVonBerlinLaden(), new LadenFormatierer());
        erz.toBestellungList(ortsangabe, Daten.getDatenVonBerlinOnline(), new OnlineFormatierer());

        ortsangabe = Ort.BRANDENBURG;
        erz.toBestellungList(ortsangabe, Daten.getDatenVonBrandenburgLaden(), new LadenFormatierer());
        erz.toBestellungList(ortsangabe, Daten.getDatenVonBrandenburgOnline(), new OnlineFormatierer());

        bestellungen = erz.getCache();

        System.out.println("Bestellungen: " + bestellungen.size());

        float steuern = 0F;
        float einkommen = 0F;


        for (Bestellung bestellung : bestellungen)
        {
            steuern += bestellung.getSteuern();

            einkommen += bestellung.getSteuerFrei();
            einkommen += bestellung.getBestellungskosten();
        }
System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("alle Bestellungen für die ganze Firma (egal Berlin / Brandenburg / Abholung / Lieferung / im Laden / online)");
        System.out.println("1. Szenario : " + "\n Steuern: " + steuern + "\n Einkommen: " + einkommen);


        steuern = 0F;
        einkommen = 0F;

        for (Bestellung bestellung : bestellungen)
        {
            if (bestellung.getOrt() == Ort.BERLIN)
            {
                steuern += bestellung.getSteuern();

                einkommen += bestellung.getSteuerFrei();
                einkommen += bestellung.getBestellungskosten();
            }
        }

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("alle Bestellungen für Berlin (egal Abholung / Lieferung / im Laden / online)");
        System.out.println("2. Szenario: " + "\n Steuern: " + steuern + " \n Einkommen: " + einkommen);

        steuern = 0F;
        einkommen = 0F;

        for (Bestellung bestellung : bestellungen)
        {
            if (bestellung.getUrsprung() == Bestellungsursprung.ONLINE)
            {
                steuern += bestellung.getSteuern();

                einkommen += bestellung.getSteuerFrei();
                einkommen += bestellung.getBestellungskosten();
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("alle online Bestellungen (egal Berlin / Brandenburg / Abholung / Lieferung)");
        System.out.println("3. Szenario: " + "\n Steuern: " + steuern + "\n Einkommen: " + einkommen);


        steuern = 0F;
        einkommen = 0F;

        for (Bestellung bestellung : bestellungen)
        {
            if (bestellung.getOrt() == Ort.BRANDENBURG && bestellung.getUrsprung() == Bestellungsursprung.LADEN)
            {
                steuern += bestellung.getSteuern();

                einkommen += bestellung.getSteuerFrei();
                einkommen += bestellung.getBestellungskosten();
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("alle Bestellungen im Landen in Brandenburg (egal Abholung / Lieferung)");
        System.out.println("4. Szenario: " + "\n Steuern: " + steuern + "\n Einkommen: " + einkommen);


        steuern = 0F;
        einkommen = 0F;

        for (Bestellung bestellung : bestellungen)
        {
            if (bestellung.getOrt() == Ort.BERLIN &&
                    bestellung.getUrsprung() == Bestellungsursprung.ONLINE &&
                    bestellung.istGeliefert())
            {
                steuern += bestellung.getSteuern();

                einkommen += bestellung.getSteuerFrei();
                einkommen += bestellung.getBestellungskosten();
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("alle online geliefert Bestellungen in Berlin");
        System.out.println("5. Szenario: " + "\n Steuern: " + steuern + "\n Einkommen: " + einkommen);
        System.out.println("-----------------------------------------------------------------------------------------------------");

    }
}

