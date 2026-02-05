import java.util.ArrayList;

public class calculateClassAverage {
    public static double calculateClassAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }
    public static double calculateClassAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    public static double calculateClassAverage(ArrayList<Double> nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }
}
