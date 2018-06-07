package patternTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }

    public static class InstanceFactory {
        static List<User> users = new ArrayList<>();

        public static User getUser(String name, String surname) {
            if (users.size() == 0) {
                User user = new User(name, surname);
                users.add(user);
                return user;
            }

            for (User user : users) {
                if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                    return user;
                }
            }

            User user = new User(name, surname);
            users.add(user);
            return user;
        }
    }
}
