package patternTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class User {
    private String name;
    private String surname;


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

        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        return getSurname() != null ? getSurname().equals(user.getSurname()) : user.getSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class InstanceFactory {
        private static List<User> users = new ArrayList<>();

        public static User getUser(String name, String surname) {

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
