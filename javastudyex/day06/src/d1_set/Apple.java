package d1_set;

import java.util.Comparator;
import java.util.Objects;

public class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double price;
    private int weight;

    public Apple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public Apple() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.price, price) == 0 && weight == apple.weight && Objects.equals(name, apple.name) && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price, weight);
    }

    /**
 * 方式一 类自定义比较规则
 * o1.compareTo(o2)
 *比较规则
     * 如果第一个元素大于第二个元素 返回正整数
     * 如果第一个元素小于第二个元素 返回负整数
     * 如果相等 返回0 此时TreeSet集合会只保留一个元素 所以TreeSet不需要重写HashCode和equals方法
 */
    @Override
    public int compareTo(Apple o) {
//        return Double.compare(o.getPrice(),this.getPrice());
//        return this.getWeight()-o.getWeight();
        //如果不想出现一个数值相同就去掉该对象的情况可以用三目运算符改变返回值
        return this.getWeight()>=o.getWeight()?1:-1;

    }
}
