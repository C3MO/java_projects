package zivil;

import java.util.Scanner;

/**
 * Created by cemsaygili on 03.12.17.
 */

public class Boing extends Passagierflugzeug{


  protected static boolean wifi =false;

    public Boing(int laenge, int piloten, int fahrgaeste) {
        super(laenge, piloten, fahrgaeste);
    }
    public static boolean getWifi() {
        System.out.println("Wifi: "+wifi);
        return false;

    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void wifiEinschalten() {
    wifi = true;
        System.out.println("Das Wifi wurde eingeschaltet: " +wifi);

}
    public void landen() {
        wifi = false;
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Minuten eingeben: ");
        int minuten = eingabe.nextInt();
        System.out.println("Es sind noch " + minuten + " Minuten bis zur Landung.");

        if (wifi = false){
           System.out.println("Der Wifi ist ausgeschalten");
        }
    }
    public String toString() {
        String returnString = " Länge: "+  laenge + " Minuten "+ " Piloten: "+piloten + " Wifi: " + wifi;
        return returnString;
    }


}
