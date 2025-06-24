package Homwerk;

public class HomwerkMath1Objects {
    String name = "Кянан";
    int age = 13;

String name1 = "Zakir";
int age1 = 21;



    void greet(){
        System.out.println("Привет меня зовут :" + name);
        System.out.println("И мне :" + age + "лет");
    }
    void greet1(){
        System.out.println("Привет меня зовут :" + name1);
        System.out.println("И мне :" + age1 + "лет");
    }

    public static void main(String[] args) {
        HomwerkMath1Objects person = new HomwerkMath1Objects();
        person.greet();
        person.greet1();
    }
}
