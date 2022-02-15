package Git;

import java.util.Scanner;

public class NomWow {

    public static void main(String[] args) {
        String nom = "";
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        nom = sc.next();

        if (validaNom(nom) == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean validaNom(String nom) {
        char a, b;

        if (nom.length() < 1) {
            return false;
        }

        for (int i = 1, j = 0; i < nom.length(); i++) {
            a = nom.charAt(j);
            b = nom.charAt(i);
            if (a != b) {
                return true;
            }
        }

        return false;
    }

}
