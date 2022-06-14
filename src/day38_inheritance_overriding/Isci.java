package day38_inheritance_overriding;

public class Isci extends Personel{
    public String statu="Isci";
    public String haklar="Isciler kidem tazminati alirlar";
    public String ikramiye="Isciler ikramiye alirlar";

    public void mesai(){
        System.out.println("Tum isciler haftalik 40 saat calisir");
    }

    public void maasHesapla(){
        System.out.println("Tum isci 30 gun * 8  saat* 10 euro= "+(30*8*10)+"Euro maas");
    }

}

