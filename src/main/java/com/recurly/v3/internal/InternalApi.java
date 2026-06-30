package com.recurly.v3.internal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a type or member as internal to the Recurly client library. Elements annotated with {@code
 * InternalApi} are not part of the public API: they may change incompatibly or be removed at any
 * time and must not be relied upon by consumers of this library.
 *
 * <p>The library's Java 8 baseline prevents the compiler from hiding cross-package internals (that
 * would require the Java Platform Module System), so this annotation documents intent that the
 * language cannot enforce and makes it discoverable to tooling.
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface InternalApi {}
