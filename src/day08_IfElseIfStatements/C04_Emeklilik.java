package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {

    public static void main(String[] args) {
       // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\nKadin icin K \nErkek icin E harfi giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();


        if (cinsiyet=='K') {

            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");

            }else if (yas<60){
                System.out.println("Emekli olamazsin \n daha" +(60-yas) +"yil daha calisman gerekir");
            }else{
                System.out.println("Emekli Olabilirsin");
            }
        }else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");

            }else if (yas<65){
                System.out.println("Emekli olamazsin \n daha" +(65-yas) +"yil daha calisman gerekir");
            }else{
                System.out.println("Emekli Olabilirsin");
            }

        }else{
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");

        }
    }
}
