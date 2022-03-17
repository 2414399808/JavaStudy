package d9_proxy.Proxytest;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        UserService userService1= ProxyUtil.getProxy(new UserServiceImpl());
        UserService userService=new UserServiceImpl();
        System.out.println(userService1.delUsers());
        System.out.println(userService1.login("admin", "1234"));
        userService1.selectUsers();
    }
}
