public class Zombie extends Monster{

    public static String scream = "Raaaauuughhhh";

    public Zombie(String name, int damage) {
        super(name + " класса Зомби", damage);
    }


    // Overload this method to make SCREAMS
    @Override
    public void growl(){
        super.growl();
        System.out.println(scream);
    }

    public void growl(boolean vul){
        if (!vul){
            growl();
        } else {
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
