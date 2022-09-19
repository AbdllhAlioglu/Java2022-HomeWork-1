package MultiDimensionalArray;

public class Main {
    public static void main(String[] args) {
        String [][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Kastamonu";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Samsun";
        sehirler[1][2] = "Rize";
        sehirler[2][0] = "Çorum";
        sehirler[2][1] = "Antalya";
        sehirler[2][2] = "Sivas";


        for (int i=0; i<=2;i++){
            System.out.println("--------");
            for (int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }





    }
}
