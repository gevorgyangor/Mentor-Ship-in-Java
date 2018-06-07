package patternTask;

public class PatternTest {


    public static void main(String[] args) {
        User userOne = User.InstanceFactory.getUser("Gor", "Gevorgyan");
        User userTwo = User.InstanceFactory.getUser("Gor", "Gevorgyan");

        if (userOne == userTwo) {
            System.out.println(" == ");
        } else {
            System.out.println(" != ");
        }

    }
}
