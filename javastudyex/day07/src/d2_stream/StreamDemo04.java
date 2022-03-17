package d2_stream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
public class StreamDemo04 {
    public static double allMoney ;
    public static double allMoney2 ; // 2个部门去掉最高工资，最低工资的总和
    public static double allMoney3;
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒",'男',30000 , 25000, null));
        one.add(new Employee("孙悟空",'男',25000 , 1000, "顶撞上司"));
        one.add(new Employee("沙僧",'男',20000 , 20000, null));
        one.add(new Employee("小白龙",'男',20000 , 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松",'男',15000 , 9000, null));
        two.add(new Employee("李逵",'男',20000 , 10000, null));
        two.add(new Employee("西门庆",'男',50000 , 100000, "被打"));
        two.add(new Employee("潘金莲",'女',3500 , 1000, "被打"));
        two.add(new Employee("武大郎",'女',20000 , 0, "下毒"));
        //筛选出两个部门工资最高的两个员工封装成最佳员工
        //xx.stream().max()//获取stream流中的最大值 返回值是一个option对象
        Optional<Employee> max = one.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getBonus() + o2.getSalary()));
        //xx.stream().max().get() //把流中的对象获取出来
        Topperformer topperformer1 = one.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getBonus() + o2.getSalary()))
                .map(employee -> new Topperformer(employee.getName(), employee.getBonus() + employee.getSalary())).get();
        Topperformer topperformer2 = two.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getBonus() + o2.getSalary()))
                .map(employee -> new Topperformer(employee.getName(), employee.getBonus() + employee.getSalary())).get();
        //2 统计两个部门去掉最高最低工资 然后求平均工资

        one.stream().sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getBonus() + o2.getSalary()))
                .skip(1).limit(one.size()-2).forEach(e->
                        //求出总和
                allMoney+=(e.getSalary()+e.getBonus())
                );
        System.out.println(allMoney/(one.size()-2));

        two.stream().sorted((o1,o2)-> Double.compare(o1.getSalary()+o1.getBonus(),o2.getBonus()+o2.getSalary()))
                .skip(1).limit(two.size()-2).forEach(
                        employee -> allMoney2+=employee.getBonus()+employee.getSalary()
                );
        System.out.println(allMoney2/(two.size()-2));

        Stream.concat(one.stream(),two.stream()).sorted((o1,o2)-> Double.compare(o1.getSalary()+o1.getBonus(),o2.getBonus()+o2.getSalary()))
                .skip(1).limit(one.size()+two.size()-2).forEach(employee -> allMoney3+=employee.getBonus()+employee.getSalary());
        BigDecimal a=BigDecimal.valueOf(allMoney3);
        BigDecimal b=BigDecimal.valueOf((one.size()+two.size()-2));
        System.out.println(a.divide(b,2,RoundingMode.HALF_UP));
    }


}
