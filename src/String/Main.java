package String;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println("Mesaj ekleme : "+ mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));
        System.out.println("**********************************************");

        //2. Bölüm ***********************************

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,8)); // 2 den başla 8 e kadar.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());








    }
}
