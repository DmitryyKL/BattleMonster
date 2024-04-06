public class Battle {
    final static private int Max = 5;
    private Monster[] monsters;
    private int n;

    Battle(){
        monsters = new Monster[Max];
    }
    void add(Monster monster){
        if (n < Max){
            monsters[n++] = monster;
        } else {
            System.out.println("Больше монстров создать нельзя!");
        }
    }

    public void run(){
        for (int i = 0; i < n; i++){
            if (monsters[i] != null) {
                monsters[i].attack();
            }
        }
    }

    public void start(){
        run();
    }
}
