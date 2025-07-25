package GitHubDesktobHomwerks;

public class StringBuilder2 {
    public static void main(String[] args) {
        String str1 = "Java ";
        System.out.println(str1.charAt(2));
        System.out.println(str1 + "Это покажет до символа 2 этот метод супер!");


        String str2  = "JAVA";
        String str3 = "Java";
        System.out.println("equals , equalsIgnoreCase он проверяет значение в одном true or false");
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));


        String str4 = "Dog";
        System.out.println(str4.startsWith("D"));
        System.out.println(str1.endsWith("o"));

        System.out.println(str4 + "Проверяет на наличии символов");



        String str5 = "Fun";
        String str6 = "Fun";
        System.out.println(str5.compareTo(str6));
        System.out.println(str5 + str6 + "Этот метод соядиняет слова !");


        String str7   = "programmist";
        System.out.println(str7.indexOf(   "g"));
        System.out.println(str7.lastIndexOf("i"));
        System.out.println(str7 + "Этот метод показывает с буквы г и заканчивает с и");

        String str8  ="Java";
        String str9 = "Is programming luanguage";
        System.out.println(str8.concat(str9));
        System.out.println(str8 + str9 + "Соединяет слово друг другу");




     String join = "Kanan" + "Mansur" + "Sehriyar";
        System.out.println(join.trim() + "Соединяет все слова ");
    }
}
