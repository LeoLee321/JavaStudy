package array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arrays = new int[]{1,2,3,4,5};
        printArray(arrays);
        System.out.println("");
        int[] reverse = reverse(arrays);
        //printArray(reverse);
        for(int array : reverse){
            System.out.print(array + " ");
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0,j = arrays.length - 1;i< arrays.length;i++,j--) {
            result[j] = arrays[i];
        }
            return result;
        }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0;i< arrays.length;i++){
            System.out.print(arrays[i] + " ");
        }
    }
}
