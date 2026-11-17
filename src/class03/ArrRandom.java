package class03;

import java.util.Random;

public class ArrRandom {

    public static void main(String[] args) {
        Random random = new Random();

        int[] Arr = {11,22,33,44,55,66,77,88,99};

        for(int i=0; i< Arr.length; i++) {
            int ArrRandomIndex = random.nextInt(Arr.length);

            int a = Arr[i];

            a = Arr[i];
            Arr[i] = Arr[ArrRandomIndex];
            Arr[ArrRandomIndex] = a;
        }
        for (int i=0; i< Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }



}
