package structure;

public class ForDemo02 {
    public static void main(String[] args) {
        // 用for循环输出0-1000之间能被5整除的数，并且每行输出5个

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

