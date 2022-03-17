package d4_polymorphic_test;
/*
 目标 USB设备模拟
 1 定义USB接口 接入 拔出
 2 定义两个USB 的实现类 鼠标 键盘
 3 创建一个电脑对象 创建USB设备对象 安装启动
 */
public class Test {
    public static void main(String[] args) {
        USB u=new Mouse("zsh");
        USB u2=new KeyBoard("lwl");
       Computer computer=new Computer();
       computer.installUSB(u);

    }
}
