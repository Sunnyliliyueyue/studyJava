package class03;

public class ArrPoint {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int slow = 0;
        int fast = 1;
        while (fast < arr.length){
            if(arr[slow] != arr[fast]){
                slow ++;
                arr[slow] = arr[fast];
            }
            fast ++;
        }
        for (int i=0; i<= slow; i++){
            System.out.println(arr[i]);
        }
    }
}
