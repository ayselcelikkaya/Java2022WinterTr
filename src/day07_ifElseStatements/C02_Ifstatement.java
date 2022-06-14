package day07_ifElseStatements;

public class C02_Ifstatement {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        if (a < b && b < 100) {
            System.out.println("Can dost");
            System.out.println("body icindeki tum kodlar calisir");
            System.out.println("Bebek");

        }
        if(a>0) System.out.println("suslu parantez olmazsa sadece bir kod calisir");
        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        //if body sini suslu parantez icine yazdirmalisiniz
        //suslu parantez icine yazmazsak da if cumlesi calisir
        //ancak ilk } gordugunde if cumlesi bitmis olur

        System.out.println("2. satirda calisti");
    }
}
