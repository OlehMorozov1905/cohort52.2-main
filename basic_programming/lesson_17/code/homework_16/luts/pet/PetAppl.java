package homework_16.luts.pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet myPet1 = new Pet(01,"cat",2,"Bob");
        Pet myPet2 = new Pet(02, "dog", 1, "Jeck");
        Pet myPet3 = new Pet(03,"guinea pig",1,"Anna");

        System.out.println(myPet1);
        myPet1.play();
        myPet1.walk();
        myPet1.sleep();
        System.out.println("---------------------------------");

        System.out.println(myPet2);
        myPet2.play();
        myPet2.walk();
        myPet2.sleep();
        System.out.println("---------------------------------");

        System.out.println (myPet3);
        myPet3.eat();
        myPet3.walk();
        myPet3.sleep();
        System.out.println("---------------------------------");

    }
}
