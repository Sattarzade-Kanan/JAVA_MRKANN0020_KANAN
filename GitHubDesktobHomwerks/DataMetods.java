package Homwerk;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataMetods {
    public static void main(String[] args) {
        Date date = new Date();

        long msec = date.getTime();
        System.out.println("Количество прошедших миллисикунд" + msec);
String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Calendar calendar = Calendar.getInstance();
        System.out.println( "Месяц.."+months[calendar.get(Calendar.MONTH)]);
        System.out.println("Дата.."+calendar.get(Calendar.DATE ));
        System.out.println("Год.."+calendar.get(Calendar.YEAR ));

      calendar.set( Calendar.HOUR , 240);

        System.out.println("Минуты.."+calendar.get(Calendar.MINUTE));
        System.out.println("Секунды"+calendar.get(Calendar.SECOND));


        LocalDate date1 = LocalDate.now();
        int year = date1.getDayOfYear();
        System.out.println("Сейчас "+year + ":"
        + "день в году");
        LocalDate plus = date1.plusDays(100);
        System.out.println("Измененная дата на 100 дней больше"+plus);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите дату на которую хотите переместись только в днях!");
        String data = scanner.nextLine();
        
    }
}
