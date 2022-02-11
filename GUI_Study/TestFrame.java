package GUI_Study;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {

        //Frame
        Frame frame = new Frame("My first java window");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色   Color 看源码
        //new Color()
        frame.setBackground(new Color(34, 205, 199));

        //弹出的初始位置
        frame.setLocation(200,200);

        //设置窗口大小固定不能变
        frame.setResizable(false);


    }
}
