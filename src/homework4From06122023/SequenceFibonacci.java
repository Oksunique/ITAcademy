package homework4From06122023;

public class SequenceFibonacci {
    public static void main(String[] args) {
        int numberOfMembers = 12;

        int firstMember = 0;
        int secondMember = 1;

        System.out.println("The first " + numberOfMembers + " members of the Fibonacci sequence:");

                for (int i = 1; i <= numberOfMembers; i++) {
            System.out.print(firstMember + " ");

            int nextMember = firstMember + secondMember;
            firstMember = secondMember;
            secondMember = nextMember;
        }
    }

}
