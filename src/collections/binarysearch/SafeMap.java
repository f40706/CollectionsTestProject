package collections.binarysearch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SafeMap {
    private final Map<String, String> map;

    public SafeMap(Map<String, String> map) {
        if(map != null) {
            this.map = new HashMap<>(map);
        } else {
            this.map = new HashMap<>();
        }
    }

    public Map<String, String> getMap() {
        //禁止修改，否則拋異常
        return Collections.unmodifiableMap(map);
        //clone但依然可以修改
//        return new HashMap<>(map);
    }
}
