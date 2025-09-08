package Homwerk;

public class LibraryandComputer {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();

    }
}
class Outer{
 String outher_1 = "Garry poter";
String outher_2 = "Grafiti folz";
String outher_3 = "Ano";
String outher_4 = "Hp Computer";
    String outher_5 = "Mac Computer";
    String outher_6 = "Linux Computer";


    void test(){
        Inner1 inner1 = new Inner1();
        inner1.display();
    }
    class Inner1 {
        void display(){
            System.out.println("--------------------------");
            System.out.println(outher_1 + "," +  "В наличии осталось таких 4");
            System.out.println("--------------------------");
            System.out.println(outher_2 + "," +  "В наличии осталось таких 1");
            System.out.println("--------------------------");
            System.out.println(outher_3 + "," + "В наличии осталось таких 6");
            System.out.println("У нас также есть прекрасные ноутбуки!");
            System.out.println("--------------------------");
            System.out.println(outher_4 +  "," +"Цена 1400 манат");
            System.out.println("--------------------------");
            System.out.println(outher_5 + ","+ "Цена 2500 манат");
            System.out.println("--------------------------");
            System.out.println(outher_6 + "," + "Цена 1200 манат");
        }
    }
}