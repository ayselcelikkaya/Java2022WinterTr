package day27_constructor;

public class Toyota {

    String marka= "Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;


    public void maxHiz(){

        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 240 km ");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel araclar icin max 260 km");
        }
    }

    public void  renkTercihleri(){

        if (model.equals("Corolla")){
            System.out.println("Corolla icin renk secenegi: kirmizi ve beyaz");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris renk secenegi : sari ve mavi");
        }
    }

}
