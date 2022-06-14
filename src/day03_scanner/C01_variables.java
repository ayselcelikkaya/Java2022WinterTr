package day03_scanner;

public class C01_variables {

    public static void main(String[] args) {
        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);


        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf);
        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);

        String isim="Nezir";
        String soyisim="Yildiz";

        System.out.println("Isminiz :" +isim);
        System.out.println("SoyIsminiz : " +soyisim);
        short sayi3=20;
        double sayi4=30;

        System.out.println("iki sayinin toplami:" +( sayi3 + sayi4));
        //4 Bir tamsayi bir ondalikli variable olusturun ve bunlarin toplamini yazin


        //5 char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter='#';
        System.out.println(ozelKarakter);
        //6 bir tamsayi bir de char degisken olusturun ve bunlarin toplamini yazdirin


        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf);//117
        //char data turundeki degiskenler matematiksel islemlerde kullanilirsa
        //o char degerinin ASCII karsiligi isleme alir
        int sayi6='a';
        System.out.println(sayi6); //97


    }


}
