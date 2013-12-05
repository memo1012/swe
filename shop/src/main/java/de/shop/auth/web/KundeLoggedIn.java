package de.shop.auth.web;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Qualifier
@Target({ PARAMETER, FIELD })
@Retention(RUNTIME)
public @interface KundeLoggedIn {
}

