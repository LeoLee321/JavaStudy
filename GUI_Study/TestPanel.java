package GUI_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel ���Կ�����һ���ռ䣬���ǲ��ܵ�������
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //���ֵĸ���
        Panel panel = new Panel();
        //���ò���
        frame.setLayout(null);

        //����
        frame.setBounds(300,300,500,500);

        //panel�������꣬�����frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(139, 24, 24));

        frame.add(panel);
        frame.setVisible(true);

        //�����¼����������ڹر��¼�  System.exit(0)
        //������ģʽ :
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //��������
                System.exit(0);
            }
        });

    }
}
