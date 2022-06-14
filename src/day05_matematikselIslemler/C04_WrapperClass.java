package day05_matematikselIslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu ile non-primitive arasindaki farklar nelerdir

        String str= "java";
        int sayi10;


        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);

        //non primitive data turleri data depolamak yanindabir cok faydali methoda sahiptir
        //ancak primitive data turlerinin boyle bir ozelligi yoktur
        //primitive data turler sadece degerleri saklarlar


        //primitiove data turleri icin  de bazi methodlar gerekli oldugunda
        //java bir ara cozum uretmistir
        //java her bir primitive data turunu non-primitive olarak kullanabbilmek icin
        //ozel classlar olusturmus ve bunlaraWrapper Class adini vermistir


        double sayi2=20.5;

        //sayi2 primitive oldugundan sayi2. dedigimizde hicbir metod gelmez

        Double sayi3=15.2;
        //
    }
}
