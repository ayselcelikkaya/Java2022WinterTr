package day45_interfaces;

public interface I01_Default_Static {
    /*
    Interfacelerde sadece abstract methodlar bulunur
    body'si olan concrete bir methot olusturmak istedigimizde
    JavaCTE verir

    Ancak Java 8 ve uzeri versiyonlarda istisnai olarak
    static veya default olarak tanimlanan method'larin bady;si olabilir
    Ancak burada kullanilan default keyword'u access modifier degildir
    */

    void method1();
    public default void method2(){
        System.out.println("Interface'deki default method");

    }
    static void method3(){
        System.out.println("Interface'deki static method");
    }


}
