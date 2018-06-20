package patternTask;


import java.util.ArrayList;
import java.util.List;

interface I {
    Object m();
}

interface I2 {
    String m();
}

class C {

    public static String m(int a){return "";}

}

public class PatternTest {

    static {
        class A{}
        A a = new A();
    }

    public static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        C c = new C();
        c.m(2);
        User userOne = User.InstanceFactory.instanceFactory("Gor", "Gevorgyan");
        userList.add(userOne);

        User userTwo = User.InstanceFactory.instanceFactory("Gor", "Gevorgyan");
        userList.add(userTwo);

        for (User user : userList) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
    }
}
