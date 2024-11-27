package homework_18.beverges;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage beverage = new Beverage(5, "white", "carton");
        System.out.println(beverage);

        Beer beer = new Beer(30, "black", "can", 5.6, "Franciskaner", "whiss", "Bayern");
        System.out.println(beer);
    }
}
