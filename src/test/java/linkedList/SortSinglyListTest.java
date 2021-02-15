package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSinglyListTest {

    SortSinglyList sortSinglyList = new SortSinglyList();

    @Test
    void sortSinglyLinkedListTest1() {
        sortSinglyList.addFront(1);
        sortSinglyList.addFront(189);
        sortSinglyList.addFront(-12);
        sortSinglyList.addFront(54);
        sortSinglyList.addFront(213);
        sortSinglyList.addFront(-213);
        sortSinglyList.addFront(11);
        sortSinglyList.addFront(229);
        sortSinglyList.addFront(0);
        sortSinglyList.addFront(0);
        sortSinglyList.addFront(1);
        sortSinglyList.addFront(127);
        SortSinglyList actual = sortSinglyList.sortSinglyLinkedList(sortSinglyList);
        String expected = "[ -213 -12 0 0 1 1 11 54 127 189 213 229 ]";
        assertEquals(expected, actual.toString());
    }

    @Test
    void sortSinglyLinkedListTest2() {
        sortSinglyList.addFront(78);
        sortSinglyList.addFront(99);
        sortSinglyList.addFront(-67);
        sortSinglyList.addFront(574);
        sortSinglyList.addFront(0);
        sortSinglyList.addFront(-13);
        sortSinglyList.addFront(101);
        sortSinglyList.addFront(29);
        SortSinglyList actual = sortSinglyList.sortSinglyLinkedList(sortSinglyList);
        String expected = "[ -67 -13 0 29 78 99 101 574 ]";
        assertEquals(expected, actual.toString());
    }

    @Test
    void sortSinglyLinkedListTest3() {
        sortSinglyList.addFront(-13);
        SortSinglyList actual = sortSinglyList.sortSinglyLinkedList(sortSinglyList);
        String expected = "[ -13 ]";
        assertEquals(expected, actual.toString());
    }


}