package day11_StringManippulatin;

import java.util.Scanner;

public class C05_IndexOf {

    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        //istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('j'));//0


        //istersek harf ya da metinolarak verdigimiz String'inindexini dondurur
        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10

        //ayni harften birden fazla varsa?
        System.out.println(str1.indexOf("b"));//5 buldugu ilk dogru eslemenin indexini dondurur

        //verilen String'deki ikinci A harfinin indx'ini bulalim
        int ilkIndex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a',ilkIndex+1));//3

        // verilen String'deki 2.b harfinin index'ini bulalim
        int ilkbindex= str1.indexOf("b");// 5
        System.out.println(str1.indexOf("b",ilkbindex+1)); // 9
        // 20. index'den sonra guzel aratalim
        System.out.println(str1.indexOf("guzel", 20)); //31
        // String'de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type'i index
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir
        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen mailiniz yazin");
        String mail= scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        } else{
            System.out.println("mailiniz kabul edildi");
        }
        // OZET : indexOf method'u icierise yazilan String veya char'in
        // metinde hangi index'de oldugu bize dondurur
        // eger aradigimiz metin veya char yoksa , olmadiginin delili olarak
        // bize -1 dondurur



    }
}
