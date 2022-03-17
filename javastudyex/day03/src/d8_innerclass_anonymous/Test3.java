package d8_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //1创建窗口
        JFrame win=new JFrame("登录界面");
        JPanel panel=new JPanel();
        //2 创建一个按钮对象
        JButton btn=new JButton("登录");
        //注意 讲解匿名内部类的使用
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"点我登录");
            }
        });
        //3 把按钮对象添加到窗口上展示
        win.add(panel);
        panel.add(btn);
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
