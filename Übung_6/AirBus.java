package zivil;

/**
 * Created by cemsaygili on 03.12.17.
 */
public class AirBus extends Passagierflugzeug{

    public AirBus(int laenge, int piloten, int fahrgaeste) {
        super(laenge, piloten, fahrgaeste);
    }
    protected static boolean autoPilot = false;

    public static boolean getAutopilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    public void autoPilotEinschalten(){

        if (autoPilot = true){
            System.out.println("Autopilot ist schon eingeschaltet, keine Änderung ausgeführt.");
        }

            if (autoPilot = true) {
                System.out.println("Autopilot ist an");
            }
    }
    public void autoPilotAusschalten (){
        if (autoPilot = false){
            System.out.println("Autopilot ist aus");
        }
    }
    public void autoPilotUmschalten (){
        if (autoPilot = false) {
            autoPilotEinschalten();
            System.out.println("Autopilot ist an.");
        }
        else {
            autoPilotAusschalten();
            System.out.println("Autopilot ist aus");
        }
    }

    public String toString() {
        String returnString = "Flugzeug: AirBus " + "Länge: "+  laenge +" Minuten "+ "Piloten: "+piloten + " Autopilot: "+ autoPilot;
        return returnString;
    }

}
