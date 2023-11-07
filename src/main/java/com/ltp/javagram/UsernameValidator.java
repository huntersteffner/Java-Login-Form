package com.ltp.javagram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<Username, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        java.util.regex.Pattern badCharacters = Pattern.compile("[$%#@^*]");

        Matcher hasBadCharacters = badCharacters.matcher(value);

        if(hasBadCharacters.find()) {
            return false;
        }

        return true;
    }
}
