public class SumOfTwoDice {
    public static void main(String[] args) {
        int size = 6;
        int a = 1 + (int)(Math.random()*size);
        int b = 1 + (int)(Math.random()*size);
        System.out.print(a+b);
    }
}
