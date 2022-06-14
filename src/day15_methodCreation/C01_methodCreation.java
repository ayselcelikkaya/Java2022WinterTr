package day15_methodCreation;

public class C01_methodCreation {

    public static void main(String[] args) {

        String str="java ogrenmek cok zevkli";

        //str nin ilk 4 harfini almak istersen

        str.substring(0,4);

        //bir program yaparken kodlarimizin daha kisa olmasi ve anlasilir olabilmesi icin
        //surekli kullanacagimiz kod bloklarini hazir olarak bir yere koyar
        //ihtiyacimiz oldukca oradan alip kullaniriz


        //methodlar robota benzer
        //method olusturmak bazen o methodun yapacagi isi yapmaktan zor olabilir
        //bir islemi sadece bir kere yapacaksak method kullanmamiza gerek olmayabilir
        //ancak ozellikle cok kullanacagimiz islemler icin her seferinde yeniden ayni kodlari yazmak yerine
        //bu islemi hazir yapan bir method olusturmak .ok daha pratiktir

        //bazen bir classin icerisinde cok uzun kodlar yzarsak
        //tum classin anlasilmasi zor olabilir
        //bunun yerine kodun belli kisimlarini ayri methodlar olusturup
        //main method icerisinden istedigimiz sekilde bu methodlari yonetebiliriz


    }
}
