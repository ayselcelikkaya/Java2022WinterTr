package day03_scanner;

public class C02_swapVariables {

    public static void main(String[] args) {

        /*1-Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP) b'r program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 sayi2=10
         */

        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan once sayi1:" + sayi1 +",sayi2: "+ sayi2);
        //1.adim bos variable olusturup
        //sayi1'i ona atayalim

        int temp=sayi1;

        //2.adim sayi1'e yen' degerini atayalim
        sayi1= sayi2;

        //3. adimsayi2 ye tempe yedekledigimiz sayi1 degerini atayalim

        sayi2=temp;
        System.out.println("Swap'dan sonra sayi1: " +sayi1 + ",sayi2:" +sayi2);






    }
}
