package day08_IfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {
        //Girilen bir karekterin harf olmadigini bulalim


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z')  || (karakter>='a' && karakter<='z')){
            System.out.println("Girdiginiz karakter bir harf");
        } else {
            System.out.println("Girdiginiz karakter harf degil");
        }


    }
}
