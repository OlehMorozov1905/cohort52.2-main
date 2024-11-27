package homework_17.cube;

//Создать класс Cube, описывающий куб cо стороной a.
//Реализовать в нем методы определения периметра p (сумма длин всех ребер),
//площади s (сумма площадей всех граней) и объема v.
//Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
//Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

public class CubeAppl {
    public static void main(String[] args) {

        Cube c1 = new Cube(10);
        Cube c2 = new Cube(123);

        System.out.println(c1.perimeter());
        System.out.println(c1.area());
        System.out.println(c1.volume());
    }
}
