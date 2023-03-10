/*
 * MIT License (https://github.com/atrvasa/exception-manager/blob/main/LICENSE)
 * Repository (https://github.com/atrvasa/exception-manager)
 */

package com.atrvasa.exception;

/**
 * This is a tool for initializing an exception.
 *
 *
 * @author Keykhosrow
 */
public abstract class AenahInitializer {

    public static <E extends Aenah> E init(E e, AenahDetail detail) {
        e.setDetail(detail);
        return e;
    }

    public static <E extends Aenah> E init(E e, Class<?> type, String function) {
        AenahDetail detail = new AenahDetail();
        detail.setFunction(function);
        detail.setClassName(type.getName());

        e.setDetail(detail);
        return e;
    }
}