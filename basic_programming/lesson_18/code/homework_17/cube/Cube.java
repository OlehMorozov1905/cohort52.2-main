package homework_17.cube;

//Реализовать в нем методы определения периметра p (сумма длин всех ребер),
//площади s (сумма площадей всех граней) и объема v.

public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getSize() {
        return a;
    }

    public void setSize(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "size=" + a +
                '}';
    }

    public double perimeter(){
        return 12 * a;
    }

    public double area(){
        return 6 * a * a;
    }

    public double volume(){
        return a * a * a;
    }
}
