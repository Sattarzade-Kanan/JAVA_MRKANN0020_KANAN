package UrokiOuter;

public class Home {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
class Outer{
    int outher_1 = 100;
    int outher_2 = 850 - outher_1;


    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display(){
            System.out.println(outher_2);
        }
    }
}