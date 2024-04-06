public abstract class Monster {
    private String name;
    private int damage;
    private int hp = 15;
    private boolean destroyed;

    public Monster(String s, int i){
        this.name = s;
        this.damage = i;
        System.out.println("Монстор " + name + " создана ");
    }

    abstract public void attack(Monster monster);

    protected boolean damage(int dhp){

        if ((hp - dhp) <= 0 ){
            destroyed = true;
            System.out.println("Монстр " + name + " убит");
            return true;
        }
        return false;
    }

    protected int getDamage(){
        return damage;
    }

    public boolean isDestroyed(){
        return destroyed;
    }


    // Overload this method to make SCREAMS
    public void growl() {
        System.out.print(" " + name + " кричит ");
    }
}
