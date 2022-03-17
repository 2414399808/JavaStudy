package d5_static_codeblock;

import java.util.ArrayList;

public class StaticCodeTest3 {
    /*
    模拟初始化牌操作
    点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
         花色: "♠", "♥", "♣", "♦"
    1 准备一个容器 存储54 张牌对象 这个容器建议使用静态集合 静态集合只加载一次
     */
    static ArrayList<String> cards=new ArrayList<>();
    /*
    2 在游戏启动之前需要准备号54张牌放进去 使用静态代码块进行初始化
     */
    static{
        //3 加载54张牌。
        //4 准备四种花色 类型确定String 个数确定
        String[] colors={"♠", "♥", "♣", "♦"};
        //5 定义点数
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //6
        for (int i = 0; i < sizes.length; i++) {
            for (int i1 = 0; i1 < colors.length; i1++) {
                cards.add(colors[i1]+sizes[i]);

            }

        }
        cards.add("🃏");
        cards.add("小🃏");
        System.out.println(cards);
    }

    public static void main(String[] args) {

    }
}
