public class GiantSnake extends Monster{
    public static String scream = "Ssssss";

    public GiantSnake(String name, int damage) {
        super(name + " класса Гигантская змея", damage);
    }

    @Override
    public void growl(){
        super.growl();
        System.out.println(scream);
    }

    public void growl(boolean loud){
        if (!loud) {
            growl();
        }
        else {
            super.growl();
            System.out.println(scream.toUpperCase());
        }
    }

    @Override
    public void attack(Monster monster){
        monster.damage(getDamage());
        growl();
    }

}

