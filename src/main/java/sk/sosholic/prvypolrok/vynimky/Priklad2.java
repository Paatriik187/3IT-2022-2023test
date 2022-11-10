package sk.sosholic.prvypolrok.vynimky;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Priklad2 {
    public static void main(String[] args) {

        List<String> mojList= Arrays.asList("Janko","Fero","Standa");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj Index ");

        try{
            int a=scanner.nextInt();
            System.out.println(mojList.get(a));
        }catch (Exception ex){
            System.out.println("Zadane cislo je mimo rozsah");
            System.out.println("Mame chybu "+ex.getLocalizedMessage());
        }
        mojList.set(1,"Ceresna");
        System.out.println(mojList);
    }
}
