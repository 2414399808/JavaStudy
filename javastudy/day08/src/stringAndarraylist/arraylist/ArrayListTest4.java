package stringAndarraylist.arraylist;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);
        for (int i = scores.size()-1; i>=0; i--) {
            if(scores.get(i)<80)
            {
               scores.remove(i);
            }

        }
        System.out.println(scores);
    }

}
