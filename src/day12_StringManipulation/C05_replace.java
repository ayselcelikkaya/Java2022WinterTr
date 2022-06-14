package day12_StringManipulation;

public class C05_replace {

    public static void main(String[] args) {
        String str="Bugun ne cok sey ogrendik";

        //bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println("Space haric karakter sayisi:"+str.replace(" ","").length());


        //Atama yapilmadigi surece orjinal String kalici olarak degismez
        //sadece o satir icin de[';'klik yapilip sonuc yazdirilmis olur
        System.out.println("orjinal str karakter sayisi"+str.length());


        //str da kalici degisiklik yapalim
        //bugun yerine yarin yazdiralim
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalici degisiklikten sonra:"+str);


        //Atma yoksa kalici de[';'klik yapmaz sadece bir kereligine ekrana yazdirmak icin
        //mesela ne cok yerine ne az yazdiralim
        str.replace("ne cok","ne az");//atama yapmadik sadece yazdik

        System.out.println(str);// atama yapmadigimiz icin ekranda eski yazdigimiz str goruruz


    }

}
