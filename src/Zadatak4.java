import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Unesite neki proizvoljni niz: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println("Unijeli ste: " + str);
            boolean sflag = true;
                while (sflag) {
                    System.out.println("Ako zelite ponoviti unos pritisnite: y ");
                    Scanner sc1 = new Scanner(System.in);
                    String str1 = sc1.next();
                    if (!str1.equals("y")) {
                        System.out.println("Izabrali ste izlaz iz programa!");
                        flag = false;
                    }
                    sflag = false;
                }

            sc.reset();

        }

    }


}
