package sk.sosholic.prvypolrok.zoo;

public class Hmyz extends Animal{

    int pocetNoh;

    public Hmyz(String animaltype, double cena, int pocetNoh) {
        super(animaltype, cena);
        if(pocetNoh==0||pocetNoh==6||pocetNoh==8||pocetNoh==100) {
            this.pocetNoh = pocetNoh;
        }
        else{
            this.pocetNoh=-1;
        }
    }

    public double getPocetNoh() {
        if(pocetNoh==0||pocetNoh==6||pocetNoh==8||pocetNoh==100) {
            return pocetNoh;
        }
        else{
            return -1;
        }
    }

    public void setPocetNoh(int pocetNoh) {
        if(pocetNoh==0||pocetNoh==6||pocetNoh==8||pocetNoh==100) {

            this.pocetNoh = pocetNoh;
        }
        else{
            this.pocetNoh=-1;
        }
    }

    @Override
    public String toString() {
        return "Hmyz{" +
                "pocetNoh=" + pocetNoh +
                '}';
    }
}
