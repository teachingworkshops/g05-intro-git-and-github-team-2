import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private List<TreeNode> children;
    private String text;

    public TreeNode(String text) {
        this.text = text;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public String getText(){
        return this.text;
    }

    public List<TreeNode> getChildren(){
        return this.children;
    }
}