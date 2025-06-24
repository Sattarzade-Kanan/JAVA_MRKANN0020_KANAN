package Homwerk;

import java.io.Console;

public class HomwerkKANAN {
    public static void main(String[] args) {
        double a = 25;
        double b = -4.7;
        double c  = 2.5;


        int sgrtA = (int) Math.sqrt(a);
        Math console;
        System.out.println("Квадратный корень из a = " + sgrtA);



        double absB = Math.abs(b);
        System.out.println("Значение b" + absB);



        double powC = Math.pow(c,3);
        System.out.println("С В кубе " + powC);

        System.out.println("min(a, c) = " + Math.min(a, c) );

        System.out.println("max(a, c) = " + Math.max(a, c) );


        System.out.println("Округление внизу = " + Math.floor(b));
        System.out.println("Округление вверх = " + Math.ceil(b));
        System.out.println("Округление по правилам = " + Math.round(b));
    }
}
