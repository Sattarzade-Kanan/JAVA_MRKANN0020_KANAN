package JAV;

public class Bilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Prosto Kenan" );
        sb.insert(0, "&&&&" );
        sb.insert(16, "&&&&");
       sb.replace(0,16 ,"Просто Кянан");
       sb.replace(0,16 ,"ПРОСТО КЯНАН");
        System.out.println(sb);
    }
}
