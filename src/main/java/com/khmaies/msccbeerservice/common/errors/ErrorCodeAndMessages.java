package com.khmaies.msccbeerservice.common.errors;


public class ErrorCodeAndMessages {

    private ErrorCodeAndMessages() {
    }

    public static final String GENERIC_MESSAGE = "Error while executing request";

    public static final int GENERIC_CODE = 1000;

    public static final String INVALID_ID_MESSAGE = "Invalid beer id";

    public static final int INVALID_ID_CODE = 1001;

}