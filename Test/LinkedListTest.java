import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addItem() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);



        Integer actual = list.getHead().getData();
        Integer expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void addItem2() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);



        Integer actual = list.getTail().getNext().getData();
        Integer expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void addItem4() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);

        Integer actual = list.getTail().getNext().getData();
        Integer expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void addItem3() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);



        Integer actual = list.getTail().getNext().getNext().getData();
        Integer expected = 3;
        assertEquals(expected, actual);
    }



    @Test
    void test() {


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

    @Test
    void showListRecursive() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);

        String expected = "Elements in list are: 5, 3, 2, 10";
        String actual = list.showListRecursive();

        assertEquals(expected, actual);
    }

    @Test
    void showListRecursive2() {
        LinkedList<Integer> list = new LinkedList<>();


        String expected = "List is empty";
        String actual = list.showListRecursive();

        assertEquals(expected, actual);
    }

    @Test
    void showReverseList() {

        LinkedList<Integer> list = new LinkedList<>();
        list.addItem(5);
        list.addItem(3);
        list.addItem(2);
        list.addItem(10);
        String expected = "Elements in list are: 10, 2, 3, 5";
        String actual = list.showReverseList();

        assertEquals(expected, actual);
    }

    @Test
    void showReverseList2() {

        LinkedList<Integer> list = new LinkedList<>();


        String expected = "List is empty";
        String actual = list.showReverseList();

        assertEquals(expected, actual);
    }
}