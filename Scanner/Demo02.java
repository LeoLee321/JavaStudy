package Scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //�Ӽ��̽�������
        int i = 0;
        float f = 0.0f;

        System.out.println("����������: ");

        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("��������: " + i);

        }else {
            System.out.println("����Ĳ����������ݣ�");
        }
        System.out.println("������С����");

        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("С�����ݣ�" + f);

        }else {
            System.out.println("����Ĳ���С�����ݣ�");
        }
        scanner.close();
    }
}
