package day22_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        //verilen Array de istenen bir elementin var olup olmadigini
        // true/false yazdirarak gosteren bir method olusturun

        int arr[]= {3,5,6,1,9,0,45,25,4,9,0};

        int istenenSayi=5;

        istenenElemanVarMi(arr,istenenSayi);

        //eger javadan hazir binaryearch ile yapmak isterseniz
        //once short methodunu kullanip sonra binnarysearch yapmaliyiz


    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==istenenSayi){
                System.out.println("true");
                break;
            }

        }
        System.out.println(sonuc);
    }
}
