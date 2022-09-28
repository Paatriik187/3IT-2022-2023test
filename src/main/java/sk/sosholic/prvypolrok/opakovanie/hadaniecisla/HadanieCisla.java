package sk.sosholic.prvypolrok.opakovanie.hadaniecisla;

import java.util.Scanner;

public class HadanieCisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Vyber si pocet pokusov:");
        int pocetpokusov = scanner.nextInt();
        System.out.print("Vyber si cislo po ktore budes hadat");
        int max = scanner.nextInt();
        int min=1;
        int x= (int)(Math.random()*(max-min+1)+min);
        System.out.println("Hadas cislo od 1 do "+max);
        int z=1;
        while(true) {

            System.out.print("Pokus cislo "+z+" Zadaj svoj odhad:");
            int y = scanner.nextInt();
                if(y==x){
                System.out.println("Správny odhad, cislo je "+x);
                break;

            }
            else if(z==pocetpokusov){
                System.out.println("Neuhadol si cislo, cislo bolo "+x);
                break;
            }
            else if (y > x) {
                System.out.println("Skus nizsie cislo");
            }
            else if (y < x) {
                System.out.println("Skus vacsie cislo");

            }


            z++;
        }

    }

}
