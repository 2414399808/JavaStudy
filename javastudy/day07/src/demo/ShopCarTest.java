package demo;

import java.util.Scanner;

public class ShopCarTest {

    public static void main(String[] args) {
        //1 定义商品类 用于后期创建商品对象
        //2 定义购物车对象 使用一个数组对象表示
        Goods[] shopCar=new Goods[100];
        //3 搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算商品购买金额：pay");
            Scanner sc=new Scanner(System.in);
            System.out.println("请你输入命令");
            String command= sc.next();
            switch(command){
                case("add"):
                    addGoods(shopCar,sc);
                    break;
                case("query"):
                    queryGoods(shopCar);
                    break;
                case("update"):
                    updateGoods(shopCar,sc);
                    break;
                case("pay"):
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("命令错误");
            }
        }
    }

    public static void payGoods(Goods[] shopCar) {
        double money=0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if(g!=null){
                money+=(g.buyNumber*g.price);
            }else{
                break;
            }

        }
        System.out.println("定单总金额："+money);
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        while (true) {
            System.out.println("请您输入要修改的商品的id");
            int id=sc.nextInt();
            Goods goodsById = getGoodsById(shopCar, id);
            if(goodsById==null){
                System.out.println("没有该商品");
            }
            else
            {
                System.out.println("请您输入："+goodsById.name+"商品最新购买数量");
                int buynumber=sc.nextInt();
                goodsById.buyNumber=buynumber;
                System.out.println("修改成功");
                queryGoods(shopCar);
                break;
            }
        }
    }
    public static Goods getGoodsById(Goods[] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if(g!=null){
                if(g.id==id){
                    return g;
                }
            }else
                return null;

        }
        return null;
    }
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=========查询购物车信息如下==========");
        System.out.println("编号  名称  价格  购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]!=null){
                System.out.print(shopCar[i].id+"  ");
                System.out.print(shopCar[i].name+"  ");
                System.out.print(shopCar[i].price+"  ");
                System.out.print(shopCar[i].buyNumber+"  ");
                System.out.println();
            }
            else{
                break;
            }

        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {

        Goods good =new Goods();
        System.out.println("请输入商品id");
        good.id=sc.nextInt();
        System.out.println("请输入商品名称");
        good.name=sc.next();
        System.out.println("请输入商品数量");
        good.buyNumber=sc.nextInt();
        System.out.println("请输入商品价格");
        good.price=sc.nextDouble();
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]==null) {
                shopCar[i] = good;
                break;
            }
        }
        System.out.println("您的商品："+good.name+"添加到购物车成功！");

    }
}
