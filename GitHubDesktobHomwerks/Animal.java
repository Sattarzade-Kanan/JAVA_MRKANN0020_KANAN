package GitHubDesktobHomwerks;

public class Animal {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Lion lion = new Lion();
 lion.eat();
     lion.info();
     lion.move();
     lion.makeSound();
        System.out.println("------------------------------");
     Parrot parrot = new Parrot();
     parrot.info();
     parrot.move();
        parrot.makeSound();
        System.out.println("------------------------------");
        Fish fish = new Fish();
        fish.info();
        fish.eat();
        fish.makeSound();
    }
    String name;
    void makeSound() {
        System.out.println("Животное издоет звук ....");
    }
    void move() {
        System.out.println("Животное двигается !" + name);
    }
    void eat() {
        System.out.println("Животное ест");
    }
    void info() {
        System.out.println("Имя животного:" + name);
    }
  public static class Lion extends Animal{
        void makeSound() {
            System.out.println("Лев рычит ,аккуратно!");
        }
        void move() {
            System.out.println("Lev двигается !");
        }
        void eat(){
            System.out.println("Лев кушает мясо");
        }
        void info() {
            System.out.println("Льва зовут Бублик");
        }
}
public static class Parrot extends Animal{

    void makeSound() {
        System.out.println("Папугай говорит бублик и повторяет");
    }
    void move() {
        System.out.println(" Попугай летит");
    }
    void eat(){
        System.out.println("Попугай кушает зерна");
    }
    void info() {
        System.out.println("Попугая зовут Лимон");
    }
}
    public static class Fish extends Animal{
        void makeSound() {
            System.out.println("Рыба булькает плавает");
        }
        void move() {
            System.out.println(" Рыба плавает");
        }
        void eat(){
            System.out.println("Рыба ест водоросли");
        }
        void info() {
            System.out.println("Рыбу зовут Перчик");
        }
    }
}
