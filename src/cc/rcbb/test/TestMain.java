package cc.rcbb.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TestMain {
    public static void main(String[] args) {
        int initialCapacity = 4;
        System.out.println(initialCapacity);
        System.out.println(initialCapacity >>> 1);
        System.out.println(initialCapacity + (initialCapacity >>> 1));
    }
}
