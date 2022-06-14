package day37_Inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    //bir classi child class yaptigimizda
    // parent classdaki constroctora ulasmasi gerekir
    //bu durumda parent class'daki constructor'un
    //access modifier'i uygun bir modifier yapilmalidir

    //Child class'da tum contructor'larin ilk satirina
    //javanin yerlestirdigi constructor PARAMETRESIZdir yani super
    Child(){
        super();
        System.out.println("child clas parametresiz cons");
    }
    Child(int s){
        super();
        System.out.println("child clas parametresiz cons");

    }Child(int sayi1, int sayi2){
        //Eger parent class'dan parametresiz constroctor'i degil de
        //Baska bir constructor'i calistirmak isterseniz
        //bunu child class;daki constructor;un ILK SATIRINA yazmalisiniz
        System.out.println("iki parametreli cons");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
