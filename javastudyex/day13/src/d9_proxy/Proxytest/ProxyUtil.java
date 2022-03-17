package d9_proxy.Proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T> T getProxy(T obj) {
        return (T)Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long startTime =System.currentTimeMillis();
                Object invoke = method.invoke(obj, args);
                long endTime =System.currentTimeMillis();
                System.out.println((endTime-startTime)/1000.0);
                return invoke;
            }
        });
    }
}
