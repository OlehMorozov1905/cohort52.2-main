package homework_09;

// code by

public class MaxFrom3 {

    public static void main(String[] args) {
        //znacenie

        int a = 60;
        int b = 34;
        int c = 70;

        // ispolzuem ternalnyj operator dlia nahozdenija max cisla

        int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.println("Max number:" + max);

    }

}
