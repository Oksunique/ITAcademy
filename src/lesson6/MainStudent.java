package lesson6;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Oksana",100,  8, "Grodno");

        student.setGrade(10);
        student.personInfo();
        System.out.println();
    }
}
