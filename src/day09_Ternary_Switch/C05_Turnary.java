package day09_Ternary_Switch;

public class C05_Turnary {
    public static void main(String[] args) {
        //Bazen ternary deki iki sonucun data turler farkli olabilir
        //Verilen sayi 100 den buyukse sayinin karesini alip yazdiralim
        //100 den kucukse "sayi 100'den buyuk olmali yazdiran
        //bir ternary olusturalim

        int sayi=150;

        //ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        //veya bir degiskene atamaliyiz//Eger sonuclar farli data turlerinde ise //atama yapacagimiz variable'in turu tek olacagindan
        //atama yapamayiz
        //SADECE direk yazdirabiliriz

        System.out.println(sayi>100 ? sayi*sayi : "sayi yuzden buyuk olmali");



    }
}
