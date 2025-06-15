package JAV;

import java.util.Scanner;

public class BOLSHOY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напиши имя: ");
        String name = scanner.nextLine();


        System.out.println("Напиши свой возрост !: ");
        int age = scanner.nextInt();


        System.out.println("Напиши свой рост: ");
        double metrax = scanner.nextDouble();


        System.out.println("У вас есть скидочная карта?");
        String answer = scanner.nextLine();
        boolean SkidcCard = answer.equalsIgnoreCase("да");

        if (SkidcCard) {
            System.out.println("У вас есть скидочная карта!");
        } else {
            System.out.println("У вас нет скидочной карты!");
        }


        System.out.println("Напиши свою любимою букву!: ");
        char alfovit = scanner.next().charAt(0);
        System.out.println("Ваша любимая буква эта : " + alfovit);

        System.out.println("Сколько покупок вы хотите сделать");
        int tovar = scanner.nextInt();
        if (tovar >= 1 && tovar <= 3) {
            System.out.println("Вы вабрали " + tovar + "товар");
        } else {
            System.out.println("Выбирите от 1 до 3 !");
        }
        for (int i = 0; i < tovar; i++) {

            System.out.println("Ведите стоимость каждой покупке " + (i + 1) + "=");


            if (!scanner.hasNextDouble()) {
                System.out.println("Ведите число правильно!");
            }
            System.out.println("Ваше имя: " + name);

            System.out.println("Ваш возрост: " + age);
            System.out.println("Ваш рост: " + metrax);

        } if (age < 12) {
            System.out.println(name + ", вы рибенок.");
        }
        else if (age >= 12 && age <= 17) {
            System.out.println(name + ", вы подросток.");
        }
        else if (age >= 18 && age <= 59) {
            System.out.println(name + ", вы взрослый.");
        }
        else if (age >= 60) {
            System.out.println(name + ", вы пинсионер.");
        }
        else {
            System.out.println("Возраст НЕПРАВИЛЬНЫЙ.");
        }

    }

    }

