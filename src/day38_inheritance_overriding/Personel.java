package day38_inheritance_overriding;

public class Personel {

    public String statu="Personel";
    public String haklar="tum Personel esit haklara sahiptir";
    public String izin="Tum personel yilda 4 hafta izin kullanir";

    public void mesai(){
        System.out.println("Tum personel bes gun icinde 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8  saat* 10 euro= "+(30*8*10)+"Euro maas");
    }
}
