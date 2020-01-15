import java.time.chrono.MinguoChronology;

/**
 * Created by cemsaygili on 26.11.17.
 */
public class Hoerbuch extends Buch {
    protected int minuten = 0;


    public Hoerbuch(String titel,String autor, int isbn, double preis,int minuten) {
        super(titel,autor,isbn,preis);
        this.minuten = minuten;


    }

    public int getMinuten() {
        return minuten;
    }




    public void setMinuten(int minuten) {
        this.minuten = minuten;
    }




    public String toString() {
        String returnString = "Hoerbuch: " + minuten + " Minuten";
        return returnString;
    }
}
