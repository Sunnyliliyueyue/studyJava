package class03;

public class ArrWork {
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,7,9,8,6};
//        int target = 6;
//        boolean flag = false;
//        for(int i=0; i< nums.length; i++){
//            for (int j = i+1; j< nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    flag = true;
//                    System.out.println("索引是："+ i + " " + j);
//                    System.out.println("整数是："+ nums[i] + " " + nums[j]);
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
//    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int total = arr1.length +arr2.length;
        int [] arr3 = new int[total];

        for (int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        int num = arr1.length;
        for (int i= 0; i<arr2.length; i++){
            arr3[i + num] = arr2[i];
        }

        for (int i=0; i<arr3.length; i++){
            for (int j=i+1;j<arr3.length;j++){
                int c = 0;
                if(arr3[i] > arr3[j]){
                    c = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = c;
                }
            }
            System.out.println(arr3[i]);
        }
    }

}
