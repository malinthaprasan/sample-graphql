package org.malintha.example.graphql;


public class User {
    Long id;
    String firstName;
    String email;

    public User(Long id, String firstName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
    }
}
