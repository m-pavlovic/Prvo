import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Unesite neki proizvoljni niz: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("Unijeli ste: " + str);
            boolean flag_s = true;
                while (flag_s) {
                    System.out.println("Ako zelite ponoviti unos pritisnite: y ");
                    Scanner sc_f = new Scanner(System.in);
                    String str_f = sc_f.next();
                    if (!str_f.equals("y")) {
                        System.out.println("Izabrali ste izlaz iz programa!");
                        flag = false;
                    }
                    flag_s = false;
                    sc_f.reset();
                }

            sc.reset();

        }

    }


}
