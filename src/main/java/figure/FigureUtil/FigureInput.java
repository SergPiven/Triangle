package figure.FigureUtil;

import util.UserInput;
import util.Valid;

public class FigureInput {

    public static String nameFigure() {
        System.out.println("Enter the name");
        return UserInput.userString();
    }

    public static double lengthSide() {
        System.out.println("Enter the side");
        double side;
        do {
            side = UserInput.userDouble();
            if (!Valid.checkDoubleToPositive(side)) {
                System.out.println("Number must be greater than zero");
            }

        } while (!Valid.checkDoubleToPositive(side));
        return side;
    }

    public static String FigureParameter() {
        String strFigure = UserInput.userString();
        if (strFigure == null) {
            return null;
        }
        return strFigure.replaceAll("\\s", "");
    }
}
