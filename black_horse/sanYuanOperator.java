package black_horse;// a > b ? a : b


public class sanYuanOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 获取两个数据中的较大值
        int max = a > b ? a : b;
        System.out.println("max:" + max);

    }

}
