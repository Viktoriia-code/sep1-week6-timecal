public class TimeCal {
    public static void main(String[] args) {
        System.out.println("Time needs " + timeCalculator(100.0, 100.0) + " hours");
    }

    public static double timeCalculator(double x, double v) {
        return x/v;
    }
}
