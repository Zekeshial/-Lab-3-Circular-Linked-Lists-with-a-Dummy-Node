public class LinkedList<T> {
    private Node<T> node;

    public LinkedList() {
        Node<T> dummy = new Node<>(null, dummy);
        this.node = dummy;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }


}
