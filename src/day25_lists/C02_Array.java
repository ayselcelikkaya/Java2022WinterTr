package day25_lists;

import java.util.Arrays;

public class C02_Array {

    public static void main(String[] args) {


        //verilen bir Array'dan istenen elementi(kac tane varsa) silip, kalanlari'
        //yeni bir array olarak yazdiran bir method olusturun


        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementSil(arr,istenmeyenEleman);


    }

    public static void istenmeyenElementSil(int[] arr, int istenmeyenEleman) {


        //1)istenmeyen element sayisini bulalim

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==istenmeyenEleman){
                sayac++;

            }

        }
        //2)yeni arr'yi olusturalim
        int arrYeni[]=new int[arr.length-sayac];

        //3) Eski array den uygun elementleri yeniye tasi
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }

        }

        //4)Yeni array'i yazdirmak
        System.out.println(Arrays.toString(arrYeni));

    }
}
