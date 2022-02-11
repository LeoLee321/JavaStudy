import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GuessNumber {
    static int i=1;//��¼�����ִ���
    static int min = 0;
    static int max = 100;
    static int answer = new Random().nextInt(101);//0~100֮�������

    public GuessNumber() {
        JFrame f = new JFrame("������");
        f.setLayout(new BorderLayout());
        f.setLocation(300, 300);
        f.setSize(500, 300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea showarea = new JTextArea(2, 5);//����һ��JTextArea�ı���������ʾ����������Ϣ
        JScrollPane scrollPane = new JScrollPane(showarea);//����һ����������������JTextArea�ı�����Ϊ����ʾ���
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//��������������
        showarea.setEditable(false);//�ı�����Ϊ���ɱ༭
        JTextField inputField = new JTextField(10);//���������
        JButton btn = new JButton("����");
        //Ϊ��ť��Ӽ����¼�
        btn.addActionListener(e -> {
            String content = inputField.getText();
            String text = null;
            if(i>10)text="10�λ����Ѿ����꣬����ʧ�ܣ�";
            else if(i<=10){
                text = "��"+i+"�β�����"+judeNumber(content);i++;
            }else {
                text = "10�λ����Ѿ����꣬����ʧ�ܣ�";
            }
            showarea.append(text);
            inputField.setText("");//��������ÿ�
            if(i>10)showarea.append("10�λ����Ѿ����꣬����ʧ�ܣ�");
        });
        JPanel panel = new JPanel();//����һ�����
        JLabel lable = new JLabel("������");
        panel.add(lable);
        panel.add(inputField);
        panel.add(btn);//�Ѹ�������ӵ��������
        f.add(scrollPane, BorderLayout.CENTER);
        f.add(panel, BorderLayout.PAGE_END);
        f.setVisible(true);
    }
    public static String judeNumber(String txt) {
        int a = Integer.valueOf(txt);
        String t= null;
        if (a == answer) {
            return "�����ɹ�," +"����"+answer+"\n";
        } else if (a > answer) {
            max=a;
            return (a+"�´���,������"+min+"��"+a+"֮��\n");
        } else {
            min=a;
            return (a+"��С��,������"+a+"��"+max+"֮��\n");
        }
    }
}
class GuessNumer_Test {
    public static void main(String[] args) {new GuessNumber();}
}
