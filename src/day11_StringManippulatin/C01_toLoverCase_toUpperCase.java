package day11_StringManippulatin;

import java.util.Locale;

public class C01_toLoverCase_toUpperCase {

    public static void main(String[] args) {

        String str="Java Guzeldir";


        //Biz string metodlarini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

       // str charAt(5) boyle yazdigimizda sonuc artik String degil char olacak
        //dolayisiyla Stringde yapmak istedigimiz tum degisiklikleri
        //once yapip sonra charAt() metodunu kullanmaliyiz


        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));





    }
}
