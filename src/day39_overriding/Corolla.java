package day39_overriding;

public class Corolla extends Toyota {

    protected String hiz="Corolla max 200km hiz yapar";
    protected String yakit="Corolla benzinli ve elektriklidir";
    protected String model="Corolla";



    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanirlar");

    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5,6 litre yakit tuketirler");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");


    }

    public static void main(String[] args) {

          /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir
        Method'lar icin ise yine Data turunun oldugu class'a gideriz
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol ederiz
         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket);//Araba
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit);//Corolla
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota dan alir
        System.out.println(arb1.model);//Corolla' dan alir
        arb1.motor();//Corolla

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//Araba
        System.out.println(arb2.hiz);//Toyota'dan kullanir
        System.out.println(arb2.yakit);//Araba
        System.out.println(arb2.marka);//Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota dan alir
       // System.out.println(arb2.model);//data turu toyota oldugu icin ilk toyotaya gitti orada model yok CTE
        arb2.motor();//Corolla
        arb2.garanti();//Toyota
        arb2.yakitTuketimi();//Corolla
        //arb2.vitesSayisi(); Data turu olan toyota;dan baslayinca boyle bir mmethod bulamadik dolayisiyla CTE



        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket);//Araba
        System.out.println(arb3.hiz);//araba
        System.out.println(arb3.yakit);//CAraba
        System.out.println(arb3.marka);//Araba
        //System.out.println(arb3.sirketMerkezi);//CTE
        //System.out.println(arb3.model);//CTE
        arb3.yakitTuketimi();//Corolla
        arb3.motor();//Corolla
        //arb3.garanti();//Arabada garanti methodu bulamadi CTE
        //arb3.vitesSayisi();//cTE ilk araba clasina gidecek vites sayisini bulamaz ki calistirsin

    }
}
