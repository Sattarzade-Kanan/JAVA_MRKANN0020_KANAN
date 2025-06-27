package GitHubDesktobHomwerks;

public class Nasledstvo {
    public static void main(String[] args) {
        Werrior w = new Werrior();
        w.attack();
        w.heavy();
    }
}
class Hero {
    String name;
    int xp;

    void attack() {
        System.out.println("Герой атакует");
    }
}
class Werrior extends Hero {
    public void Warrior() {
        name = "Кянана Воин";;
    }

    void heavy() {
        System.out.println(name + "Он делает сокрушутельную атаку!");
    }
}