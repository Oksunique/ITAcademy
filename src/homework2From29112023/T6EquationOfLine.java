package homework2From29112023;

public class T6EquationOfLine {
    public static void main(String[] args) {
        double x1 = 8.0;
        double y1 = 4.0;;
        double x2 = 10.0;
        double y2 = 6.0;

        double slopeCalulation = (y2 - y1) / (x2 - x1);
        double freeTermEquationOfLine = y1 - slopeCalulation * x1;

        System.out.println("Equation of a line passing through two points:");
        System.out.println("y = " + slopeCalulation + "x + " + freeTermEquationOfLine);
        }
}
