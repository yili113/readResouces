package test.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yiLi
 * @create 2020-05-31 17:11
 */
public class Test {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<>();
        cMap.put("1", "1");
        cMap.put("2", "2");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8, (float) 0.75, 4);
        // 以上构造方法就是 每个Segment里面有2个HashEntry
    }
}
