package GUI_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionTwo {
    public static void main(String[] args) {
        Frame frame = new Frame("��ʼ-ֹͣ");
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");

        //������ʾ�Ķ��崥���᷵�ص�����������ʾ���壬�����Ĭ�ϵ�ֵ
        //���Զ����ťֻдһ��������
        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);


        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        frame.setBounds(500,500,500,400);
        frame.setVisible(true);

        windowClose(frame); //�رմ���
    }

    //�رմ�����¼�
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
        //e.getActionCommand()��ð�ť����Ϣ
        System.out.println("��ť������ˣ�message => "+e.getActionCommand());

    }
}
