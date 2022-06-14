package day11_StringManippulatin;

import java.util.Scanner;

public class C03_egualsIgnoreCase {

    public static void main(String[] args) {


        //Kullaniciya derse katilip katilmak istemedigini sorun
        //evet derse cevabini :derse katiliminiz alinmistir" yazdirin
        //hayir derse cevabini ve "sonraki dersimize bekleriz" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse kailmak ister misiniz? \n Evet veya hayir yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: "+cevap+"Derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("Hayir")){
            System.out.println("cevabiniz: "+cevap+"Sonraki dersimize bekleriz");
        }else{
            System.out.println("Lutfen evet veya hayir yaziniz");
        }



    }
}
