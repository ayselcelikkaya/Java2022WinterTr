package day04_dataCasting_Increment;

public class C03_Casting {

    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2);//2

        sayi2=3;

        System.out.println(sayi1/sayi2); //2.666666=2

        sayi1=22;

        System.out.println(sayi1/sayi2);//7.333333=7

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;//478.6

        System.out.println(sayi1);//478

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);//47

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);//4

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);//0

        sayi1=4895;
        double sayi3=10;

        //sayi1=sayi1/sayi3;//'k' farkli sayi data turunu isleme koydugumuzda
       //java kucuk olan data turu icin autoWidening yapar
       //bu islemi dusunursek sayi1/sayi3=islemin sonucunu double kabul eder


        System.out.println(sayi1/sayi2);

        System.out.println(sayi3/sayi1);








    }
}
