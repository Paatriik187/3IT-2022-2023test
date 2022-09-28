package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class Systemintt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je moj prvy program");
        int opakovanie =1;
        while(opakovanie!=0){


            System.out.print("Zadaj prve cislo");
            int x = scanner.nextInt();
            System.out.print("Zadaj druhe cislo");
            int y = scanner.nextInt();
            int z = x+y;
            System.out.println("Vysledok je "+x+" + "+y+" = "+ z);
            System.out.print("pre ukoncenie napis 0 a enter, pre novy priklad napis 1 stlac enter " +
                    "");
             opakovanie= scanner.nextInt();


        }

    }
}
