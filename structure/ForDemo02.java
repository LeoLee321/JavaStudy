package structure;

public class ForDemo02 {
    public static void main(String[] args) {
        // ��forѭ�����0-1000֮���ܱ�5��������������ÿ�����5��

        for (int i = 0; i <= 1000; i++){
            if(i%5 ==0){
                System.out.print(i + "\t");

            }
            if(i%25==0){
                    System.out.print("\n");
                }
            }
        }
    }

