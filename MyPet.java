package Homwerk;

import java.util.Scanner;

public class MyPet {
    int id = 5;

    String name;
    String type;
    double price;
    int ageRestriction;
    int customerAge;
double MyMoney;

    void mypet_info() {
        System.out.println( "Имя питомца " + "."+ name);
        System.out.println( "   Порода питомца"+ "." + type);
        System.out.println("Цена питомца" + "." + price);
        System.out.println( "Возрост питомца" + "." + ageRestriction);
        System.out.println( " Ваш возрост" + "." + customerAge);
System.out.println("У вас " + MyMoney + "$");
        if (customerAge < ageRestriction) {
            System.out.println(" Вам " + customerAge + "лет.Вы молодые но вы к сожелению не моэет купть питомца!");
        } else if (MyMoney < price) {
            System.out.println("У вас мало денг :(");
        }else{
            System.out.println("Поздровляем вы можете его купить!!");
        }

        }
    }






