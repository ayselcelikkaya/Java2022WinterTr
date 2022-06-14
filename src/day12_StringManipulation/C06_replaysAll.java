package day12_StringManipulation;

import java.util.Scanner;

public class C06_replaysAll {

    public static void main(String[] args) {


        //Kullanicidan isim soyisim bilgisi alip
        //butun harfleri * yapalim

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi ve Soyisminizi giriniz");
        String isimSoyisim= scan.nextLine();


        System.out.println(isimSoyisim.replaceAll("\\S","*"));

    }
}
