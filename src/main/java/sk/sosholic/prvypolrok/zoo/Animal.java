package sk.sosholic.prvypolrok.zoo;


public class Animal {

    private String animaltype;
    private double cena;

    public Animal(String animaltype, double cena) {
        if (animaltype == "") {
            this.animaltype = "Student 3.TPI";
        } else {
            this.animaltype = animaltype;
        }
        if (cena < 0) {
            cena = 0;
        } else {
            this.cena = cena;
        }
    }

    public String getAnimaltype() {
        if (animaltype == "") {
            return "Student 3.TPI";
        } else {
            return animaltype;
        }
    }

    public void setAnimaltype(String animaltype) {
        if (animaltype == "") {
            this.animaltype = "Student 3.TPI";
        } else {
            this.animaltype = animaltype;
        }
    }

    public double getCena() {
        if (cena < 0) {
            return 0;
        } else {
            return cena;
        }
    }

    public void setCena(double cena) {
        if (cena < 0) {
            cena = 0;
        } else {
            this.cena = cena;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animaltype='" + animaltype + '\'' +
                ", cena=" + cena +
                '}';
    }
}
