package sk.sosholic.prvypolrok.zoo;

import sk.sosholic.prvypolrok.databazaziakov.Ziak;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper {
    List <Animal> zoo= new ArrayList<>();
    String menoPriezvisko;

    public Zookeeper(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }

    public String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public void setMenoPriezvisko(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }
    public void pridatzviera(Animal animal){
        zoo.add(animal);
    }
    public Animal zistinajdrahsiezviera(){
        Animal idk= zoo.get(0);
        for (Animal animal : zoo) {
            if (animal.getCena() > idk.getCena()) {

                idk = animal;
            }
        }
        return idk ;
    }


}


