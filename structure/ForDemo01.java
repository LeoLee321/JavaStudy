package structure;

public class ForDemo01 {
    public static void main(String[] args) {
        //计算100以内奇数的和，偶数的和
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 100; i++) {
            if (i%2 != 0){
                evenSum+= i;
            }else {
                oddSum+= i;
            }
        }
        System.out.println("奇数的和： " + evenSum);
        System.out.println("偶数的和： " + oddSum);
    }
}
