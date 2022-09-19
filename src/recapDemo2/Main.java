package recapDemo2;

public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 2.5, 4.8, 8.1};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max<number){
                max = number;

            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Sayılar Toplamı : " + total);
        System.out.println("En büyük sayı : " + max);


    }
}
