package array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //��ӡȫ������������
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("=====================");
        //��������Ԫ�صĺ�
        int sum = 0;
        for (int i =0; i < array.length;i++){
            sum+= array[i];

        }
        System.out.println(sum);
        System.out.println("=====================");
        //�������Ԫ��
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }
}
