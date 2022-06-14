package day28_constructor;

public class StaticKeyword {

    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        System.out.println("sayi1  :  " +sayi1);
        //System.out.println("  :  "+sayi2);static olmadigi icin direk kullanamam

        StaticKeyword obj1 = new StaticKeyword();
        System.out.println(obj1.sayi2);//0

        sayi1++;
        obj1.sayi2++;

        System.out.println("sayi1  :  " +sayi1);
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2 = new StaticKeyword();
        System.out.println(obj1.sayi2);//0
        System.out.println(obj1.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);//
        System.out.println(obj2.sayi1);//





    }
}
