package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {


        LocalTime tm = LocalTime.now();
        System.out.println(tm);//21/10/01/011711


        //bir islemin ne kadar surede bittigini bulmak icin
        //
        //aradaki farki hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i <10000 ; i++) {
            sayi+=i;

        }
        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi);//22:15:30.522285500

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem"+(nano2-nano1)+"nanosaniyede bitti");


        //ileri veya geri ye gidebiliriz
        System.out.println(tm.plusMinutes(1000));//15:01:09.128307300

        //istersek zone Id kullanmak istedigimiz bolgenin

    }
}