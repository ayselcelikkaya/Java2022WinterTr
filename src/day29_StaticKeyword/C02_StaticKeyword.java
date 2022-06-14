package day29_StaticKeyword;

public class C02_StaticKeyword {

    public static void main(String[] args) {

        //baska class daki static clas uyelerine
        //ulasabilmek icin sadece classIsmi.staticUyeIsmi
        //yazmamiz yeterlidir


        System.out.println(C01_Static.okulTelefonu);//312563635

        C01_Static.okulTelefonu="3125474747";

        System.out.println(C01_Static.okulTelefonu);//3125474747

        //baska class daki static olmayan class uyelerine
        // ancak o class'dan obje olusturarak ulasabiliriz
       // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulIsmi);//Yildiz Koleji
        obj2.okulIsmi="Sabir koleji";
        System.out.println(obj1.okulIsmi);//Yildiz Koleji

    }


}
