package net.cheneystudio.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create on 2019-07-26 14:59
 *
 * @author Cheney Wong
 */
public class AddOrRemoveInLoop {
    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String THREE = "3";
    private static final String FOUR = "4";

    void methodList() {
        List<String> list = new ArrayList<>();
        list.add(ONE);
        list.add(TWO);
        list.add(THREE);
        for (String item : list) {
            if (ONE.equals(item)) {
                list.remove(item);
            }
        }
        for (String item : list) {
            list.add(FOUR);
        }
        for (int i = 0; i < list.size(); i++) {
            if (ONE.equals(list.get(i))) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.add(FOUR);
        }
    }

    void methodMap() {
        Map<String, String> map = new HashMap<>();
        map.put(ONE, ONE);
        map.put(TWO, TWO);
        map.put(THREE, THREE);
        for (String key : map.keySet()) {
            if (ONE.equals(map.get(key))) {
                map.remove(key);
            }
        }
        for (String key : map.keySet()) {
            map.put(FOUR, FOUR);
        }
    }
}
