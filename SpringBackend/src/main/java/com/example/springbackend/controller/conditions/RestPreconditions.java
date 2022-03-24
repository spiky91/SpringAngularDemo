package com.example.springbackend.controller.conditions;
import com.example.springbackend.controller.httpExceptions.ResourceNotFoundException;
public class RestPreconditions {
    public static <T> T checkNotNull(T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
        return resource;
    }
}
