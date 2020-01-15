package zivil;

import java.util.Scanner;

/**
 * Created by cemsaygili on 03.12.17.
 */
public class Passagierflugzeug extends Flugzeug{

    protected int fahrgaeste = 0;

    public Passagierflugzeug(int laenge, int piloten, int fahrgaeste) {
        super(laenge, piloten);
    }


    public int getFahrgaeste() {
        return fahrgaeste;
    }

    public void setFahrgaeste(int fahrgaeste) {
        this.fahrgaeste = fahrgaeste;
    }

    public void abfliegen() {
        System.out.println("Ihr Flug wird in kürze starten.");
    }

    public void landen() {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Minuten eingeben: ");
        int minuten = eingabe.nextInt();
        System.out.println("So viele Minuten bis zur Landung " + minuten);
    }

    public String toString() {
        String returnString = "Passagierflugzeug: " + fahrgaeste;
        return returnString;
    }
}
