package sesliHarfler;

public class Main {
    public static void main(String[] args) {

        char harf ='A';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("A kalın sesli harftir");
                break;
            case 'E':
                System.out.println("E ince sesli harftir");
                break;
            default:
                System.out.println("Harf geçersizdir");
        }
















    }
}
