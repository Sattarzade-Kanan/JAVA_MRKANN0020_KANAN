package GitHubDesktobHomwerks;

public class HomwerkKenana {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("Hello" );

        st.insert(5 , " World");
        System.out.println( "" + st);



        StringBuilder sr = new StringBuilder("Java fun");
        sr.insert(4, "is");
        System.out.println("" + sr);


        StringBuilder sk = new StringBuilder("I like java");
        sk.replace(7 , 11 , "Python");
        System.out.println(sk);


        StringBuilder sv = new StringBuilder("Delete this word");
        sv.delete(7,11);
        System.out.println(sv);


        StringBuilder sl = new StringBuilder("12345");
        sl.reverse();
        System.out.println(sl);

        StringBuilder sd = new StringBuilder("Java Programming");
        System.out.println(sd.length());
        System.out.println(sd);

        StringBuilder se = new StringBuilder("Java i like java i ");
        se.delete(15,20);
        System.out.println(se);


        StringBuilder ww = new StringBuilder("ProgrammingInJava");
        ww.delete(11,17);

        StringBuilder so = new StringBuilder("Hell0");
        so.setCharAt(5 , 'o');
        System.out.println(so);

        StringBuilder dd = new StringBuilder("User {name} has {points} points");

        dd.replace(16, 24 ,"Bal");
        System.out.println(dd);
    }

}
