/**
 * Created by cemsaygili on 08.11.17.
 */
public class MainStudent {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------------------------------------------------
        
        String[] namen = {"Anna Alt", "Benny Berg", "Cassie Canter", "David Dahl",
                "Elizabeth Engel", "Foster Fischer", "Gina Graf", "Holge Hahn",
                "Ingrid Insel", "Johannes Jung"};

        int[] alter = {19, 21, 18, 19, 20, 20, 19, 20, 21, 18};

        String[] studiengaenge = {"Medieninformatik", "Druck- und Medientechnik", "Technische Informatik", "Technische Informatik",
                "Medieninformatik", "Technische Informatik", "Technische Informatik", "Druck- und Medientechnik",
                "Technische Informatik", "Medieninformatik"};

        //-------------------------------------------------------------------------------------------------------------------


        Student[] studentenListe = new Student[namen.length];
        for (int i = 0; i<namen.length; i++) {
            Student currentStudent = new Student(namen[i], alter[i], studiengaenge[i]);
            studentenListe[i] = currentStudent;
        }

        System.out.println("--------------- Der erste Teil ---------------");
        System.out.println("");
        //-------------------------------------------------------------------------------------------------------------------
        Student student1 = studentenListe[0];
        student1.getId();
        student1.getName();

        System.out.println("ID: " + student1.getId() + "/ Name: " + student1.getName());

        System.out.println("");
        //-------------------------------------------------------------------------------------------------------------------
        System.out.println("--------------- Der zweite Teil ---------------");
        System.out.println("");

        Student student2 = studentenListe[7];
        student2.getName();
        student2.getAlter();
        System.out.println("Der Student " + student2.getName() + " ist " + student2.getAlter() + " Jahre alt.");

        student2.setAlter(80);
        System.out.println("Der Student " + student2.getName() + " ist " + student2.getAlter() + " Jahre alt.");

        student2.setAlter(30);
        System.out.println("Der Student " + student2.getName() + " ist " + student2.getAlter() + " Jahre alt.");

        System.out.println("");
        //-------------------------------------------------------------------------------------------------------------------
        System.out.println("--------------- Der dritte Teil ---------------");
        System.out.println("");

        Student student3 = studentenListe[7];
        student3.getName();
        student3.getStudiengang();
        System.out.println("Der Student " + student3.getName() + " belegt den Studiengang " + student3.getStudiengang());

        student3.setStudiengang("Tanz und Musik");
        System.out.println("Der Student " + student3.getName() + " belegt den Studiengang " + student3.getStudiengang());

        student3.setStudiengang("Technische Informatik");
        System.out.println("Der Student " + student3.getName() + " belegt den Studiengang " + student3.getStudiengang());

        System.out.println("");
     //-------------------------------------------------------------------------------------------------------------------
        System.out.println("--------------- Der vierte Teil ---------------");
        System.out.println("");

        for (Student currentStudent : studentenListe) {
            System.out.println(currentStudent);
        }


    }

}
