package edu.toronto.csc207;

import java.util.HashMap;
import java.util.Map;
// a map containing the users in the system
// What do we gain by defining this class and storing an instance of it
// in the LogInUseCase class, as opposed to just
// storing a Map<String, User> in the LogInUseCase class?
public class UserList {
    private final Map<String, User> users = new HashMap<>();

    public void add(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }
}
