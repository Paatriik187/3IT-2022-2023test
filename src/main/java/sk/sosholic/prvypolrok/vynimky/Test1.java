package sk.sosholic.prvypolrok.vynimky;


public class Test1 {

    public static void main(String[] args)throws Exception{
        try {
            System.out.println("Nejaky beh programu");

            throw new Exception("Ha Ha dojebal si neco");
        }
        catch (Exception ex){
            System.out.println("Toto nastane ked je chyba");
        }
        finally {
            System.out.println("vykona sa vzdy, nezavislo od chyby");
        }
        System.out.println("Nejaky beh programu");


    }
}
