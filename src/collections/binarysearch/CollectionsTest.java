package collections.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    /**
     * cloneAndShuffleArray: 實現Clone與Shuffle用法
     * maxWithMinWithSwap: 實現max與min與Swap用法
     * reverseWithSort: 實現reverse與自定義sort用法
     * */
    public static void main(String[] args) {
//        cloneAndShuffleArray();
//        maxWithMinWithSwap();
        reverseWithSort();
    }

    private static void reverseWithSort() {
        Theater theater = new Theater();
        //copy
        List<Seat> copyArray = new ArrayList<>(theater.list);
        printList(copyArray);
        //反向
        Collections.reverse(copyArray);
        System.out.println();
        printList(copyArray);
        //按照NUMBER_ORDER排序
        copyArray.sort(Theater.NUMBER_ORDER);
        System.out.println();
        printList(copyArray);
    }

    private static void maxWithMinWithSwap() {
        Theater theater = new Theater();
//        Collections.map
        Seat seatMax = Collections.max(theater.list);
        Seat seatMin = Collections.min(theater.list);
        System.out.println("seat Max: " + seatMax.getName() +
                " seat Min: " + seatMin.getName());

        printList(theater.list);
        System.out.println();
        for (int i = 0; i < theater.list.size(); i++) {
            for (int j = i; j < theater.list.size(); j++) {
                Collections.swap(theater.list, j, i);
            }
        }
        printList(theater.list);
    }

    private static void cloneAndShuffleArray() {
        Theater theater = new Theater();
        //copy
        List<Seat> cloneArray = new ArrayList<>(theater.list);
        Collections.shuffle(cloneArray);
        printList(cloneArray);
        System.out.println();
        printList(theater.list);
    }

    private static void printList(List<Seat> list) {
        for (Seat seat : list) {
            System.out.print(seat.getName() + " ");
        }
    }
}
