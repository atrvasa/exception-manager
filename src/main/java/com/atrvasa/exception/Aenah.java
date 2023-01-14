/*
 * MIT License (https://github.com/atrvasa/exception-manager/blob/main/LICENSE)
 * Repository (https://github.com/atrvasa/exception-manager)
 */

package com.atrvasa.exception;

/**
 * Throwable base object for exception.
 *
 * <p></p>
 *
 * @author Keykhosrow
 */
public class Aenah extends Exception {

    private AenahDetail detail;

    public AenahDetail getDetail() {
        return detail;
    }

    public void setDetail(AenahDetail detail) {
        this.detail = detail;
    }
}