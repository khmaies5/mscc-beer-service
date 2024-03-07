package com.khmaies.msccbeerservice.common.exceptions;

import com.khmaies.msccbeerservice.common.errors.ErrorFactory;
import com.khmaies.msccbeerservice.common.errors.Errors;
import com.khmaies.msccbeerservice.common.errors.TargetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidDataException extends BeerException {

    public static final Logger log = LoggerFactory.getLogger(InvalidDataException.class);

    public InvalidDataException(Exception ex, Errors errors) {
        super(ex, errors);
    }

    public static InvalidDataException invalidDataException(TargetType targetType, String message, int code) {
        log.error("Invalid data in request body/params");
        throw new InvalidDataException(new Exception("Invalid Request"),
                ErrorFactory.createInvalidRequestError(targetType, message, code));
    }

}
