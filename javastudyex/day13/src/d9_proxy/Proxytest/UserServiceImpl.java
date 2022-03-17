package d9_proxy.Proxytest;

public class UserServiceImpl implements UserService{

    @Override
    public String login(String loginName, String passWord) {
        try {
            Thread.sleep(2000);
        if("admin".equals(loginName)&&"1234".equals(passWord)){
            return "success";
        }
        return "用户名或密码错误";
        } catch (InterruptedException e) {
            return "error";
        }
    }

    @Override
    public void selectUsers() {

        try {
            Thread.sleep(1000);
            System.out.println("查询了100个用户");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean delUsers() {
        try {
            Thread.sleep(500);
            System.out.println("删除了50个用户");
            return true;
        } catch (InterruptedException e) {
           return false;
    }
}}
