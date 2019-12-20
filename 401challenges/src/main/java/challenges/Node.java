package challenges;

public class Node {
    private String value;
    private Node nextNode;

    public Node(String val) {
        this.value=val;
        this.nextNode=null;
    }
    public Node(String val, Node addNode) {
        this.value=val;
        this.nextNode=addNode;
    }
    public void setNode(Node linkNode) {
        this.nextNode=linkNode;
    }
    public String getValue(){
        return value;
    }
    public Node getNext() {
        return nextNode;
    }
}
