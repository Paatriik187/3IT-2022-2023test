package sk.sosholic.prvypolrok.opakovanie;

public class Meno extends CusNe {

    private String mojeMeno;
    private String mojePriezvisko;

    public Meno(String mojeMeno, String mojePriezvisko) {
        this.mojeMeno = mojeMeno;
        this.mojePriezvisko = mojePriezvisko;
    }

    public String getMojePriezvisko() {
        return mojePriezvisko;
    }

    public String getMojeMeno() {
        return mojeMeno;
    }

    public void setMojeMeno(String mojeMeno) {
        this.mojeMeno = mojeMeno;
    }

    public void setMojePriezvisko(String mojePriezvisko) {
        this.mojePriezvisko = mojePriezvisko;
    }

    public String getCeleMeno(){
        return getMojeMeno()+getMojePriezvisko();
    }
}
