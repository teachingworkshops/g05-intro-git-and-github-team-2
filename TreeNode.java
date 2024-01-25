public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private String text;

    public TreeNode(String text) {
        this.text = text;
    }

    public TreeNode left() {
        return this.left;
    }

    public TreeNode right() {
        return this.right;
    }

    public String getAdvNode() {
        return this.text;
    }
}