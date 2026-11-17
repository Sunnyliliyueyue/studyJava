package class03;
/**
 * 交叉数求和
 * [0,1,1,2,3,5,8,13,21]*/
public class for02 {
    public static void main(String[] args) {
        int[] numArr = new int[9];
        numArr[0] = 0;
        numArr[1] = 1;
        for ( int i = 0; i < numArr.length - 2; i++ ) {
            int cc = numArr[i] + numArr[i+1];
            numArr[i+2] = cc;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
