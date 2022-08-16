package collections.binarysearch;

public class BinarySearchMain {
    /**
     * binarySearchTest: 實現Collections的BinarySearch預設用法
     * */
    public static void main(String[] args) {
        binarySearchTest();
    }

    private static void binarySearchTest() {
        Theater theater = new Theater();
        Seat seat = theater.binarySearch(3);
        System.out.println(seat.getName());
    }
}
