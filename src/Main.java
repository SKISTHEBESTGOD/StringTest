import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj string: ");
        String ciag = skaner.nextLine();
        String ciag1 = "";
        String ciag2 = "";
        if(ciag.length() >= 2) {
            ciag1 = ciag.substring((ciag.length() / 2) - 1,(ciag.length() / 2) + 1);
            ciag2 = ciag1.concat( ciag.substring(0,(ciag.length() / 2) - 1) + ciag.substring((ciag.length() / 2) + 1));

        }
        else if(ciag.length() == 0) {
            System.out.println("pusty string");
        }
        else {
            System.out.println("Nieprawidłowa długość stringa");
        }
        System.out.println(ciag2);
    }
}
