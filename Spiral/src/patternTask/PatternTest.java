package patternTask;

import patternTask.model.User;

public class PatternTest {

    public static void main(String[] args) {
        User user = User.InstanceFactory.getInstance();
        User user1 = User.InstanceFactory.getInstance();
        User user2 = User.InstanceFactory.getInstance();

    }
}
