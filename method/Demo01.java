package method;

public class Demo01 {
    //main����
    public static void main(String[] args) {
        int sum = add(2,5);
        System.out.println(sum);
        test();
    }

    //�ӷ�
    public static int add(int a,int b){
        return a+b;
    }

    public static void test(){
        for (int i = 0; i <= 1000;i++){
            if (i%5 == 0){
                System.out.print(i + "\t");
            }
            if (i%(5*3) == 0){
                System.out.println();
                //System.out.print("\n");
            }
        }
    }
}
