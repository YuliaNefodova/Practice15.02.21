import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    QuickSort quickSort = new QuickSort();

    @org.junit.jupiter.api.Test
    void quickSortTest() {

        assertArrayEquals(new int[]{-3, 0, 3, 4, 7, 7, 8, 10, 12},
                quickSort.quickSort(new int[] {8, 0, 4, 7, 3, 7, 10, 12, -3}, 0,8) ,
                "Sort Error");
        assertArrayEquals(new int[]{},
                quickSort.quickSort(new int[] {}, 0,0) ,
                "Sort Error");
        assertArrayEquals(new int[]{-3},
                quickSort.quickSort(new int[] {-3}, 1,1) ,
                "Sort Error");
    }

}