package collections.binarysearch;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

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
        int searchSeat = Collections.binarySearch(list, seat, null);
        if(searchSeat >= 0) {
            return list.get(searchSeat);
        } else {
            return null;
        }
    }

    private void addAll() {
        for(int i=0;i<10;i++) {
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
