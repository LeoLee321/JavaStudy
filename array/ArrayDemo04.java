package array;


import java.util.Arrays;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] a = {1,43,5,7,3,5,5,71,35};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));


    }

    public static int[] sort(int[] array) {
        //¡Ÿ ±±‰¡ø
        int temp = 0;


        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
                if (flag == false) {
                    break;
                }



        }
        return array;
    }
}
