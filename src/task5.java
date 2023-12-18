public class task5 {
    public static void main(String[] args) {
        int num1=2;
        int num2=3;
        int result = summAndMultiply(num1, num2);
            System.out.println("Sum of numbers:" + result);
        }
    public static int summAndMultiply(int a, int b) {
        int sum = a+b;
        int product = a*b;
        int result = sum+product;
        return result;
    }
}
