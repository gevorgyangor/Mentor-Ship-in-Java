package patternTask.model;

public class User {
    private static User instance = new User();

    private User() {
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public static class InstanceFactory {
        private static final User instance = new User();

        public static User getInstance() {
            return instance;
        }

    }
}
