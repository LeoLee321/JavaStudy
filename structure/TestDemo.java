package structure;

public class TestDemo {
    public static void main(String[] args) {
        //��ӡ������ 5��
        for (int i = 1; i <= 5;i++){
             for (int j = 5; j >= i;j--){
                System.out.print(" ");
            }


            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }

            for (int j = 1; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
