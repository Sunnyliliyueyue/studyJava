package class03;

import java.util.Random;

/**
 * 获取10个0-100之间的随机数 存到数组中 还要确保他们是唯一的*/
public class Arrpaixu {
    public static void main(String[] args) {
        Random random = new Random();
        int [] Arr = new int[10];
        for(int i=0; i< Arr.length; ){
            int Ran = random.nextInt(100) + 1;
            boolean count = false;
            for(int j=0; j< Arr.length; j++){
                if(Ran == Arr[j]){
                    count = true;
                    break;
                }
            }
            if (!count){
                Arr[i] = Ran;
                i++;
            }
        }
        for (int i=0; i< Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }


}
