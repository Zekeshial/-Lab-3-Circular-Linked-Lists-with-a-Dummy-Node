import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addItem() {
    }

    @Test
    void showList() {
    }

    @Test
    void test() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(4);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);

        list.showList();
        list.remove(4);
        list.showList();



        //        Node<T> current = head;
//        Node<T> previous = null;
//        while (!Objects.equals(current.getNext(), head)) {
//            if (current.getData() == dataToDelete) {
//                if (previous == null) {
//                    Node<T> last = head;
//                    while (!Objects.equals(last.getNext(), head)) {
//                        last = last.getNext();
//                    }
//                    head = current.getNext();
//                    last.getNext() = head;
//                    return;
//                } else {
//                    previous.getNext() = current.getNext();
//
//                    if (Objects.equals(current, tail)) {
//                        tail = previous;
//                    }
//                    return;
//                }
//            }
//            previous = current;
//            current = current.getNext();
//
//        }
//
//        if (Objects.equals(current, head) && current.getData() == dataToDelete) {
//            previous.getNext()= head;
//            tail = previous;
//        }

    }

    @Test
    void removeTest() {

        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(4);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);


        boolean actual = list.remove(4);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void removeTest2() {

        LinkedList<Integer> list = new LinkedList<>();
        boolean actual = list.remove(4);
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void removeTest3() {

        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(4);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);

        boolean actual = list.remove(11);
        boolean expected = false;
        assertEquals(expected, actual);


    }

    @Test
    void removeTest4() {

        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);


        boolean actual = list.remove(5);
        boolean expected = true;
        assertEquals(expected, actual);


    }

    @Test
    void findTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(4);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);


        Integer actual = list.find(4).getData();
        Integer expected = 4;
        assertEquals(expected, actual);

    }

    @Test
    void findTest2() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);


        Integer actual = list.find(4).getData();
        Integer expected = null;
        assertEquals(expected, actual);

    }

    @Test
    void findTest3() {
        LinkedList<Integer> list = new LinkedList<>();

        Integer actual = list.find(4).getData();
        Integer expected = null;
        assertEquals(expected, actual);

    }

    @Test
    void findTest4() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);


        Integer actual = list.find(10).getData();
        Integer expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void findTest5() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);


        Integer actual = list.find(5).getData();
        Integer expected = 5;
        assertEquals(expected, actual);

    }
}