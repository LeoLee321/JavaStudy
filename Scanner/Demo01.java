package Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("����������: ");

        //�ж��û���û�������ַ���
        if (scanner.hasNext()){
            //ʹ��next��ʽ����
            String str = scanner.next(); //�����ȴ��û��������
            System.out.println("���������Ϊ: " + str);

        }
        scanner.close();

    }
}
