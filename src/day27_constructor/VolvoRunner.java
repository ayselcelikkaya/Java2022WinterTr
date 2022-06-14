package day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {

        Volvo arb1=new Volvo();
        System.out.println(arb1.marka);
        arb1.yakit="Dizel";
        arb1.elektrikliMi=false;
        System.out.println(arb1.maxHiz);

        System.out.println(arb1.toString());

        Volvo arb2=new Volvo();
        arb2.yakit="elektrikli";
        arb2.elektrikliMi=true;
        arb2.model="XC90";
        System.out.println(arb2.toString());



    }
}
