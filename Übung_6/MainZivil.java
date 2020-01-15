package zivil;
import zivil.*;

/**
 * Created by cemsaygili on 04.12.17.
 */

public class MainZivil {
    public static void main(String[] args) {

        AirBus AirBus1= new AirBus(65, 2, 90);
        Boing Boing1 = new Boing(78, 3, 120);
        Boing Boing2 = new Boing(78, 2, 60);
        Boing Boing3 = new Boing(78, 3, 150);
        AirBus AirBus2 = new AirBus(65,4,180);
        Boing Boing4 = new Boing(78,4,170);

        String[] Flugzeug = new String[2];
        Flugzeug[0] = "AirBus";
        Flugzeug[1] = "Boing";

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("1. Scenario");
        System.out.println(Flugzeug[1]);
        Boing1.getWifi();
        Boing1.abfliegen();
        Boing1.wifiEinschalten();
        Boing1.landen();
        Boing1.getWifi();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("2. Scenario");
        System.out.println(Flugzeug[0]);
        AirBus1.getAutopilot();
        AirBus1.abfliegen();
        AirBus1.autoPilotEinschalten();
        AirBus1.autoPilotAusschalten();
        AirBus1.autoPilotUmschalten();
        AirBus1.landen();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("3. Scenario");
        System.out.println("Alle "+ Flugzeug[1] + " Flugzeuge");
        System.out.println(Boing1);
        System.out.println(Boing2);
        System.out.println(Boing3);
        System.out.println(Boing4);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("4. Scenario");
        System.out.println("Alle "+ Flugzeug[0] + " Flugzeuge");
        System.out.println(AirBus1);
        System.out.println(AirBus2);
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
