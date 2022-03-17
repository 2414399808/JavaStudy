package d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
    需求 统计投票人数
 */
public class MapTest1 {
    public static void main(String[] args) {
        //1 把80个学生选择的数据拿进来
        String[] selects={"A","B","C","D"};
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[random.nextInt(selects.length)]);

        }
        System.out.println(sb);
        //2 定义map集合 存储结果
        Map<Character,Integer> maps=new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
//            maps.put(sb.charAt(i),maps.getOrDefault(sb.charAt(i),0)+1);
            if(maps.containsKey(sb.charAt(i))){
                maps.put(sb.charAt(i),maps.get(sb.charAt(i))+1);
            }
            else
                maps.put(sb.charAt(i),1);
        }
        System.out.println(maps);
    }
}
