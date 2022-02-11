package method;

public class Demo03 {
    public static void main(String[] args) {
        double max = max(3.2,5.5);
        System.out.println("max = " + max);
    }

    public static int max(int num1,int num2){
        int result = 0;
        if (num1 == num2){
            System.out.println("num1 = num2");
            return 0; //终止方法
        }else if (num1 > num2){
            result = num1;

        }else if (num1 < num2){
            result = num2;

        }
        return result;
    }

    public static double max(double num1,double num2){
        double result = 0;
        if (num1 == num2){
            System.out.println("num1 = num2");
            return 0; //终止方法
        }else if (num1 > num2){
            result = num1;

        }else if (num1 < num2){
            result = num2;

        }
        return result;
    }
}
