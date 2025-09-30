package GitHubDesktobHomwerks;

import java.sql.SQLOutput;
import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("----------------------");

        HashSet<String> vx = new  HashSet<String>();
        vx.add("Baku");
        vx.add("Qazag");
        vx.add("London");
        vx.add("Paric");
        vx.add("Baku");
        System.out.println(vx);
        System.out.println("----------------------");
        System.out.println("----------------------");

        TreeSet<Integer> vx1 = new TreeSet<>();
        vx1.add(5);
        vx1.add(4);
        vx1.add(2);

        vx1.add(100);
        System.out.println(vx1);
        System.out.println("----------------------");
        System.out.println("----------------------");
        NavigableSet<String> vx2 = new TreeSet<>();

        vx2.add("Kenan");
        vx2.add("Shahriyar");
        vx2.add("kenan");
        vx2.add("Mansur");

        vx2.higher("Kenan");
        vx2.floor("Mansur");
        vx2.descendingSet();
        System.out.println(vx2);
        System.out.println("----------------------");
        System.out.println("----------------------");
        HashMap<String,Integer> vx3 = new HashMap<>();
        vx3.put("Kenan Ball",99);
        vx3.put("Sahriyar Ball",98);
        vx3.put("Nadir Ball",97);
        System.out.println(vx3);

        LinkedHashMap<String, Double> vx4 = new LinkedHashMap<>();

        TreeMap<Integer,String> vx5 = new TreeMap<>();
        vx5.put(530,"Kenan Student");
        vx5.put(516,"Nadir Student");
        vx5.put(501,"Zakir Student");
        System.out.println(vx5);
        System.out.println("----------------------");
        System.out.println("----------------------");
        TreeSet<String> vx100 = new TreeSet<>();
        vx100.add("Ali");
        vx100.add("Mansur");
        vx100.add("Tamraz");
        vx100.add("Muhammed");
        vx100.add("Umid");
        vx100.add("Ali");
        System.out.println("Наши студенты "+ vx100);
        System.out.println("----------------------");
        System.out.println("----------------------");
        TreeMap<String,Double> vx101 = new TreeMap<>();
        vx101.put("Ali" , 78.76);
        vx101.put("Mansur" , 99.99);
        vx101.put("Tamraz" , 87.56);
        vx101.put("Muhammed" , 0.00);
        vx101.put("Umid" , 100.00);
        vx101.put("Ali" , 78.76);

        System.out.println(vx101);

        System.out.println("----------------------");
        System.out.println("----------------------");
        TreeMap<String,Double> vx1014 = new TreeMap<>();
        System.out.println("Средние баллы студентов!:"+vx1014 );
        vx101.put("Ali" , 19.99);
        vx101.put("Mansur" , 78.99);
        vx101.put("Tamraz" , 67.56);
        vx101.put("Muhammed" , -0.00);
        vx101.put("Umid" , 90.00);
        vx101.put("Ali" , 19.99);



    }
}
