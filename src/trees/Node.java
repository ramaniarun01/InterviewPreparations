package trees;

public class Node {
    
    public Node left;
    public Node right;
    public Object value;
    
    public Node(int value){
        this.value = value;
    }
    
    public Node (Object value){
        this.value = value;
    }
}
