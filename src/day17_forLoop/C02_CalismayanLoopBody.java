package day17_forLoop;

public class C02_CalismayanLoopBody {

    public static void main(String[] args) {
        for (int i = 0; i > 10; i++) {
            System.out.println(i);

            System.out.println("baslangic degerini bitis konsolunu saglamadan\n+" +
                    "loop body'si hic calismadan loop sona erdi");

        }
        System.out.println("baslangic degeri bitis kosulunu saglayamadigindan\n" +
                "loop body'si hic calismadan loop sona erdi");
    }
}
