import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Create player
        System.out.print("Enter a name for your player: ");
        Player p = new Player(s.nextLine());
        System.out.print("\n");

        // Run game
        TreeNode curr = buildTree();

        while(curr != null) {
            curr = turn(p, curr, s);
        }

        System.out.println("Game Over!");

        s.close();
    }

    /*
     * Build game decision tree
     * @return The root of the tree
     */
    public static TreeNode buildTree() {
        TreeNode root = null;

        return root;
    }

    /*
     * Player's turn; player will choose an option, and we will update the current node based on the decision
     * @param p The player
     * @param curr The node we are currently at
     * @param s Scanner for user input
     * @return Result node
     */
    public static TreeNode turn(Player p, TreeNode curr, Scanner s) {
        if(curr.getChildren().size() == 0) {
            return null;
        }

        System.out.println(curr.getText());
        int choice = s.nextInt();

        while(choice < 1 || choice > curr.getChildren().size()) {
            System.out.println("Please enter a valid choice.");
        }

        return curr.getChildren().get(choice-1);
    }
}
