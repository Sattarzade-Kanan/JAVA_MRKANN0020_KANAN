package Uroki;

public class Math {
    public static void main(String[] args) {
     MathUnits mathUnits = new MathUnits();

     int number = mathUnits.add(10 ,3 );
     int number2 = mathUnits.division(10, 20);
        System.out.println(number);
        System.out.println(number2);
int number3 = mathUnits.Umnojot(564, 47);

        System.out.println(number3);
        int number4 = mathUnits.Umnojot(34 ,57);

        System.out.println(number4);
    }
}


   class MathUnits{
    int add(int a, int b){
        int sub = a + b;

        return sub;

    }
    int division(int x, int c) {
        int  division = x / c;
        return division;
    }
int Umnojot(int e, int y){
        int Umnojot = e * y;
        return Umnojot;
}

int Delenie(int n , int m ){
        int Delenie = n - m;
        return Delenie;
}
}