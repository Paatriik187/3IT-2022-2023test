package sk.sosholic.prvypolrok.databazaziakov;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class DatabazaZiakov {
    static List<Ziak> ziakList = new ArrayList<>();
    private static boolean exit = true;


    public static void main(String[] args) {

        Ziak martinec = new Ziak("Patiki", "Martinec", 15);
        Ziak Bulko = new Ziak("David", "Bulko", 42);
        Ziak Standa = new Ziak("Stanislav", "Palkovic", 25);
        ziakList.add(martinec);
        ziakList.add(Bulko);
        ziakList.add(Standa);
        Scanner scanner = new Scanner(System.in);
        int menu=88;
        while (exit) {

            try {
                System.out.println( " co je ulozene "+menu);
                if(menu == 88) {
                    menuAplikcie();
                    System.out.print("Zadaj cislo z menu: ");
                    menu = scanner.nextInt();
                }
            }catch (InputMismatchException ex){
                System.out.println("Chyba, zadaj číslo");
                break;
            }
            switch (menu) {

                case 0:
                    exit =false;
                    System.out.println("Koniec programu");
                    break;
                case 1:
                    System.out.print("Napis akeho ziaka chces Pridat ");
                    System.out.print("zadaj meno");
                    String menoo = scanner.next();
                    System.out.print("zadaj priezvisko");
                    String priezviskoo = scanner.next();
                    System.out.print("vek:");
                    int vekk = scanner.nextInt();
                    Ziak ziakk = new Ziak(menoo, priezviskoo, vekk);
                    ziakList.add(ziakk);
                    break;



                case 2:
                    menu = 88;
                    for (int i = 1; i < ziakList.size() + 1; i++) {
                        System.out.println(i + ". " + ziakList.get(i - 1));}

              /*  System.out.print("Vyber cislo ziaka ktore chces vymazat");
                int poradie = scanner.nextInt();

                if(poradie>ziakList.size()){
                    System.out.println("Neplatne poradie");
                }
                else if(poradie<1){
                    System.out.println("Neplatne poradie");
                }
                else {
                    ziakList.remove(poradie-1);
                    System.out.println("Ziak cislo " + poradie + " vymazany");
                }*/

                System.out.print("Vyber cislo ziaka ktore chces vymazat: ");

                    try {
                        int poradie1 = scanner.nextInt();
                        ziakList.remove(poradie1 - 1);
                    } catch (Exception ex) {
                       System.out.println("Chybne poradie ");
                       menu =2;
                    }
                    break;
                case 3:
                    System.out.println("vyber poradie ziaka ktoreho chces zobrazit");

                    try {
                        int indexx = scanner.nextInt();
                        System.out.println(ziakList.get(indexx - 1));
                        menu=88;
                    } catch (Exception ex) {
                        System.out.println("Zadaj cislo");
                        break;
                    }
                    break;


                case 4:
                    for (int i = 1; i < ziakList.size() + 1; i++) {
                        System.out.println(i + ". " + ziakList.get(i - 1));
                    }
                    break;


                case 5:
                    int najvecsivek = 0;
                    String staryziak = "";
                    for (Ziak ziak : ziakList) {
                        if (ziak.getVek() > najvecsivek) {
                            najvecsivek = ziak.getVek();
                            staryziak = ziak.getMeno() + " " + ziak.getPriezvisko();
                        }
                    }
                    System.out.println("Najstarsi ziak je " + staryziak);
                    break;

                default:

                    break;

            }

        }

    }

    private static void menuAplikcie() {
        System.out.println("Moja databaza ziakov");
        System.out.println("ak chces ukoncit aplikaciu stlac 0 ");
        System.out.println("ak chces vytvorit zaznam stlac 1 ");
        System.out.println("ak chces zmazat zaznam stlac 2 ");
        System.out.println("ak chces zobrazit zaznam stlac 3 ");
        System.out.println("ak chces zobrazit cely zoznam stlac 4 ");
        System.out.println("ak chces zobrazit najstarsieho ziaka stlac 5 ");
    }
}

