package GUI_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel 可以看成是一个空间，但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);

        //panel设置坐标，相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(139, 24, 24));

        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件  System.exit(0)
        //适配器模式 :
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });

    }
}
