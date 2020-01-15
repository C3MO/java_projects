/**
 * Created by cemsaygili on 26.11.17.
 */
public class Zeitschrift extends Artikel{

    protected String name = "";
    protected String redakteur = "";

    public Zeitschrift(double preis,int isbn, String name, String redakteur) {
        super(isbn,preis);
        this.name = name;
        this.redakteur = redakteur;

    }

    public String getName() {
        return name;
    }


    public String getRedakteur() {
        return redakteur;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setRedakteur(String redakteur) {
        this.redakteur = redakteur;
    }


    public String toString() {
        String returnString = "Zeitschrift: \"" + name + "\" / "
                + redakteur;
        return returnString;
    }
}
