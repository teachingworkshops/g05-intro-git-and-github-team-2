import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private List<TreeNode> adjacent;
    private String text;

    public TreeNode(String text) {
        this.text = text;
        this.adjacent = new ArrayList<>();
    }

    public void addAdjacent(TreeNode node) {
        adjacent.add(node);
        /*if (combat == false){
            node.adjacent.add(this);
        }*/
    }
    public void removeAdjacent(TreeNode node) {
        adjacent.remove(node);
     
    }
    public String getText(){
        return this.text;
    }

    public List<TreeNode> getChildren(){
        return this.adjacent;
    }
}