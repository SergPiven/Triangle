package figure;

public interface IFigure extends Comparable<IFigure> {
    double getArea();

    @Override
    int compareTo(IFigure iFigure); /// почему оно так работает без класса ошибка ??
}

