package structure;

public class ForDemo01 {
    public static void main(String[] args) {
        //����100���������ĺͣ�ż���ĺ�
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 100; i++) {
            if (i%2 != 0){
                evenSum+= i;
            }else {
                oddSum+= i;
            }
        }
        System.out.println("�����ĺͣ� " + evenSum);
        System.out.println("ż���ĺͣ� " + oddSum);
    }
}
