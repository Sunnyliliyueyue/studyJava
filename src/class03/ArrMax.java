package class03;

public class ArrMax {
    public static void main(String[] args) {
        int[] Arr = {10,33,22,44,55};
        int Max = Arr[0];
        for(int i=0; i < Arr.length-1; i++){
            if(Arr[i]<Arr[i+1]){
                Max = Arr[i+1];
            }
        }
        System.out.println(Max);
    }
}
