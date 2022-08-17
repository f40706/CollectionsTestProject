package collections.binarysearch;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMain {

    /**
     * testMap: 實現map的put、get、containsKey、replace、remove
     * keySet讀取key，values讀取value
     * 及LinkedHashMap與HashMap差異
     * testUnmodifiableMap: 實現map禁止修改的功能，一旦修改就會拋錯
     * testSafeMap: 實現Map封裝應用
     */
    public static void main(String[] args) {
//        testMap();
//        System.out.println(testUnmodifiableMap());
        testSafeMap();
    }

    private static void testSafeMap() {
        //進入SafeMap封裝前，可以修改，新增
        //進入後，會clone
        //由SafeMap讀取得map禁止修改
        //達到封裝的效果
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key0", "123");
        hashMap.put("key1", "234");
        SafeMap safeMap = new SafeMap(hashMap);
        Map<String, String> map = safeMap.getMap();
        map.put("key3", "123");
        System.out.println(map);
    }

    private static void testMap() {
        //LinkedHashMap: 按輸入排序
        //HashMap: 不會排序
        Map<String, String> map = new HashMap<>();
        map.put("data2", "234");
        map.put("data1", "123");
        map.put("data3", "345");
        map.put("data4", "456");
        map.put("data5", "567");
        map.put("data6", "678");
        System.out.println(map.get("data1"));
        if (map.containsKey("data2")) {
            System.out.println("OK");
        } else {
            System.out.println("Failed");
        }
        map.replace("data3", "3333333");
        map.remove("data5");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (String value : map.values()) {
            System.out.print(value + " ");
        }

    }

    @Contract(" -> new")
    private static @NotNull @Unmodifiable Map<String, String> testUnmodifiableMap() {
//        return Map.of("key0", "123",
//                "key1", "123");
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "345");
        return Collections.unmodifiableMap(map);
    }
}
