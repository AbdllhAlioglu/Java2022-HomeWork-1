package Loops;

public class Main {
    public static void main(String[] args) {

        // for Loops
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            System.out.println("Döngü devam ediyor");
        }
        System.out.println("for Döngü bitti");
        System.out.println("****************************");


        // while Loops

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while Döngü bitti");
        System.out.println("****************************");

        // do-While Loops
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("do-while Döngü bitti");
        System.out.println("****************************");


    }
}
