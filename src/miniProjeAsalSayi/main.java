package miniProjeAsalSayi;

public class main {
    public static void main(String[] args) {
        int number =25;
        boolean isPrime = true;
        for (int i = 2 ; i<number;i++){
            if (number % 2 == 0){
                isPrime=false;
            }
        }
        if (isPrime==true){
            System.out.println("Sayı Asaldır");
        }
        else
            System.out.println("Sayı asal değildir");

    }

}
