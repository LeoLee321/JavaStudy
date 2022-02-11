package GUI_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

//计算器类
class Calculator extends Frame{
    //属性
    TextField num1,num2,num3;

    //方法
    public void loadFrame(){

//    public Calculator(){
        //3个文本框
//        TextField num1 = new TextField(10);//字符数
//        TextField num2 = new TextField(10);//字符数
//        TextField num3 = new TextField(20);//字符数
        num1 = new TextField(10);//字符数
        num2 = new TextField(10);//字符数
        num3 = new TextField(20);//字符数

        //1个按钮
        Button button = new Button("=");
        //button.addActionListener(new MyCalculatorListener(num1,num2,num3));
        button.addActionListener(new MyCalculatorListener(this));

        //1个标签
        Label label = new Label("+");

        //布局
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

//监听器类
class MyCalculatorListener implements ActionListener{

    //获取三个变量
    //private TextField num1,num2,num3;

    //获取计算器这个对象,在一个类中组合另外一个类；
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
//        //1.获得加数和被加数
//        int n1 = Integer.parseInt(num1.getText());
//        int n2 = Integer.parseInt(num2.getText());
//
//        //2.将这个值加法运算后放到第三个框
//        num3.setText("" + (n1+n2));
//
//        //3.清楚前两个框
//        num1.setText("");
//        num2.setText("");

        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num2.getText());
        calculator.num3.setText("" + (n1 + n2));
        calculator.num1.setText("");
        calculator.num2.setText("");

    }
}
