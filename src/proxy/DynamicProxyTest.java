package proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        test1();
    }
    static void test1(){
        Integer a = 1;
        System.out.println(a.compareTo(2) >= 1);
    }
}
