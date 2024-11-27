package homework_04;

// code from Sergej Brauer

public class CurrencyConvertor {



    public static void main(String[] args) {
        double usDollarToEuro = 1.11;
        double euro = 175;
        double currency = currency(usDollarToEuro, euro);
        System.out.println("Conversion of euros to UsDollars = " + currency + " USD");
        double britishPoundToEuro = 0.850499;
        double euro1 = 200;
        double currency1 = currency1(britishPoundToEuro, euro1);
        System.out.println("Conversion of euros to British pounds = " + currency1 + " GBP");
        double chineseYuanToEuro = 7.8294357;
        double euro2 = 250;
        double currency2 = currency2(chineseYuanToEuro, euro2);
        System.out.println("Conversion of euros to Chinese yuan = " + currency2 + " CNY");
    }
    private static double currency(double usDollarToEuro, double euro) {
        return usDollarToEuro * euro;
    }
    private static double currency1(double britishPoundToEuro, double euro1) {
        return britishPoundToEuro * euro1;
    }
    private static double currency2(double chineseYuanToEuro, double euro2) {
        return chineseYuanToEuro * euro2;
    }
}
