/**
 * Created by cemsaygili on 23.11.17.
 */
public class Buch extends Artikel{


        protected String titel = "";
        protected String autor = "";

        public Buch(String titel, String autor,int isbn,double preis) {
            super(isbn,preis);
            this.titel = titel;
            this.autor = autor;

        }

        public String getTitel() {
            return titel;
        }


        public String getAutor() {
            return autor;
        }



        public void setTitel(String titel) {
            this.titel = titel;
        }

    public void setAutor(String autor) {
        this.autor = autor;
    }


        public String toString() {
            String returnString = "Buch: \"" + titel + "\" / "
                    + autor;
            return returnString;
        }
    }

