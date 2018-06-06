package patternTask;

import java.util.List;

public class User {
    private String namel;
    private String surname;

    private User() {

    }

    private User(String namel, String surname) {
        this.namel = namel;
        this.surname = surname;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static class FactoryExample {
        private static List<User> list = PatternTest.list;

        public static User getInstanceFactory(User user) {
            for (User user1 : list) {
                if (user1.equals(user)) {
                    return user1;
                }
                return new User();
            }
            return null;
        }
    }
}
