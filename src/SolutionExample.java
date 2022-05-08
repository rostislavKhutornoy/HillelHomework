public class SolutionExample {

    public static double Solution(double a, double b, double c) {
        return Math.abs(a - b) / Math.pow(a + b, 3) - Math.sqrt(c);
    }

    public static void main(String[] args) {
        double result = SolutionExample.Solution(10, 2, 4);
        System.out.println(result);
    }

}
