public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice", 5);
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);
        zombie1.attack();
    }
}
