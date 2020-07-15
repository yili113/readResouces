package test.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author yiLi
 * @create 2020-07-15 9:31
 */
public class TestLinkedHashMap extends LinkedHashMap {
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > Capacity;
    }

    private static final int Capacity = 3;

    public TestLinkedHashMap() {
        super(Capacity, 0.75f, true);// true是按照LRU算法更新链表元素
    }

    public static void main(String[] args) {
        TestLinkedHashMap linkedHashMap = new TestLinkedHashMap();
        linkedHashMap.put(1, 1);
        linkedHashMap.put(2, 2);
        linkedHashMap.put(3,3);
        linkedHashMap.get(1);
        linkedHashMap.put(4,4);
        System.out.println(linkedHashMap.keySet());
    }
}
