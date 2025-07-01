package GitHubDesktobHomwerks;

import org.w3c.dom.ls.LSOutput;

public class Bank {
    public static void main(String[] args) {
        Bank[] accounts = new Bank[3];


        accounts[0] = new Saving();
        accounts[1] = new CheckingAccount();
        accounts[2] = new BusinessAccount();



        for (Bank acc : accounts){
            acc.accountType();
            acc.deposit(552);
            acc.withdraw(1052);
            System.out.println("Ваш Баланс:" + acc.bank);
            System.out.println("----------------------");
        }
    }
    double bank;
    public void deposit(double amount){
        bank += amount;
        System.out.println("Внесино в банк!");
    }
    public void withdraw(double amount){
        bank += amount;
        System.out.println("Снята с банка" + amount);
    }
    public void accountType(){
        System.out.println("Тип счета ....Неизвестен");
        System.out.println("-------------------------");
    }
    public static class Saving extends Bank{
       @Override
        public void withdraw(double amount){
           System.out.println("Снял со сбегаратильного счета");
           super.withdraw(amount);
        }
        @Override
        public  void accountType(){
            System.out.println("Ваш сберtегатильный счет");
        }

    }
    public static class CheckingAccount extends Bank{
        @Override
        public void withdraw(double amount){
            System.out.println("Снятие с рачсечтного счета");

            super.withdraw(amount);
        }
        @Override
        public void accountType(){
            System.out.println("Расчетной счет");
        }
    }
    public static class BusinessAccount extends Bank {
        @Override
        public void withdraw(double amount){
            System.out.println("Снятие с бизнеса!");
            super.withdraw(amount);
        }
        @Override
        public void accountType(){
            System.out.println("Счет бизнеса");
        }
    }
}
