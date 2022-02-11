package GUI_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//���׼�����
public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

//��������
class Calculator extends Frame{
    //����
    TextField num1,num2,num3;

    //����
    public void loadFrame(){

//    public Calculator(){
        //3���ı���
//        TextField num1 = new TextField(10);//�ַ���
//        TextField num2 = new TextField(10);//�ַ���
//        TextField num3 = new TextField(20);//�ַ���
        num1 = new TextField(10);//�ַ���
        num2 = new TextField(10);//�ַ���
        num3 = new TextField(20);//�ַ���

        //1����ť
        Button button = new Button("=");
        //button.addActionListener(new MyCalculatorListener(num1,num2,num3));
        button.addActionListener(new MyCalculatorListener(this));

        //1����ǩ
        Label label = new Label("+");

        //����
        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
    }
}

//��������
class MyCalculatorListener implements ActionListener{

    //��ȡ��������
    //private TextField num1,num2,num3;

    //��ȡ�������������,��һ�������������һ���ࣻ
    Calculator calculator = null;

//    public MyCalculatorListener(TextField num1, TextField num2, TextField num3) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//    }

    public MyCalculatorListener(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        //1.��ü����ͱ�����
//        int n1 = Integer.parseInt(num1.getText());
//        int n2 = Integer.parseInt(num2.getText());
//
//        //2.�����ֵ�ӷ������ŵ���������
//        num3.setText("" + (n1+n2));
//
//        //3.���ǰ������
//        num1.setText("");
//        num2.setText("");

        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num2.getText());
        calculator.num3.setText("" + (n1 + n2));
        calculator.num1.setText("");
        calculator.num2.setText("");

    }
}
