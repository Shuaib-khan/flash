package com.anno;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Inherited
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface Author {
	String aname() default "som";
	int age() default 38;
}
