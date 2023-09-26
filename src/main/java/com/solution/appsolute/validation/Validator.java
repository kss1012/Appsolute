package com.solution.appsolute.validation;

import org.springframework.validation.Errors;

public interface Validator {
    boolean supports(Class<?> clazz);
    void validate(Object target, Error error);
}
