package sk.sosholic.prvypolrok.zoo;

public class main {

    public static void main(String[] args) {
        Animal pes = new Animal("pes", 250);
        Animal macka = new Animal("macka", 30);
        Animal lef = new Animal("lev", 250000);
        Animal Kengura = new Animal("Kengura", 40000);
        Zookeeper Milan = new Zookeeper("Milan Novotny");
        Milan.pridatzviera(pes);
        Milan.pridatzviera(macka);
        Milan.pridatzviera(lef);
        Milan.pridatzviera(Kengura);

        System.out.println(Milan.zistinajdrahsiezviera());
        lef.setCena(0);
        System.out.println("Lev bol zlacneny");
        System.out.println(Milan.zistinajdrahsiezviera());
    }
}
