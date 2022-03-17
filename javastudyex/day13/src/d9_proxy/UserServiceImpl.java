package d9_proxy;

public class UserServiceImpl implements UserService {

    @Override
    public String login(String loginName, String passWord) {

        try {
            Thread.sleep(1000);
            if ("admin".equals(loginName) && "1234".equals(passWord)) {
                return "success";

            }
            return "登录名或密码错误";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "error";
        }
        }



    @Override
    public void selectUsers() {

        System.out.println("查询了100个用户");
        try {


            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public boolean deleUsers() {

        try {
            System.out.println("删除了100个用户");
            Thread.sleep(500);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
