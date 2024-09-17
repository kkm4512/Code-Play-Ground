package proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalProxyHandler implements InvocationHandler {
    Object target;

    public AnimalProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("::: BEFORE :::");

        if (method.getName().equals("eat")) {
            System.out.println("::: EAT 메서드 호출전 :::");
            result = method.invoke(target,args); // 메서드 호출
            System.out.println("::: EAT 메서드 호출후 :::");
        }
        if (method.getName().equals("drink")) {
            System.out.println("::: DRINK 메서드 호출전 :::");
            result = method.invoke(target,args); // 메서드 호출
            System.out.println("::: DRINK 메서드 호출후 :::");
        }
        System.out.println("::: AFTER :::");
        return result;
    }
}
