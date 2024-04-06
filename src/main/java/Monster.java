public abstract class Monster {
    private String name;
    private int damage;

    public Monster(String s, int i){
        this.name = s;
        this.damage = i;
        System.out.println("Монстор " + name + " создана ");
    }


    // Overload this method to make SCREAMS
    public void growl() {
        System.out.print(" " + name + " кричит ");
    }

    public void attack() {
        System.out.println(" " + name + " нанесла " + damage + " урона");
    }
}
