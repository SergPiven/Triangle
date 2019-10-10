package figure;

import figure.FigureUtil.FigureException;
import util.UserInput;

import java.util.ArrayList;
import java.util.List;

public abstract class FigureStorage {

    protected List<IFigure> collection = new ArrayList<IFigure>();

    //Abstract methods
    protected abstract IFigure createFigure(); //fabric Figure

    //Methods
    protected void addFigure(IFigure figure) {
        collection.add(figure);
    }

    protected void showCollection() {
        System.out.println("============= Figure list: ===============");
        for (IFigure figure : collection) {
            System.out.println(figure);
        }
    }

    public void runFigureCollection() {
        boolean isOk = true;
        while (isOk) {
            try {
                IFigure figure = createFigure();
                if (figure == null) {
                    throw new FigureException();
                }
                this.collection.add(figure);
                isOk = UserInput.userAnswer();
            } catch (FigureException ex) {
                System.out.println(ex.figureNull());
                isOk = UserInput.userAnswer();
            }
        }
        showCollection();
    }
}
