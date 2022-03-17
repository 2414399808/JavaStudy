package d1_junit;

import org.junit.*;

/*
测试类
 */
public class TestUserService {
    //修饰实例方法
    @Before
    public void before(){
        System.out.println("===before方法执行一次===");
    }

    @After
    public void after(){
        System.out.println("===after方法执行一次===");
    }
    //修饰静态方法
    @AfterClass
    public static void afterClass(){
        System.out.println("===afterClass方法执行一次===");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("===beforeClass方法执行一次===");
    }

    /*
    测试方法
     注意点
      1 必须是公开的无参数 无返回值的方法
      2 测试方法必须使用@Test注解标记
     */
    @Test
    public void testLoginName(){
        UserService userService=new UserService();
        String rs = userService.loginName("admin", "123456");

        // 进行预期结果的正确性测试 断言
        Assert.assertEquals("您的登录业务可能出现问题","登录成功",rs);
    }

    @Test
    public void testSelectName(){
        UserService userService=new UserService();
        userService.selectNames();
    }
}
