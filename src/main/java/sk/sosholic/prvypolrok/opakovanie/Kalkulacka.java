package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class Kalkulacka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je moj prvy program");
        int opakovanie =1;
        while(opakovanie!=0){

            System.out.print("Zadaj prve cislo");
            int x = scanner.nextInt();
            System.out.println("Zadaj znamienko 1 pre+ 2 pre- 3 pre* 4 pre/");
            int znam = scanner.nextInt();

            System.out.print("Zadaj druhe cislo");
            int y = scanner.nextInt();
            switch (znam){
                case 1:int scit = x+y;System.out.println("Vysledok je "+x+" + "+y+" = "+ scit);break;

                case 2:int odc = x-y;System.out.println("Vysledok je "+x+" - "+y+" = "+ odc);break;

                case 3:int nas = x*y;System.out.println("Vysledok je "+x+" * "+y+" = "+ nas);break;

                case 4:
                    if(y==0){
                    System.out.println("Chyba, delenie nulou");
                            }
                        else{
                            int del = x/y;
                            System.out.println("Vysledok je "+x+" / "+y+" = "+ del);}
                        break;
                        default: continue;


            }




            System.out.print("pre ukoncenie napis 0 a enter, pre novy priklad napis 1 stlac enter " +
                    "");
             opakovanie= scanner.nextInt();


        }

    }
}
