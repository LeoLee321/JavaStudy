package GUI_Study;
//��װ
import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //չʾ�������
        MyFrame myFrame1 = new MyFrame(100,100,200,200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300,100,200,200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100,300,200,200, Color.red);
        MyFrame myFrame4 = new MyFrame(300,300,200,200, Color.MAGENTA);
    }

    static class MyFrame extends Frame{
        static int id = 0; //���ܴ��ڶ�����ڣ�������Ҫһ����������

        public MyFrame(int x,int y, int w, int h, Color color){
            super("Myframe+" + (++id));
            setBackground(color);
            setBounds(x,y,w,h);
            setVisible(true);

        }


    }


}