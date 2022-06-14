package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        //kullanicidan kac elementlik bir array olusturacagini soran
        //arrayi olusturup elementleri kullanicidan alip array'e atayin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yazin");

        int uzunluk=scan.nextInt();// mesela 5 girdi kullanici

        int arr[]=new int[uzunluk];//[0,0,0,0,0]

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin "+ (i + 1)+".elemani giriniz");

            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
