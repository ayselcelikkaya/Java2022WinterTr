package day33_varargs_stringBuilder;

public class C02_Varargs {

    //parametre olarak bir int
    //ve istedigimiz kadara String alan
    //en uzun kelimenin harf sayisi ile int parametre degerini
    //carpip sonucu yazdiran bir method olusturun

    public static void main(String[] args) {


        int sayi = 5;
        String str1 = "zulal";
        String str2 = "Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str2);

        // Bir method'da varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip, varargs'i en sona yazmaliyiz
        // Bu sebeple bir method'da birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String... str) {

        String enUzunStr ="";

        for (String each: str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;

            }
        }
        System.out.println("Istenen deger : " + sayi * enUzunStr.length());

    }



}