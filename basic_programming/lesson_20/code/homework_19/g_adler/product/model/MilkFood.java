package homework_19.g_adler.product.model;

import java.util.Objects;

//Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно.
//Во всех классах переопределить метод toString.

// В Задаче 1 переопределить метод equals для сравнения объектов во всех классах.
public class MilkFood extends Food{

    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, String expDate, String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilkFood milkFood)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(fat, milkFood.fat) == 0 && Objects.equals(milkType, milkFood.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }
}
