/**
 * Created by cemsaygili on 23.11.17.
 */
public class Artikel {

        protected int isbn = 0;
        protected double preis =0 ;

        public Artikel(int isbn, double preis) {
            this.isbn = isbn;
            this.preis = preis;

        }



    public double getPreis() {
            return preis;
        }
    public void setPreis(double preis) {
        this.preis = preis;
    }

        public int getISBN() {
            return isbn;
        }



        public void setISBN(int isbn) {
            this.isbn = isbn;
        }


        public String toString() {
            String returnString = "Artikel: " +"ISBN: "+ isbn + " / "+
                    + preis;
            return returnString;
        }
    }

