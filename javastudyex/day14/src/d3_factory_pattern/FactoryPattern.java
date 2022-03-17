package d3_factory_pattern;

public class FactoryPattern {
    /**
     * 定义一个方法 创建对象返回
     */
    public static Computer createComputer(String info){
        switch (info){
            case "huawei":
                Computer c=new Huawei();
                c.setPrice(5999.0);
                c.setName("huawei pro 16");
                return c;
            case "mac":
                Computer c2=new Mac();
                c2.setName("MAcBook Pro");
                c2.setPrice(11999.0);
                return c2;
            default:
                return null;

        }
    }
}
