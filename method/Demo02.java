package method;

public class Demo02 {
    public static void main(String[] args) {
        int a = max(5,5);
        System.out.println(a);
    }


    public static int max(int num1,int num2){
        int result = 0;
        if (num1 == num2){
            System.out.println("num1 = num2");
            return 0; //ÖÕÖ¹·½·¨
        }else if (num1 > num2){
            result = num1;

        }else if (num1 < num2){
            result = num2;

        }
    return result;
    }

}
