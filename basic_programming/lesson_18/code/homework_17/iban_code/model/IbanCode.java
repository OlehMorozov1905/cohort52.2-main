package homework_17.iban_code.model;

//Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную длину
//        (в Германии - 22 символа).
//Создать класс IbanCode, в котором определить необходимые поля и реализовать методы:
//- lengthCode(String code), который возвращает количество символов в счете
//- controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
//- isValid(String code), который проверяет штрих-код на правильное количество символов

public class IbanCode {

    //fields
    private String iban;

    //constructor
    public IbanCode(String iban) {
        this.iban = iban;
    }

    //setters and getters
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    //display
    public void display() {
        System.out.println("IBAN" + iban);
    }

    //methods
    //number of characters in IBAN
    public int lengthCode() {
        String[] ibanLength = iban.replaceAll("\\s+", "").split("");
        return ibanLength.length;
    }

    //sum of first two characters according to ASCII
    public int controlCode() {
        //String[] ibanControl = iban.replaceAll("\\s+", "").split("");
        char firstChar = iban.charAt(0);
        char secondChar = iban.charAt(1);
        return firstChar + secondChar;
    }

    //checking the correct number of characters in IBAN (22)
    public boolean isValid() {
        String[] ibanLength = iban.replaceAll("\\s+", "").split("");
        if (ibanLength.length == 22) {
            return true;
        }
        return false;
    }


}
