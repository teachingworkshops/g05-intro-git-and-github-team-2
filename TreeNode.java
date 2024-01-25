public class TreeNode {
    private List<TreeNode> adjacent;
    private String text;

    public TreeNode(String text) {
        this.text = text;
        this.children = new ArrayList<>();
    }

    public void addAdjacent(TreeNode node) {
        adjacent.add(node);
        node.adjacent.add(this);
    }

    public String getText(){
        return this.text;
    }

    public List<TreeNode> getChildren(){
        return this.children;
    }
}