package lesson10;

public class Angel extends  NewYearToy {
    String color;
    int gradeSounding;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void shine() {

    }

    @Override
    public void sound() {
        System.out.println();

    }

    public int getGradeSounding() {
        return gradeSounding;
    }

    public void setGradeSounding(int gradeSounding) {
        this.gradeSounding = gradeSounding;
    }
}
