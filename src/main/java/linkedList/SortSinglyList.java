package linkedList;
// task 4
public class SortSinglyList {

    public int data;
    public SortSinglyList next;
    public SortSinglyList head;
    public SortSinglyList tail;

    void addFront(int data)
    {
        SortSinglyList sortSinglyList = new SortSinglyList();
        sortSinglyList.data = data;
        if (head == null)
        {
            head = sortSinglyList;
            tail = sortSinglyList;
        } else {
            sortSinglyList.next = head;
            head = sortSinglyList;
        }
    }

    private void swap(SortSinglyList l1, SortSinglyList l2) {
        int n = l1.data;
        l1.data = l2.data;
        l2.data = n;
    }

    @Override
    public String toString() {
        SortSinglyList link = head;
        StringBuilder stringBuilder = new StringBuilder("[ " + link.data + " ");
        while ((link = link.next) != null) {
            stringBuilder.append(link.data + " ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public SortSinglyList sortSinglyLinkedList(SortSinglyList sortSinglyList) {//bs
        boolean flag = true;
        while (flag) {
            SortSinglyList link = head;
            flag = false;
            while (link != tail) {
                if (link.data > link.next.data) {
                    swap(link, link.next);
                    flag = true;
                }
                link = link.next;
            }
        }
        return sortSinglyList;
    }

}


