package class04;

public class Method02 {
    public static void main() {
        // [1, 2, 3, 4, 5]
        int[] arr = {1,2,3,4,5};
        numberList(arr);
    }
    public static void numberList(int [] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(']');
    }
}
