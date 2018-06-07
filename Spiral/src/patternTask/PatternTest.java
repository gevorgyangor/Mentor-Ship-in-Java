package patternTask;

import java.util.List;

public class PatternTest {


    public static void main(String[] args) {
        User userOne = User.InstanceFactory.getUser("Gor", "Gevorgyan");
        User userTwo = User.InstanceFactory.getUser("Gor", "Gevorgyan");

        if (userOne == userTwo) {
            System.out.println(" == ");
        } else {
            System.out.println(" != ");
        }

        User user = getUserByNameAndSurname("Valod", "Gevorgyan");
        if (user == null) {
            System.out.println("user not found");
        } else {
            System.out.println("Name = " + user.getName() + " " + "Surname = " + user.getSurname());
        }
    }

    private static User getUserByNameAndSurname(String name, String surname) {
        List<User> userList = User.InstanceFactory.users;
        for (User user : userList) {
            if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                return user;
            }
        }
        return null;
    }
}
