package day30_passByValue;

public class C01_StaticBloks {

    /*
    * static block class ilk calismaya basladiginda devreye girer
    * ve classin calismasi icin gerekli  on hazirliklar icin kullanilir
    * yazildigi satirin hicbir onemi yoktur
    * class icinde istenen yerde yazilir
    * static blok birden fazla olursa bloklar yukaridan asagiya
    * sirayla calisir  */

    static{//clas calismaya baslamadan yapmamiz gereken on atamalar varsa onlari yapar
        System.out.println("static blok1 calisti");
    }

    static {
        System.out.println("static blok2 calisti");

    }
    C01_StaticBloks(){
        System.out.println("constroctor calisti");
    }


    public static void main(String[] args) {

        System.out.println("main method baslangici");
        C01_StaticBloks obj1;
        new C01_StaticBloks();


    }
}
