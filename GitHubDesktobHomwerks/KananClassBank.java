package GitHubDesktobHomwerks;

import org.w3c.dom.ls.LSOutput;

public class KananClassBank {

    String accountHolder;
    double balance;
double credit;
    public KananClassBank(String accountHolder , double balance, double credit){
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.credit = credit;;
    }
    public void openAccount(){
        System.out.println("Открыт аккаунт для:" + accountHolder + ":" + "И его баланс:" + balance + ":"+ "Количество кредитов: " + credit);
    }



    public void Infromatie(){
        System.out.println("Владелец карты: "  + accountHolder  + ":"+ "Ваш баланс:" + balance  + ":"+ "У вас: " +":"+ credit  + ":"+ "кредитов");
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------");
        KananClassBank kananClassBank = new KananClassBank("Kanan",5000 , 1 );
        kananClassBank.openAccount();
        System.out.println("-------------------------------");
        kananClassBank.Infromatie();

    }
}
