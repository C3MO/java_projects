package zivil;
import java.util.*;

/**
 * Created by cemsaygili on 03.12.17.
 */
public class Flugzeug {

    protected int laenge = 0;
    protected int piloten = 0;

public Flugzeug(int laenge, int piloten){
    this.laenge = laenge;
    this.piloten = piloten;
}
    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public void setPiloten(int piloten) {
        this.piloten = piloten;
    }
    public int getPiloten() {
        return piloten;
    }
    public void abfliegen() {
        System.out.println(" Blank ");
    }

    public void landen(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Minuten eingeben: ");
        int minuten = eingabe.nextInt();
        System.out.println("So viele Minuten bis zur Landung " + minuten);

    }
    public String toString() {
        String returnString = "Flugzeug: " + "Länge: "+  laenge + "Piloten: "+piloten;
        return returnString;
    }

}
