package Homwerk;


import java.io.File;
import java.io.IOException;


public class MiniBankHomwerk {
  double money = 0;

    void deposit(double amount) {
        System.out.println("Ваша карта открыта у вас 0 денег по умолчанию!");
        money += amount;
        System.out.println("----------------------------------------------");
    }
    void withdraw(double amount){
        money -= amount;
        System.out.println("Вы сняли с карты:" + amount  );
     if (money>0){
         System.out.println("Недостаточно стредств!");
     }
        try{
            if (money<amount){
               throw new Exception("Недостаточно средств!");
            }
        } catch (Exception e) {
            System.out.println("Да кончено можно!");
        }
    }

    public static void main(String[] args) {
        MiniBankHomwerk bank = new MiniBankHomwerk();

        System.out.println("----------------------------------------------------------------");
        bank.deposit(20);
        bank.withdraw(-21);



    }

}