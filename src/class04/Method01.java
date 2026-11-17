package class04;

import java.util.Random;

public class Method01 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[10];
        for(int i=0; i<arr.length;){
            int numbers = random.nextInt(10) + 1;
            boolean flag = status(numbers, arr);
            if(!flag){
                arr[i] = numbers;
                i++;
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static boolean status(int num, int[] arr) {
        for(int i=0;i<arr.length; i++){
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
