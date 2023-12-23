package homework7From18122023;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
    }
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //использую метод toString для вывода дроби в текстовую строку
    public String toString() {
        return numerator + " / " + denominator;
    }

    //метод add добавляет (складывает) к текущей дроби дробь, переданную ему в параметре, и
    //возвращает дробь - результат сложения;
    public Fraction add(Fraction fraction) {
        int newDenominator = denominator * fraction.denominator;
        int newNumerator = (numerator * fraction.denominator) + (fraction.numerator * denominator);
        return new Fraction(newNumerator, newDenominator);
    }

    //метод multiply умножает (произведение) текущую дробь на число типа double, переданное ему
    //в параметре, и возвращает дробь - результат умножения;
    public Fraction multiply(double multiplyingNumber) {
        int newNumerator = (int) (numerator * multiplyingNumber);
        return new Fraction(newNumerator, denominator);
    }
    //метод divide делит (деление) текущую дробь на число типа double, переданное ему в
    //параметре, и возвращает дробь - результат деления.
    public Fraction divide(double dividingNumber) {
        int newDenominator = (int) (denominator * dividingNumber);
        return new Fraction(numerator, newDenominator);
    }
}


