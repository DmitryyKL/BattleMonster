public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice", 5));
        battle.add(new Zombie("Bob", 8));
        battle.add(new Zombie("Eve", 3));
        battle.add(new GiantSnake("Kaa",10));
        battle.add(new GiantSnake("Son of Kaa", 12));

        battle.add(new Zombie("Noname", 6));
        battle.add(new GiantSnake("Noname",27));

        battle.start();
    }
}
