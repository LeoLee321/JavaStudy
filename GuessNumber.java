import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GuessNumber {
    static int i=1;//记录猜数字次数
    static int min = 0;
    static int max = 100;
    static int answer = new Random().nextInt(101);//0~100之间随机数

    public GuessNumber() {
        JFrame f = new JFrame("猜数字");
        f.setLayout(new BorderLayout());
        f.setLocation(300, 300);
        f.setSize(500, 300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea showarea = new JTextArea(2, 5);//设置一个JTextArea文本域，用来显示多行聊天信息
        JScrollPane scrollPane = new JScrollPane(showarea);//创建一个滚动面板组件，将JTextArea文本域作为其显示组件
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//设置面板滚动策略
        showarea.setEditable(false);//文本域设为不可编辑
        JTextField inputField = new JTextField(10);//设置输入框
        JButton btn = new JButton("发送");
        //为按钮添加监听事件
        btn.addActionListener(e -> {
            String content = inputField.getText();
            String text = null;
            if(i>10)text="10次机会已经用完，猜数失败！";
            else if(i<=10){
                text = "第"+i+"次猜数："+judeNumber(content);i++;
            }else {
                text = "10次机会已经用完，猜数失败！";
            }
            showarea.append(text);
            inputField.setText("");//将输入框置空
            if(i>10)showarea.append("10次机会已经用完，猜数失败！");
        });
        JPanel panel = new JPanel();//创建一个面板
        JLabel lable = new JLabel("猜数字");
        panel.add(lable);
        panel.add(inputField);
        panel.add(btn);//把各个组件加到面板里面
        f.add(scrollPane, BorderLayout.CENTER);
        f.add(panel, BorderLayout.PAGE_END);
        f.setVisible(true);
    }
    public static String judeNumber(String txt) {
        int a = Integer.valueOf(txt);
        String t= null;
        if (a == answer) {
            return "猜数成功," +"答案是"+answer+"\n";
        } else if (a > answer) {
            max=a;
            return (a+"猜大了,数字在"+min+"到"+a+"之间\n");
        } else {
            min=a;
            return (a+"猜小了,数字在"+a+"到"+max+"之间\n");
        }
    }
}
class GuessNumer_Test {
    public static void main(String[] args) {new GuessNumber();}
}
