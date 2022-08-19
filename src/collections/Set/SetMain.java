package collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    /**
     * testSet: 實現Set 相同資料被過濾
     * testSetHashCodeWithEqual: 利用HashCode和Equals過濾相同的指定資料
     * testSetAllAndRetain: 實現保留與過濾重複的數值以及containsAll使用
     * testComparable: 實現指定參數做compareTo比較
     * */
    public static void main(String[] args) {
//        testSet();
//        testSetHashCodeWithEqual();
//        testSetAllAndRetain();
        testComparable();
    }

    private static void testComparable() {
        Set<SetItem2> set = new HashSet<>();
        set.add(new SetItem2("123"));
        Set<SetItem2> set2 = new HashSet<>();
        set2.add(new SetItem2("123"));

        for(SetItem2 item: set) {
            for(SetItem2 item2: set2) {
                System.out.println(item.compareTo(item2));
            }
        }
    }

    private static void testSetAllAndRetain() {
        Set<String> set = new HashSet<>();
        for(int i=0;i<100;i++) {
            set.add(""+i);
        }
        Set<String> set2 = new HashSet<>();
        set2.add(""+2);
        set2.add(""+13);
        set2.addAll(set);
        //size == 100, 因為濾掉重複的數值
        System.out.println(set2.size());

        Set<String> set3 = new HashSet<>();
        set3.add(""+2);
        set3.add(""+13);
        set3.retainAll(set);
        //size == 2, 因為保留重複的數值
        System.out.println(set3.size());

        //set 有set3的全部
        if(set.containsAll(set3)) {
            System.out.println("set find all");
        }
        //set3 有set的全部
        if(set3.containsAll(set)) {
            System.out.println("set3 find all");
        }
    }

    //利用HashCode和Equals過濾相同的指定資料
    private static void testSetHashCodeWithEqual() {
        Set<SetItem2> set = new HashSet<>();
        set.add(new SetItem2("123"));
        System.out.println(set.hashCode());

        set.add(new SetItem2("123"));
        System.out.println(set.hashCode());

        for(SetItem2 item: set) {
            System.out.println("item: " + item.getTag());
        }
    }

    private static void testSet() {
        Set<SetItem> set = new HashSet<>();

        //因為是new所以不算是相同資料
        SetItem setItem = new SetItem("tag2");
        SetItem setItem2 = new SetItem("tag2");
        set.add(setItem);
        set.add(setItem2);
        for(SetItem item: set) {
            System.out.println("item: " + item.toString());
        }
        System.out.println();

        //Set會自動過濾掉相同的資料
        //123被過濾一個
        Set<String> setString2 = new HashSet<>();
        setString2.add("123");
        setString2.add("234");
        setString2.add("345");

        Set<String> setString = new HashSet<>();
        setString.add("123");
        setString.addAll(setString2);
        for(String item: setString) {
            System.out.println("item2: " + item);
        }
        /*
        輸出打印:
        item2: 123
        item2: 234
        item2: 345*/
    }
}
