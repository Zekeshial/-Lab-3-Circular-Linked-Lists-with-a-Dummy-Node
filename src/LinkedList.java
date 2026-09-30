import java.util.Objects;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private final Node<T> dummy = new Node<>(null);

    public LinkedList() {
        dummy.setNext(dummy);
        this.head = dummy;
        this.tail = dummy;

    }


    /**
     * Adds an item to the linked list
     * @param data the data of the item
     */
    public void addItem(T data) {
        Node<T> newNode = new Node<>(data, tail);

        head.setNext(newNode);
        head = newNode;
    }

    /**
     * Removes an item from the linked list
     * @param dataToDelete the data you wish to delete
     * @return if deleted true if not false
     */
    public boolean remove(T dataToDelete) {
        if (head == dummy){
            System.out.println("You can't delete nothing");
            return false;
        }
        Node<T> current = tail.getNext();
        Node<T> previous = tail;

        while (current.getNext() != tail) {
            if (current.getData() == dataToDelete && current != dummy) {
                    System.out.println("Found " + dataToDelete + " and it was deleted");
                    previous.setNext(current.getNext());
                    current = previous;
                    return true;
            }
            previous = current;
            current = current.getNext();

        }

        if (current == head && current.getData() == dataToDelete && current != dummy) {
            System.out.println("Found " + dataToDelete + " and it was deleted");
            tail.setNext(dummy);
            head = dummy;
            return true;
        }
        System.out.println("The object doesn't exist.");
        return false;
    }

    /**
     * Fines an item in the linked list
     * @param dataToFind the data you wish to find
     * @return the node of the item in the list
     */
    public Node<T> find(T dataToFind) {
        Node<T> firstIndex = tail.getNext();
        return findHelper(dataToFind, firstIndex);
    }

    /**
     * A helper function for the find method
     * @param dataToDelete data to find
     * @param indexedNode the indexed node for recursion
     * @return the indexed node if found, dummy if not found or list is empty, and the next data point in the list if it not the one you are looking for.
     */
    private Node<T> findHelper(T dataToDelete, Node<T> indexedNode) {
        if (dataToDelete == indexedNode.getData()) {
            return indexedNode;
        } else if (indexedNode == tail){
            return dummy;
        } else {
            return findHelper(dataToDelete, indexedNode.getNext());
        }
    }

    /**
     * Shows the data in the list as a string.
     * @return the list an as string or list is empty if there is nothing in the list.
     */
    public String showListRecursive() {
        Node<T> startingIndex = tail;
        if (head == dummy) {
            return "List is empty";
        }
        return "Elements in list are: " + showListRecursiveHelper(startingIndex);
    }

    /**
     * helper function to make the showlist work
     * @param index the Indexed node of the list
     * @return returns over each node and gives the value of the node.
     */
    private String showListRecursiveHelper(Node<T> index) {
        if (index == dummy) {
            return showListRecursiveHelper(index.getNext());
        } else if (index.getNext() != tail){
            return  index.getData() + ", " + showListRecursiveHelper(index.getNext());
        } else {
            return String.valueOf(index.getData());
        }
    }

    /**
     * Shows the list backwards
     * @return the list as a string backwards or tells you the list is empty if there is nothing in the list.
     */
    public String showReverseList() {
        Node<T> startingIndex = tail;
        if (head == dummy) {
            return "List is empty";
        }
        return "Elements in list are: " + showReverseListHelper(startingIndex);
    }

    /**
     * A helper function for the show reverse list method
     * @param index the indexed node of the list
     * @return the values of the list as a string backwards.
     */
    public String showReverseListHelper(Node<T> index) {
        if (index == dummy) {
            return showReverseListHelper(index.getNext());
        } else if (index.getNext() != tail){
            return showReverseListHelper(index.getNext()) + ", " + index.getData();
        } else {
            return String.valueOf(index.getData());
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
