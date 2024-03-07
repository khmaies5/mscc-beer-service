package com.khmaies.msccbeerservice.common.errors;

public class ErrorFactory {

    private ErrorFactory() {
    }

    public static Errors createGenericError() {
        return new Errors(TargetType.GENERIC_ERROR.name(), ErrorCodeAndMessages.GENERIC_CODE,
                ErrorCodeAndMessages.GENERIC_MESSAGE);
    }

    public static Errors createInvalidRequestError(TargetType targetType, String message, int code) {
        return new Errors(targetType.name(), code, message);
    }

}

