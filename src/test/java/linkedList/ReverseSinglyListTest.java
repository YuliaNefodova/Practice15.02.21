package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSinglyListTest {

    @Test
    void reverseListTest1() {
        Integer[] list = { 78, -3, -2, 0 };
        ReverseSinglyList<Integer> linkedList = new ReverseSinglyList<Integer>(list);
        linkedList.printList();
        linkedList.reverseList();
        linkedList.printList();
    }

    @Test
    void reverseListTest2() {
        Integer[] list = { 67, -234, 0, 0, 13, 77, -1 };
        ReverseSinglyList<Integer> linkedList = new ReverseSinglyList<Integer>(list);
        linkedList.printList();
        linkedList.reverseList();
        linkedList.printList();
    }

}
