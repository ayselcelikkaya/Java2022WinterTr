package day09_Ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //Verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
        //0 veya pozitif sayi ise tek veya cift
        //negatifse -100 den buyuk veya kucuk
        //oldugunu belirleyen bir ternary yaziniz

        int sayi=121;
        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozif cift sayi");
            }else {
                System.out.println("Sayi pozitif tek sayi");
            }
        } else {
            if (sayi<= -100){
                System.out.println("Sayi -100 den kucuk negatif sayi");
            }else {
                System.out.println("Sayi -100'den buyuk negatif sayi");
            }
        }




    }
}
