package GitHubDesktobHomwerks;

import java.util.*;

public class Map2Main {

    public static void main(String[] args) {
//        Лвл 1
        HashMap<String, Integer> student = new HashMap<>();

        student.put("Jeyla", 17);
        student.put("Aylin", 13);
        student.put("Aylin", 13);
        student.put("Lacla", 12);
        System.out.println("Наши студенты");
        System.out.println(student);

        LinkedHashMap<Integer,String> goroda = new LinkedHashMap<>();
        goroda.put(1999,"Baku");
        goroda.put(2025,"Sanxay");
        goroda.put(1800,"Quba");
        goroda.put(1950,"Moskva");
//        Лвл 2

        System.out.println("Наши города");
        System.out.println(goroda.keySet());
        System.out.println(goroda.values());
//        Лвл 3
        TreeMap<Integer,String> user12 = new TreeMap<>();
        user12.put(994,"Ali");
        user12.put(995,"Javad");
        user12.put(954,"Umid");
        System.out.println(user12);
        System.out.println(user12.firstEntry());
        System.out.println(user12.lastEntry());
        System.out.println("Nomer");
        System.out.println(user12.higherEntry(994));
        System.out.println(user12.lowerEntry(995));
//        lvl 4
        TreeMap<String, Double> student1 = new TreeMap<>();
        student1.put("Jona", 70.00);
        student1.put("Silva", 0.00);
        student1.put("Karett", 60.00);

        Set<Map.Entry<String,Double>> set = student1.entrySet();

        for(Map.Entry < String,Double> me : set){
            System.out.println(me.getKey());
            System.out.println(me.getValue());


        }

//       Старый дз

        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");


        HashMap<String,Integer> stts = new HashMap<>();
        stts.put("Aylin" , 99);
        stts.put("Ali" , 69);
        stts.put("Umud" , 49);
        stts.put("Umid" , 89);
        System.out.println(stts + "Наши студенты дз старое !");

        TreeMap<Integer,String> lol = new TreeMap<>();
        lol.put(67,"Aylin");
        lol.put(39,"Umid");
        lol.put(69,"Ali");
        System.out.println(lol);
        System.out.println(lol.keySet());


     NavigableMap<String,Integer> mapee = new TreeMap<>();
     mapee.put("Jana", 90);
        mapee.put("Tamraz", 56);
        mapee.put("Ziyad", 23);
        System.out.println(mapee);
        mapee.firstEntry();
        mapee.lastEntry();


//        mini proekt
        System.out.println("----------------------------");
        Set<String> student7 = new HashSet<>();
        student7.add("Aylin");
        student7.add("Mansur");
        student7.add("Mirali");
        System.out.println("Наши студенты!");
        System.out.println(student7 );

        SortedMap<String,Double> studentlast = new TreeMap<>();
        studentlast.put("AYLIN", 85.99);
        studentlast.put("MANSUR", 84.9);
        studentlast.put("MIRALI2", 86.99);

        System.out.println("Оценки студентов-:");
        System.out.println(studentlast);
  



    }
}