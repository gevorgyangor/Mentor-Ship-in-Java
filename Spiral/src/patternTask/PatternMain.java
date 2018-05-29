package patternTask;

import patternTask.model.User;

import java.util.*;

public class PatternMain {

    private static Scanner SCANNER = new Scanner(System.in);
    private static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        addUser();
    }

    private static void addUser() {
        System.out.println("Please input User Name,Surname,Age,Email,Password");
        String strUser = SCANNER.nextLine();
        String[] split = strUser.split(",");

        if (split.length != 5) {
            System.out.println("Please input correct User");
            addUser();
        } else {
            if (!isEmptyUser(split[3])) {
                User user = new User();
                user.setName(split[0]);
                user.setSurname(split[1]);
                user.setAge(Integer.parseInt(String.valueOf(split[2])));
                user.setEmail(split[3]);
                user.setPassword(split[4]);
                userList.add(user);
                System.out.println("Thank you for register User object");
                addUser();
            } else {
                System.out.println("Already user object");
                addUser();
            }
        }
    }

    private static boolean isEmptyUser(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
