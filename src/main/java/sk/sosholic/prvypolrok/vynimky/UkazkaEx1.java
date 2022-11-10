package sk.sosholic.prvypolrok.vynimky;

public class UkazkaEx1 {
    public static void main(String[] args) {

        System.out.println("Tu je nejaky kod lol");
        System.out.println("vyhodime chybu");
        //throw new RuntimeException("mame runtimeExeption");
        int s = idk();
        System.out.println("a toto nikdy nenastane");

    }





    public static int idk(){
        int[] pole = new int[]{1,3,4};
        int cislo=0;
        try {
            cislo= pole[6];
        }catch (ArrayIndexOutOfBoundsException ex){

            System.out.println("Neplatne cislo");
        }
        return cislo;
    }
}
