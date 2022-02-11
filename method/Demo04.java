package method;

public class Demo04 {
    public static void main(String[] args) {
        printMax(3,5,8.8,9,0,10.5);
        printMax(new double[]{2,5,7.7});
    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passes");
            return;
        }

        double result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
            System.out.println("The max value is " + result);

    }


}
