package GUI_Study;

import java.awt.*;

//GUI�ĵ�һ������
public class TestFrame {
    public static void main(String[] args) {

        //Frame
        Frame frame = new Frame("My first java window");

        //��Ҫ���ÿɼ���
        frame.setVisible(true);

        //���ô��ڴ�С
        frame.setSize(400,400);

        //���ñ�����ɫ   Color ��Դ��
        //new Color()
        frame.setBackground(new Color(34, 205, 199));

        //�����ĳ�ʼλ��
        frame.setLocation(200,200);

        //���ô��ڴ�С�̶����ܱ�
        frame.setResizable(false);


    }
}
