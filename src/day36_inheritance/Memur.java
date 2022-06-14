package day36_inheritance;

public class Memur extends Muhasebe {


    public static void main(String[] args) {


        Memur memur1 = new Memur();
        //memur objesi Memur classinin objesi olmasina ragmen
        //inherit ettigi Muhasebe ve onun da parenti olan Personel
        //classlarindaki tum datalari alabilir


        memur1.personelNo = 1001;
        memur1.isim = "Ahmet";
        memur1.soyisim = "Tepecik";
        memur1.adres = "Aydin";
        memur1.telefon = "1234567890";

        //Muhasebe Classindan
        memur1.saatUcreti = 10;
        memur1.maas = memur1.maasHesapla();
        memur1.statu = "Memur";
        System.out.println(memur1);


        Memur memur2 = new Memur();
        memur2.personelNo = 1002;
        memur2.saatUcreti = 20;
        memur2.maas = memur2.maasHesapla();

        System.out.println(memur2);

    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + telefon + '\'' +
                '}';
    }
    }
