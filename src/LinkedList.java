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



    public void addItem(T data) {
        Node<T> newNode = new Node<>(data, tail);

        head.setNext(newNode);
        head = newNode;
    }

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

    public Node<T> find(T dataToFind) {
        Node<T> firstIndex = tail.getNext();
        return findHelper(dataToFind, firstIndex);
    }

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
     * Old Method for showing the List of information
     */
    public void showList(){
        if (head == dummy) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Elements in list are: ");

        Node<T> indexedValue = tail.getNext();
        do {
            if (indexedValue == dummy) {
                break;
            }
            System.out.print(indexedValue.getData() + " ");
            indexedValue = indexedValue.getNext();

        } while (!Objects.equals(indexedValue, tail));
        System.out.println();

    }

    public String showListRecursive() {
        Node<T> startingIndex = tail;
        if (head == dummy) {
            return "List is empty";
        }
        return "Elements in list are: " + showListRecursiveHelper(startingIndex);
    }

    public String showListRecursiveHelper(Node<T> index) {
        if (index == dummy) {
            return showListRecursiveHelper(index.getNext());
        } else if (index.getNext() != tail){
            return  index.getData() + ", " + showListRecursiveHelper(index.getNext());
        } else {
            return String.valueOf(index.getData());
        }
    }

    public String showReverseList() {
        Node<T> startingIndex = tail;
        if (head == dummy) {
            return "List is empty";
        }
        return "Elements in list are: " + showReverseListHelper(startingIndex);
    }

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
