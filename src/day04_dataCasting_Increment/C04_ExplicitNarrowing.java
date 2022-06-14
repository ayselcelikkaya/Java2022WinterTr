package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=879;
        int sayi2=10;


        double sayi3=sayi1/sayi2;//87.0
        System.out.println(sayi3);

        int sayi4= (int) sayi1/sayi2;  //87.09
        //deger double, variable int
        //yani var'able daha dar dolayisiyla java bunu otomatik olarak yapmaz
        //sorumlulugu ustlenmemizi ister
        //sag tarafa yazdigimiz (int) sorumluluk bende demek



        System.out.println(sayi4); //87

        int sayi5=140;
        byte sayi6=(byte)sayi5; //sag taraftaki deger int> sol taraftaki variable byte

        System.out.println(sayi6);


    }
}
