package Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //���������֣������ܺ���ƽ������ÿ����һ�������ûس�ȷ�ϣ�ͨ��������������������벢���ִ�н����
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0; //���������˶��ٸ�����

        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m++;
            sum+= x;
            System.out.println("�������˵�" + m + "������,��ǰ���Ϊ" + sum);
        }
        System.out.println(m + "�����ĺ�Ϊ" + sum);
        System.out.println(m + "������ƽ��ֵ��" + (sum / m));
    }
}
