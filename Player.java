public class Player {
    private String name;
    private boolean hurt;

    public Player(String name) {
        this.name = name;
        hurt = false;
    }

    public String getName() {
        return this.name;
    }
}
