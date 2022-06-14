package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variablenin degerlerini toplayan bir method olusturalim
        //1. adim: method adini yazalim
        //2. adim methoda gondermem gereken argument var mi
        ikiSayiTopla(25,50);

        C04.dortHarfiTersineCevir("sema");
    }
    //bir methodu olusturmak calismasi icin yeterli degildir
    //method ancak cagirilirsa calisiriz
    //Ayni class ya da farkli class da olmasinin hicbir onemi yoktur
    //Java main methodda yukaridan asagi dogru calisir
    //ve geldigi satiri calisir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen iki sayinin toplami:"+(a+b));
    }


}
