package homework_17.iban_code;

import homework_17.iban_code.model.IbanCode;

// code by Atrem D

public class IbanAppl {
    public static void main(String[] args) {

        IbanCode iban1 = new IbanCode("DE52 2345 3745 0967 2318 33");

        iban1.display();
        System.out.println("Number of characters: " + iban1.lengthCode());
        System.out.println("Sum of first two characters (according to ASCII): " + iban1.controlCode());
        System.out.println("IBAN is valid: " + iban1.isValid());

    }//end of main

}
