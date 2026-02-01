package com.demo.auth;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserDatabase {

    // email -> User
    private static final Map<String, User> users = new ConcurrentHashMap<>();

    static {
        // optional default user for testing
        users.put("test@example.com", new User("Test User", "test@example.com", "1234"));
    }

    public static boolean isValidUser(String email, String password) {
        User user = users.get(email);
        return user != null && user.getPassword().equals(password);
    }

    public static boolean userExists(String email) {
        return users.containsKey(email);
    }

    public static boolean registerUser(String name, String email, String password) {
        if (users.containsKey(email)) {
            return false; // already exists
        }
        users.put(email, new User(name, email, password));
        return true;
    }

    // simple inner class
    private static class User {
        private final String name;
        private final String email;
        private final String password;

        User(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }
}
