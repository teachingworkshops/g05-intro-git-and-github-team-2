public class Player {
    private String name;
    private boolean hurt;

    public Player(String name) {
        this.name = name;
        this.hurt = false;
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
}
