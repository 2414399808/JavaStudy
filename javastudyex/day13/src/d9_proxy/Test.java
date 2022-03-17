package d9_proxy;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        //1 把业务对象 直接做成一个代理对象返回 代理对象的类型也是 UserService
        UserService userService1=ProxyUtil.getProxy(new UserServiceImpl());
        UserService userService=new UserServiceImpl();
        System.out.println(userService1.login("admin", "1234"));
        System.out.println(userService1.deleUsers());
        userService1.selectUsers();

    }
}
