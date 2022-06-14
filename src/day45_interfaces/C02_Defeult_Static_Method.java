package day45_interfaces;

public class C02_Defeult_Static_Method implements I01_Default_Static{
    //Default veya static olarak tanimlanan ve body'si olan methodlarin
    // ovirride edilmesi mecburiDEGILDIR
   // Eger static olarak tanimlanmissa zaten ovirride edemeyiz


    @Override
    public void method1() {
        System.out.println("child class method1");

    }

    public static void main(String[] args) {
        //Interfacedeki static olarak tanimlanan methodlara
        //static yontemlerle ulasilabilir
        //InterfaceIsmi.MethodIsmi
        I01_Default_Static.method3();
        C02_Defeult_Static_Method obj = new C02_Defeult_Static_Method();
        obj.method1();//child class method1
        obj.method2();//Interface'deki default method
       // obj.method3(); eski classlarda static bir uyeye
        // static olmayan yollarla da ulasabilirdik
        // Ancak interface icinde static olarak tanimlanan methoda
        //static olmayan yontemlerle ulasilamaz
    }
}
