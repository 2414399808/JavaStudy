package d9_proxy.Proxytest;

public interface UserService {
    String login(String loginName,String passWord);
    void selectUsers();
    boolean delUsers();
}
