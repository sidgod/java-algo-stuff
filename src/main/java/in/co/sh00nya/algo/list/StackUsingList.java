package in.co.sh00nya.algo.list;

public class StackUsingList<T> {
	
    private Node<T> headNode;
    private int size = 0;
    
    public void push(T data) {
    
        if(headNode == null) {
            headNode = new Node<T>(data);
        } else {
            Node<T> newHead = new Node<T>(data);
            newHead.setNextNode(headNode);
            headNode = newHead;
        }
        size++;
    }
    
    public T pop() {
        if(headNode != null) {
        	T topData = headNode.getData();
            headNode = headNode.getNextNode();
            size--;
            return topData;
        }
        return null;
    }
    
    public int size() {
        return size;
    }

}

class Node<T> {
	private T data;
	private Node<T> nextNode;
    
    public Node(T data) {
        this.data = data;
    }
    
    public Node<T> getNextNode() {
        return nextNode;
    }
    
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    
    public T getData() {
        return data;
    }
    
    public String toString() {
        return "Node :: " + data;
    }
}