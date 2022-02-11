package Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //输入多个数字，求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果：
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0; //计算输入了多少个数字

        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m++;
            sum+= x;
            System.out.println("你输入了第" + m + "个数据,当前结果为" + sum);
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
    }
}
