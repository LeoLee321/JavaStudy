//package GUI_Study;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//public class TryGui {
//    public static void main(String[] args) {
//        new Score();
//
//    }
//
//}
//
//
//class Score extends Frame{
//    public Score() {
//        TextField num1 = new TextField(5);
//        TextField num2 = new TextField(20);
//
//        Button button = new Button("查看结果");
//        button.addActionListener(new MyScoreListener(num1,num2));
//        Label label = new Label("请输入分数(满分100):");
//
//        setLayout(null); //需要先设置布局
//        setBounds(1000,500,500,200);
//
//
//        add(label);
//        label.setBounds(50,50,120,30);
//        add(num1);
//        num1.setBounds(180,50,50,30);
//        add(button);
//        button.setBounds(250,50,100,30);
//        add(num2);
//        num2.setBounds(50,100,350,30);
//
//        setVisible(true);
//
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//    }
//}
//
////监听器类
//class MyScoreListener implements ActionListener{
//
//    private TextField num1,num2;
//
//    public MyScoreListener (TextField num1,TextField num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        float n1 = Float.parseFloat(num1.getText());
//
//        if (n1 >= 95 || n1 < 0){
//            num2.setText("sb不要乱输入分数撒");
//        } else if (n1 == 100) {
//            num2.setText("敢作弊，我信鸟你滴邪");
//        } else if (n1 >= 95 && n1 < 100){
//            num2.setText("选台电脑撒");
//        } else if (n1 >= 90 && n1 < 94){
//            num2.setText("选台电脑撒");
//        } else if (n1 >= 80 && n1 < 90){
//            num2.setText("选台电脑撒");
//        } else if (n1 >= 70 && n1 < 80){
//            num2.setText("选台电脑撒");
//        } else if (n1 < 70){
//            num2.setText("胖揍一顿");
//        }
//        num1.setText("");
//        //num2.setText("");
//
//    }
//}

/*
 尝试组合的方法
 */

package GUI_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TryGui {
    public static void main(String[] args) {
        new Score().loadFrame();

    }

}

class Score extends Frame{
    //属性
    TextField num1,num2;

    //方法
    public void loadFrame(){
        num1 = new TextField(5);
        num2 = new TextField(20);

        Button button = new Button("查看奖励");
        button.addActionListener(new MyScoreListener(this));
        Label label = new Label("请输入分数(满分100):");

        setLayout(null); //需要先设置布局
        setBounds(1000,500,500,200);


        add(label);
        label.setBounds(50,50,120,30);
        add(num1);
        num1.setBounds(180,50,50,30);
        add(button);
        button.setBounds(250,50,100,30);
        add(num2);
        num2.setBounds(50,100,350,30);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

//监听器类
class MyScoreListener implements ActionListener{

    Score score = null;

    public MyScoreListener (Score score){
        this.score = score;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float n1 = Float.parseFloat(score.num1.getText());

        if (n1 > 100 || n1 < 0){
            score.num2.setText("sb不要乱输入分数撒");
        } else if (n1 == 100) {
            score.num2.setText("敢作弊，我信鸟你滴邪");
        } else if (n1 >= 95 && n1 < 100){
            score.num2.setText("选台电脑撒");
        } else if (n1 >= 90 && n1 < 94){
            score.num2.setText("选部手机撒");
        } else if (n1 >= 80 && n1 < 90){
            score.num2.setText("选个鼠标撒");
        } else if (n1 >= 70 && n1 < 80){
            score.num2.setText("选本参考书撒");
        } else if (n1 < 70){
            score.num2.setText("胖揍一顿");
        }
        score.num1.setText("");
        //num2.setText("");

    }
}