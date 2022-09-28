package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class CusNe  {
    public static void main(String[] args) {
        Meno moremeno = new Meno("Patrik ","Smolicek ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte meno" +
                "");
        String meno = scanner.nextLine();
        System.out.print("Zadajte priezvisko" +
                "");
        String priezvisko = scanner.nextLine();


        for(int x=1;x<11;x++){
            if(x%2==0) {
                System.out.println( meno +" "+priezvisko+" "+  x);
            }
        }

        int x=1;
        while(x!=0){
            System.out.println("Pre skončenie programu stlač 0 a enter");
            x=scanner.nextInt();

        }

    }
}
