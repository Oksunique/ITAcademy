package homework7From18122023;

public class MainFraction {
        public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 1);
        Fraction fraction2 = new Fraction(2, 2);


        Fraction sum = fraction1.add(fraction2);
        System.out.println("Sum: " + sum.toString());

        Fraction product = fraction1.multiply(4.0);
        System.out.println("Product: " + product.toString());

        Fraction quotient = fraction1.divide(2.0);
        System.out.println("Quotient: " + quotient.toString());
    }
}
