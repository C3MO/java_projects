/**
 * Created by cemsaygili on 26.11.17.
 */
public class MainProgramm {
    public static void main(String[] args) {
        //-----------------------------
        // Objekte instanziieren
        Buch MeinBuch = new Buch("Alice im Wunderland", "Lewis Caroll", 22222, 12.90);
        Artikel MeinArtikel = new Artikel(11111, 1.50);
        Buch MeinBuch2 =new Buch("Green Eggs","Dr. Suess",33333,5.90);
        eBuch MeineBuch = new eBuch("Der Zauberer von Oz", "Frank L. Baum", "eBub", 44444, 2.95);
        Hoerbuch MeinHoerbuch = new Hoerbuch("Heidi","Johanna Spyri",55555,16.90,240);
        Zeitschrift MeineZeitschrift = new Zeitschrift(4.50,66666,"Stern", "Robert Reich");


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("1. Scenario");
        System.out.println("Preis vorher: "+MeinBuch.getPreis());
        MeinBuch.setTitel("Alice im Wunderland");
        MeinArtikel.setPreis(9.99);
        System.out.println(MeinBuch);
        System.out.println(MeinBuch.getTitel());
        System.out.println("Preis Nachher: "+MeinArtikel.getPreis());


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("2. Scenario");
        System.out.println("Preis vorher: "+MeineBuch.getPreis());
        MeineBuch.setTitel("Der Zauberer von Oz ");
        MeinArtikel.setPreis(4.95);
        System.out.println(MeineBuch);
        System.out.println(MeineBuch.getTitel());
        System.out.println("Preis Nachher: "+MeinArtikel.getPreis());

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("3. Scenario");
        System.out.println("Datei format vorher: "+MeineBuch.getFormat());
        MeineBuch.setTitel("Der Zauberer von Oz ");
        MeineBuch.setFormat("PDF");
        System.out.println(MeineBuch);
        System.out.println(MeineBuch.getTitel());
        System.out.println("Preis Nachher: "+MeineBuch.getFormat());

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("4. Scenario");
        System.out.println("Redaktuer(in) vorher: "+MeineZeitschrift.getRedakteur());
        MeineZeitschrift.setName("Stern");
        MeineZeitschrift.setRedakteur("Roberta Ritter");
        System.out.println(MeineZeitschrift);
        System.out.println("Redakteur(in) Nachher: "+ MeineZeitschrift.getRedakteur());


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("5. Scenario");
        System.out.println(MeinBuch);
        System.out.println(MeinArtikel);
        System.out.println(MeinBuch2);
        System.out.println(MeineBuch);
        System.out.println(MeinHoerbuch);
        System.out.println(MeineZeitschrift);

    }
}
