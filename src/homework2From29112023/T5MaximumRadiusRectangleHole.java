package homework2From29112023;

public class T5MaximumRadiusRectangleHole {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int r = 3;
        int MaximumRadiusRectangleHole = (int) Math.sqrt(Math.pow((a/2), 2) + Math.pow((b/2), 2));
        System.out.println(MaximumRadiusRectangleHole);
        boolean CircleCloseHole = r>=MaximumRadiusRectangleHole;
        System.out.println("CircleCloseHole:"+CircleCloseHole);
    }
}