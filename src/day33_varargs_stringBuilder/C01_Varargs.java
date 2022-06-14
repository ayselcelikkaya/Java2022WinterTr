package day33_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {
        // kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        //Yazilan argument sayisi sabitse her zamanki gibi sabit method olusturabiliriz
        //ancak argument sayisinin degisme ihtimali varsan
        //o zaman varrags tercih edilir

        enUzunKelime(str1,str2,str3);

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr ="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){

            }
        }
        System.out.println("En uzun kelime :" +enUzunStr);

    }
}
