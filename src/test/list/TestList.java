package test.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author yiLi
 * @create 2020-05-31 17:03
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(2);

        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        int[] ints = Arrays.copyOf(arr, 10);
        System.out.println(ints.length);
        System.out.println(Arrays.toString(ints));
    }
}
