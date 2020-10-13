package org.malintha.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLQueryResolver   {
    public User user(Long id, DataFetchingEnvironment environment) {
        System.out.println("user(Long id) called");
        return new User(id, "malintha", "mali.@ws");
    }

    public User userByName(String firstName) {
        System.out.println("user(String firstName) called");
        return new User(12345L, firstName, "mali.@ws");
    }
}
