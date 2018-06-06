package patternTask;


import java.util.ArrayList;
import java.util.List;

public class PatternTest {

    public static List<User> list = new ArrayList<>();

    public static void main(String[] args) {
        User user = User.FactoryExample.getInstanceFactory(new User("Gor","Gevorgyan"));

    }
}
