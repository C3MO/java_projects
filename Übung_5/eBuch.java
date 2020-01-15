/**
 * Created by cemsaygili on 26.11.17.
 */
public class eBuch extends Buch{


        protected String format = "";


        public eBuch(String titel,String autor, String format, int isbn, double preis) {
            super(titel,autor,isbn,preis);
            this.format = format;


        }

        public String getFormat() {
            return format;
        }




        public void setFormat(String format) {
            this.format = format;
        }




        public String toString() {
            String returnString = "eBuch: " + format;
            return returnString;
        }
    }


