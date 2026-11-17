package class05;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        // 0=>4 1=>3 2=>2
        if(arr.length == 0){
            System.out.println("[]");
            return;
        } else if (arr.length == 1) {
            System.out.println("[" + arr[0] +"]");
            return;
        }
        System.out.print("交换前：[");
        for (int i=0; i< arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i] +"]\n");
            }else {
                System.out.print(arr[i] + ",\t");
            }
        }

        swap(arr);
        System.out.print("交换后：[");
        for (int i=0; i< arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i] +"]");
            }else {
                System.out.print(arr[i] + ",\t");
            }
        }
    }
    public static void swap(int[] arr) {

        int inj = 0;
        for (int i=0; i<arr.length/2; i++){
            inj = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = inj;
        }
    }
    public static int [] change(int[] nums) {
        nums = new int[]{7, 8, 9};

        nums[1] = 200;

        return nums;
    }
}
