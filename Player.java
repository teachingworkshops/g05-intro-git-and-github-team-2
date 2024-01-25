public class Player {
    private String name;
    private boolean hurt;
    private boolean inCombat;

    public Player(String name) {
        this.name = name;
        this.hurt = false;
        this.inCombat = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean hurt() {
        return this.hurt;
    }

    public void injure() {
        this.hurt = true;
    }

    public void fight() {
        this.inCombat = true;
    }

    public void endFight() {
        this.inCombat = false;
    }

    public boolean combatState(){
        return this.inCombat;
    }
}
