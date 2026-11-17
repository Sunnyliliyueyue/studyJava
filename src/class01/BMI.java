package class01;

import static java.lang.IO.print;

public class BMI {
    public static void main(String[] args){
        double height = 1.68;
        double weight = 59;
        double bmi = weight / ( height * height);

        double myWeight = bmi * ( height * height);
        print(bmi);
    }
}
