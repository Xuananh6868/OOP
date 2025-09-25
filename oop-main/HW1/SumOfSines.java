public class SumOfSines {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double radian = Math.toRadians(x);
        double sum = Math.sin(2*radian)+Math.sin(3*radian);
        System.out.println(sum);
    }
}
