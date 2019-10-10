package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    static public boolean userAnswer() {
        try {
            String str;
            Scanner scanner = new Scanner(System.in);
            System.out.println("if you want to continue write yes");
            str = scanner.nextLine();
            str = str.toUpperCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.equals("Y") || str.equals("YES")) {
                    return true;
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception userAnswer return false: " + ex.getMessage());
            return false;
        }
        return false;
    }

    static public String userString() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    static public double userDouble() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
