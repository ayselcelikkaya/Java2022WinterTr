package day09_Ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi = 1400;
        //Verilen sayinin uc veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

        String sonuc = sayi >= 100 ? "sayi u3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";


        //Ternary bize sonuc dondurdugu icin
        //yau sonuccu direk yazdirmaliyiz
        //yada sonucun data tune ygun bir variable a atama yapabiliz

        System.out.println("girdiginiz soru analizi  :"+ sonuc);



    }
}