package patternTask;

public class User {
    private String name;
    private String surname;

    private User() {

    }

    private User(String namel, String surname) {
        this.name = namel;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class InstanceFactory {
        public static User instanceFactory(String name, String surname) {
            for (User user : PatternTest.userList) {
                if (user.name.equals(name) && user.surname.equals(surname)) {
                    return user;
                }
            }
            return new User(name, surname);
        }
    }
}
