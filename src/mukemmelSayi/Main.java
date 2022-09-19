package mukemmelSayi;

public class Main {
    public static void main(String[] args) {

        // 6 ---> 1,2,3
        //28----> 1,2,,4,7,14

        int sayi = 28;
        int total = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total = total + i;
            }
        }
        if (total == sayi) {
            System.out.println("Sayı mükemmel sayıdır");
        } else
            System.out.println("Sayı mükemmel sayı değildir");


    }
}
