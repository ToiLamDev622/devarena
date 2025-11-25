package dev.arena.common.validation;

import dev.arena.common.validation.validator.EmailValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EmailValid {
    String message() default "Invalid Email";
    Class<?>[] groups() default {};
}
