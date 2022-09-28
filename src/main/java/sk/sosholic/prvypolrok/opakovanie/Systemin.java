package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class Systemin {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte meno a priezvisko" +
                "");
        String meno = scanner.nextLine();
        //System.out.print("Zadajte priezvisko" +
        //        "");
        //String priezvisko = scanner.nextLine();
        for(int x=1;x<11;x++){
               System.out.println( meno+" " + x);

        }
        String x = "hgrhg";
        x=scanner.nextLine();
    }
}
