/**
 * Created by cemsaygili on 08.11.17.
 */
class Student {
    private String name = "unbekannt";
    private int alter = 0;
    private String studiengang = "";
    private final int id;
    private static int anzahlVonStudentenIds;
    private int minAlter = 15;
    private int maxAlter = 50;

    private static final String[] erlaubteStudiengaenge =
            {"Druck- und Medientechnik", "Medieninformatik", "Technische Informatik"};




    public Student(String name, int alter, String studiengang) {
        this.name = name;
        this.alter = alter;
        this.studiengang = studiengang;

        id = anzahlVonStudentenIds + 1; anzahlVonStudentenIds++;
    }


    public String getName() {
        return this.name;
    }

    public int getAlter() {
        return this.alter;
    }

    public String getStudiengang() {
        return this.studiengang;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Ueberpruefung
    public void setAlter(int alter) {
        this.alter = alter;

        if ((alter <= maxAlter && alter >= minAlter)) {
            this.alter = alter;

        } else {
            System.out.println("Eingetragenes Alter " + alter + "ist ungueltig!");
        }
    }
    //Ueberpruefung
    public void setStudiengang(String studiengang) {
        boolean istVorhanden = false;

        for (String erlaubt: erlaubteStudiengaenge) {
            if (erlaubt.equals(studiengang)) {
                istVorhanden = true;
            }
        }

        if (istVorhanden == false) {
            System.out.println("Eingetragener Studiengang " + "\"" + studiengang + "\"" + " ist ungültig!");
        } else {
            this.studiengang = studiengang;
        }
    }


    public String toString() {
        String returnString = "ID " + id + " / " + name + " (" + alter + ") / " + studiengang;
        return returnString;
    }
}