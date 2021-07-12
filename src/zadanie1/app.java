package zadanie1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String postalCode;

        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadź kod pocztowy");

        postalCode = scanner.nextLine();

        if (postalCode.length() == 6 && postalCode.charAt(2) == '-') {
            System.out.println("poprawny kod pocztowy");
        } else {
            System.out.println("kod nie poprawny");
        }
    }
}
