package sk.sosholic.prvypolrok.zoo;

public class Ryba extends Animal {

    String typVody;

    public Ryba(String animaltype, double cena, String typVody) {
        super(animaltype, cena);
        this.typVody = typVody;
    }

    public String getTypVody() {
        return typVody;
    }

    public void setTypVody(String typVody) {
        this.typVody = typVody;
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "typVody='" + typVody + '\'' +
                '}';
    }
}
