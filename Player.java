public class Player {
    private String name;
    private boolean hurt;
    private boolean inCombat;
    private boolean isEmpowered;
    private boolean hasRing;

    public Player(String name) {
        this.name = name;
        this.hurt = false;
        this.inCombat = false;
        this.isEmpowered = false;
        this.hasRing = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean hurt() {
        return this.hurt;
    }

    public boolean getEmpowered() {
        return this.isEmpowered;
    }

    public boolean getRing() {
        return this.hasRing;
    }
    public void setRing(){
        hasRing = true;
    }
    public void setEmpowered(){
        isEmpowered = true;
    }
    public void injure() {
        this.hurt = true;
    }

    public void heal() {
        this.hurt = false;
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
