package GUI_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTextField {
    public static void main(String[] args) {
        //������
        new MyFrame();
    }
}

class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);

        //��������ı������������
        MyActionListener2 myActionListener2 = new MyActionListener2();
        //����enter�ͻᴥ������������¼�
        textField.addActionListener(myActionListener2);

        //�����滻����
        textField.setEchoChar('*');

        setVisible(true);
        pack();
    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource(); //���һЩ��Դ,���ص�һ������
        System.out.println(field.getText()); //����������ı�
        field.setText(""); //��� null ""



    }
}
