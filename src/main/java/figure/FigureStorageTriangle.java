package figure;

import figure.FigureUtil.FigureInfo;
import figure.FigureUtil.FigureInput;
import util.Valid;

public class FigureStorageTriangle extends FigureStorage {


    @Override
    protected IFigure createFigure() {
        String nameTriangle = "";
        double sideOne = 0;
        double sideTwo = 0;
        double sideThree;
        int i = 0;
        System.out.println(FigureInfo.infoParameter("triangle"));
        for (String temp : FigureInput.FigureParameter().split(",")) {
            if (i == 0) {
                nameTriangle = temp;
            } else if (i == 1 && Valid.checkStrForNumber(temp)) {
                sideOne = Double.parseDouble(temp);
            } else if (i == 2 && Valid.checkStrForNumber(temp)) {
                sideTwo = Double.parseDouble(temp);
            } else if (i == 3 && Valid.checkStrForNumber(temp)) {
                sideThree = Double.parseDouble(temp);
                return new FigureTriangle(sideOne, sideTwo, sideThree, nameTriangle) {
                };
            } else {
                System.out.println(FigureInfo.infoParameter("triangle"));
                return null;
            }
            i++;
        }
        return null;
    }
}
