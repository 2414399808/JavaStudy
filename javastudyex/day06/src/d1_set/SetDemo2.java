package d1_set;

public class SetDemo2 {
    public static void main(String[] args) {
        //目标 学会获取对象的哈希值 并确认 哈希值是通过把对象的地址值转换成int类型的数据得来的
        String name="zsh";
        //同一个对象的哈希值是一样的
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());
        //不同对象的哈希值不一样
        String name2="lwl";
        System.out.println(name2.hashCode());
        System.out.println(name2.hashCode());
    }
}
