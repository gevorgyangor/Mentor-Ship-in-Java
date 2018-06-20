package patternTask;


import java.util.ArrayList;
import java.util.List;

public class PatternTest {

    public static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        User userOne = User.InstanceFactory.instanceFactory("Gor", "Gevorgyan");
        userList.add(userOne);

        User userTwo = User.InstanceFactory.instanceFactory("Gor", "Gevorgyan");
        userList.add(userTwo);

        for (User user : userList) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
    }
}
