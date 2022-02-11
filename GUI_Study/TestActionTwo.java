package GUI_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionTwo {
    public static void main(String[] args) {
        Frame frame = new Frame("开始-停止");
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");

        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值
        //可以多个按钮只写一个监听类
        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);


        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        frame.setBounds(500,500,500,400);
        frame.setVisible(true);

        windowClose(frame); //关闭窗体
    }

    //关闭窗体的事件
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand()获得按钮的信息
        System.out.println("按钮被点击了：message => "+e.getActionCommand());

    }
}
