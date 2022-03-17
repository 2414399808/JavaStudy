package d4_collection_test;

import java.util.*;

/**
 目标：斗地主游戏的案例开发。

 业务需求分析:
 斗地主的做牌, 洗牌, 发牌, 排序（拓展知识）, 看牌。
 业务: 总共有54张牌。
 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
 花色: "♠", "♥", "♣", "♦"
 大小王: "👲" , "🃏"
 点数分别要组合4种花色，大小王各一张。
 斗地主：发出51张牌，剩下3张作为底牌。

 功能：
 1.做牌。
 2.洗牌。
 3.定义3个玩家
 4.发牌。
 5.排序（拓展，了解，作业）
 6.看牌
 */
public class GameDemo {
     /*
     1 定义一个静态的集合存储54张牌对象
      */
    public static List<Card> allCards=new ArrayList<>();
    /*
    加载静态代码块
     */
    static{
        String[] color={"♠", "♥", "♣", "♦"};
        String[] size={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < 13; i++) {
            for (int j=0;j<4;j++){
                Card card=new Card(size[i],color[j],i);
                allCards.add(card);
            }

        }
       allCards.add(new Card("","👲",14));
       allCards.add(new Card("","🃏",13));
        System.out.println(allCards);

    }
    public static void main(String[] args) {
        Collections.shuffle(allCards);
        System.out.println(allCards);


        List<Card> a=new ArrayList<>();
        List<Card> b=new ArrayList<>();
        List<Card> c=new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            if(i%3==0)
            a.add(allCards.get(i));
            else if(i%3==1)
            b.add(allCards.get(i));
            else
            c.add(allCards.get(i));


        }
        List<Card> lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        sortCards(a);
        sortCards(b);
        sortCards(c);


        System.out.println("A"+a);
        System.out.println("B"+b);
        System.out.println("C"+c);
        System.out.println(lastThreeCards);


    }
    public  static void sortCards(List<Card> list){
        Collections.sort(list,(o1, o2)-> o1.getIndex()-o2.getIndex());
    }

}
