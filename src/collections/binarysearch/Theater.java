package collections.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final List<Seat> list = new ArrayList<>();

    public Theater() {
        addAll();
    }

    public Seat binarySearch(int index) {
        Seat seat = new Seat(index, getSeatName(index));
        /*
          Seat必須實作Comparable<Seat>，否則會拋異常
          第一格是List
          第二格是Item
          第三格如果是null，使用自然排序
          */
        int searchSeat = Collections.binarySearch(list, seat, null);
        if (searchSeat >= 0) {
            return list.get(searchSeat);
        } else {
            return null;
        }
    }

    private void addAll() {
        for (int i = 0; i < 10; i++) {
            String name = getSeatName(i);
            Seat seat = new Seat(i, name);
            list.add(seat);
        }
    }

    private String getSeatName(int index) {
        char c = 'a';
        c = (char) (c + index);
        return String.format("%c:%d", c, index);
    }
}
