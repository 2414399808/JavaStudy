package run;

import bean.Business;
import bean.Customer;
import bean.Movie;
import bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.BiConsumer;

public class MovieSystem {
    public static final Scanner SYS_SC=new Scanner(System.in);
    /**
     * 定义数据容器
     * 1 存储很多用户 客户对象 商家对象
     * @param args
     */
    public static final List<User> ALL_USERS=new ArrayList<>();

    /**
     * 2 存储商家排片信息
     * @param args
     */
    public static final  Map<Business, List<Movie>> ALL_MOVIES=new HashMap<>();
    public static User loginuser=new User();
    public static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final Logger LOGGER= LoggerFactory.getLogger("MovieSystem.class");


    static{
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b , movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies3); // b2 = []
    }
    public static void main(String[] args) {
        //首页
       showMain();
    }

    private static void showMain() {

            System.out.println("=========================黑马电影首页=========================");
            System.out.println("1, 登录");
            System.out.println("2, 用户注册");
            System.out.println("3, 商家注册");
        while(true){
            System.out.println("请输入操作命令:");
            String command = SYS_SC.nextLine();
            switch(command){
                case "1":
                    //登录功能
                    login();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                default:
                    System.out.println("请输入合法命令!");


            }
        }
    }

    private static void login() {
        while (true) {
            System.out.println("请输入登录名称：");
            String loginName = SYS_SC.nextLine();
            System.out.println("请你输入登录密码:");
            String passWord = SYS_SC.nextLine();

            //1 根据用户名查询用户对象
            User userByLoginName = getUserByLoginName(loginName);
            //2判断用户对象是否存在 存在说明登录名称正确了
            if(userByLoginName==null){
                System.out.println("该用户不存在,请注册!");
            }else{
                //对比密码是否正确
                if(userByLoginName.getPassWord().equals(passWord)){
                    //登录成功
                    loginuser=userByLoginName;
                    LOGGER.info(userByLoginName.getUserName()+"登录成功！");
                    if(userByLoginName instanceof Business){
                        //进入商家页面
                        showBusinessMain();
                    }else{
                        //进入普通用户页面
                        showCustomerMain();
                    }
                    return;
                }else{
                    System.out.println("密码出错!");
                }

            }
        }

    }

    /**
     * 客户操作界面

     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginuser.getUserName()+(loginuser.getSex()=='男'?"先生":"女士")+"欢迎您进入系统");
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能

                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    System.out.println(loginuser.getUserName() +"请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 用户购票功能
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("=============用户购票功能=================");
        while (true) {
            System.out.println("请您输入需要买票的门店：");
            String shopName = SYS_SC.nextLine();
            // 1、查询是否存在该商家。
            Business business = getBusinessByShopName(shopName);
            if(business == null){
                System.out.println("对不起，没有该店铺！请确认");
            }else {
                // 2、此商家全部的排片
                List<Movie> movies = ALL_MOVIES.get(business);
                // 3、判断是否存在上映的电影
                if(movies.size() > 0) {
                    // 4、开始进行选片购买
                    while (true) {
                        System.out.println("请您输入需要购买电影名称：");
                        String movieName = SYS_SC.nextLine();
                        // 去当前商家下，查询该电影对象。
                        Movie movie = getMovieByBusinessAndMovieName(business, movieName);
                        if(movie != null){
                            // 开始购买
                            while (true) {
                                System.out.println("请您输入要购买的电影票数：");
                                String number = SYS_SC.nextLine();
                                int buyNumber = Integer.valueOf(number);
                                // 判断电影是否购票
                                if(movie.getNumber() >= buyNumber){
                                    // 可以购买了
                                    // 当前需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber))
                                            .doubleValue();
                                    if(loginuser.getMoney() >= money){
                                        // 终于可以买票了
                                        System.out.println("您成功购买了"+ movie.getName() + buyNumber +
                                                "张票！总金额是：" + money);
                                        // 更新自己的金额 更新商家的金额
                                        loginuser.setMoney(loginuser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setNumber(movie.getNumber() -  buyNumber);



                                        return;// 结束方法
                                    }else {
                                        // 钱不够！
                                        System.out.println("是否继续~~");
                                        System.out.println("是否继续买票？y/n");
                                        String command = SYS_SC.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的！");
                                                return;
                                        }
                                    }
                                }else {
                                    // 票数不够
                                    System.out.println("您当前最多可以购买：" + movie.getNumber());
                                    System.out.println("是否继续买票？y/n");
                                    String command = SYS_SC.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的！");
                                            return;
                                    }
                                }
                            }

                        }else {
                            System.out.println("电影名称有毛病~~");
                        }
                    }

                }else {
                    System.out.println("该电影院关门了~~~");
                    System.out.println("是否继续买票？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的！");
                            return;
                    }
                }
            }
        }
    }

    /**
     * 根据商家和电影名查找电影对象
     * @param userByShopName
     * @param movie
     * @return
     */
    private static Movie getMovieByBusinessAndMovieName(Business userByShopName, String movie) {
        List<Movie> movies = ALL_MOVIES.get(userByShopName);
        for (Movie movie1 : movies) {
            if(movie1.getName().contains(movie)){
                return movie1;
            }

        }
        return null;
    }


    /**
     * 根据商家名称找商家信息
     * @param shopname
     * @return
     */
    private static Business getBusinessByShopName(String shopname){
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if(business.getShopName().equals(shopname)){
                return business;
            }
        }
        return null;
    }
    /**
     * 展示全部商家的电影
     */
    private static void showAllMovies() {
        System.out.println("===============展示全部商家拍片信息=============");
        ALL_MOVIES.forEach((Business business, List<Movie> movies)-> {
            System.out.println(business.getShopName()+"\t\t地址:"+ business.getAddress() +"\t\t电话:"+ business.getPhone()   );
                System.out.println("\t\t\t"+"片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
                for (Movie movie : movies) {
                    System.out.println("\t\t\t"+movie.getName()+"\t\t\t"+movie.getActor()+"\t\t"+movie.getTime()
                            +"\t\t"+movie.getPrice()+"\t\t"+movie.getNumber()+"\t\t"+simpleDateFormat.format(movie.getStartTime()));


                }
        });
    }

    /**
     * 商家操作界面

     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginuser.getUserName()+(loginuser.getSex()=='男'?"先生":"女士")+"欢迎您进入系统");
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    delMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updataMovie();
                    break;
                case "5":
                    System.out.println(loginuser.getUserName() +"请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void updataMovie() {
        System.out.println("================修改电影=================");
        Business business= (Business) loginuser;
        List<Movie> movies = ALL_MOVIES.get(business);
        while (true) {
            if(movies.size()==0){
                System.out.println("当前没有电影可以修改");
                return;
            }
            System.out.println("请您输入先要修改的电影名称:");
            String delMovie = SYS_SC.nextLine();
            Movie movieByName = getMovieByName(delMovie);
            if(movieByName==null){
                System.out.println("没有上架该电影");
            }else{
                System.out.println("请您输入修改后的片名：");
                String name  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的主演：");
                String actor  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的时长：");
                String time  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的票价：");
                String price  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的票数：");
                String totalNumber  = SYS_SC.nextLine(); // 200\n
                try {
                    System.out.println("请您输入修改后的影片放映时间：");
                    String stime  = SYS_SC.nextLine();
                    movieByName.setName(name);
                    movieByName.setActor(actor);
                    movieByName.setTime(Double.valueOf(time));
                    movieByName.setPrice(Double.valueOf(price));
                    movieByName.setNumber(Integer.valueOf(totalNumber));
                    movieByName.setStartTime(simpleDateFormat.parse(stime));


                    System.out.println("您已经成功修改了：《"+movieByName.getName()+"》影片");

                } catch (ParseException e) {
                    e.printStackTrace();
                    LOGGER.error("时间解析出错");
                }
            }

            System.out.println("请问继续修改吗？N/Y");
            String s = SYS_SC.nextLine();
            switch (s){
                case "Y":

                    break;
                default:
                    System.out.println("好的");
                    return;
            }
        }
    }

    /**
     * 影片下架功能
     */
    private static void delMovie() {
        System.out.println("================下架电影=================");
        Business business= (Business) loginuser;
        List<Movie> movies = ALL_MOVIES.get(business);
        while (true) {
        if(movies.size()==0){
            System.out.println("当前没有电影可以下架");
            return;
        }
            System.out.println("请您输入先要下架的电影名称:");
            String delMovie = SYS_SC.nextLine();
            Movie movieByName = getMovieByName(delMovie);
            if(movieByName==null){
                System.out.println("没有上架该电影");
            }else{
                movies.remove(movieByName);
                System.out.println("下架成功");
            }
                System.out.println("请问继续下架吗？N/Y");
                String s = SYS_SC.nextLine();
                switch (s){
                    case "Y":

                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
        }
    }
    private static Movie getMovieByName(String name){
        Business business= (Business) loginuser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(name)){
                return movie;
            }

        }
        return null;
    }

    /**
     * 商家进行电影上架
     */
    private static void addMovie() {
        System.out.println("=====================上架电影=========================");
        Business business= (Business) loginuser;
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("请您输入新片名：");
        String name  = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor  = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time  = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price  = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber  = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
            System.out.println("请您输入影片放映时间：");
            String stime  = SYS_SC.nextLine();
                Movie movie=new Movie(name,actor,Double.valueOf(time),Double.valueOf(price),Integer.valueOf(totalNumber),simpleDateFormat.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《"+movie.getName()+"》影片");
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出错");
            }
        }
    }

    /**
     * 展示商家的详细信息
     */
    private static void showBusinessInfos() {
        //根据商家对象 作为map的键提取拍片信息
        System.out.println("=======================商家详情界面=========================");
        LOGGER.info(loginuser.getLoginName()+"商家正在看自己的详情");
        Business business=(Business) loginuser;
        System.out.println(business.getShopName()+"\t\t地址:"+ business.getAddress() +"\t\t电话:"+ business.getPhone()   );
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size()>0){
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName()+"\t\t\t"+movie.getActor()+"\t\t"+movie.getTime()
                        +"\t\t"+movie.getPrice()+"\t\t"+movie.getNumber()+"\t\t"+simpleDateFormat.format(movie.getStartTime()));


            }
        }else{
            System.out.println("你的店铺当前无片可播");
        }
    }

    private static User getUserByLoginName( String loginName) {
        for (User user : ALL_USERS) {
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null;

    }
}
