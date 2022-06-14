package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Iki Ssyi Giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        if (sayi1<0 && sayi2>0){
            System.out.println("Girdiginiz Iki Sayi da Pozitif olugundantoplamlari=" +(sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){



        }



    }
}
