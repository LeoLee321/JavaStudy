package Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据: ");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next(); //程序会等待用户输入完毕
            System.out.println("输出的内容为: " + str);

        }
        scanner.close();

    }
}
