package homework_18.beverges;

public class Beer extends Beverage{

    private double alcoholPercent;
    private String brand;
    private String type;
    private String placeOrigin;

    public Beer(int volume, String color, String boxing, double alcoholPercent, String brand, String type, String placeOrigin) {
        super(volume, color, boxing);
        this.alcoholPercent = alcoholPercent;
        this.brand = brand;
        this.type = type;
        this.placeOrigin = placeOrigin;
    }

    @Override
    public String toString() {
        return super.toString() + "Beer{" +
                "alcoholPercent=" + alcoholPercent +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", placeOrigin='" + placeOrigin + '\'' +
                '}';
    }
}
