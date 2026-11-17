package class05;

public class Method02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        changeArray(arr);
        System.out.print("main方法：[");
        for (int i=0; i< arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i] +"]");
            }else {
                System.out.print(arr[i] + ",\t");
            }
        }
    }
    public static void changeArray(int[] nums) {
        nums[0] = 100;
        nums[nums.length -1] = 500;
        System.out.print("方法内部：[");
        for (int i=0; i< nums.length; i++){
            if (i == nums.length -1){
                System.out.print(nums[i] +"]");
            }else {
                System.out.print(nums[i] + ",\t");
            }
        }
    }
}
