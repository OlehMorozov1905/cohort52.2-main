package homework_18.beverges;

public class Beverage {
    private int volume;
    private String color;
    private String boxing;

    public Beverage(int volume, String color, String boxing) {
        this.volume = volume;
        this.color = color;
        this.boxing = boxing;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                ", boxing='" + boxing + '\'' +
                '}';
    }
}
