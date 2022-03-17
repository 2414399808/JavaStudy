package d9_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
public static Object newProxyInstance(ClassLoader loader,
 Class<?>[] interfaces,
 InvocationHandler h)
 参数1 类加载器 负责加载代理加载对象到内存中使用
 参数二 获取被代理对象实现的全部接口
 参数三 代理的核心处理逻辑
 */
public class ProxyUtil {
    /**
     * 生成业务对象的代理对象
     * @param obj
     * @return
     */
    public static <T> T getProxy(T obj) {
        //返回一个代理对象
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //参数一 代理对象本身
                //参数二 正在被代理的方法
                //参数三 被代理方法传入的参数
                long startTimes = System.currentTimeMillis();
                Object result = method.invoke(obj, args);
                long engTime = System.currentTimeMillis();
                System.out.println(method.getName()+"方法" + (engTime - startTimes)/1000.0);
                //把业务功能方法执行的结果返回给调用者
                return result;
            }
        });
    }
}
