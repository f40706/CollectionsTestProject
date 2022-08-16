package collections.binarysearch;

import org.jetbrains.annotations.NotNull;

public class Seat implements Comparable<Seat> {
    int number;
    String name;

    public Seat(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Seat seat) {
        return getName().compareToIgnoreCase(seat.getName());
    }
}
