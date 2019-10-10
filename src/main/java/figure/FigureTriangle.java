package figure;

public class FigureTriangle implements IFigure {
    private double sideOne = 0;
    private double sideTwo = 0;
    private double sideThree = 0;
    private String name = "";

    public FigureTriangle(double sideOne, double sideTwo, double sideThree, String name) {
        this.name = name;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public String getName() {
        return name;
    }


    @Override
    public double getArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public int compareTo(IFigure triangle) {
        return (int) (triangle.getArea() - this.getArea());
    }

    @Override
    public String toString() {
        return "[Triangle " + this.name + "]: " +
                "area=" + String.format("%.4g%n", this.getArea());
    }
}
