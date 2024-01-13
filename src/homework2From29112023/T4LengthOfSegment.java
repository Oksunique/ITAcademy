package homework2From29112023;

public class T4LengthOfSegment {
    public static void main(String[] args) {
        double x1 = 1.5;
        double x2 = 5.5;
        double y1 = 0.3;
        double y2 = 0.3;
        double LengthOfSegment= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(LengthOfSegment);
    }
}
