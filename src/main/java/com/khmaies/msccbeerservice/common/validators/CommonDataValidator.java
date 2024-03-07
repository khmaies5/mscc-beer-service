package com.khmaies.msccbeerservice.common.validators;

import com.khmaies.msccbeerservice.common.errors.TargetType;
import com.khmaies.msccbeerservice.common.exceptions.InvalidDataException;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public abstract class CommonDataValidator {

    protected void handleValidationFailure(TargetType targetType, String message, int code){
        throw InvalidDataException.invalidDataException(targetType, message, code);
    }

    protected boolean isValidInteger(String val) {
        return StringUtils.isNumeric(val);
    }

    protected boolean isValidUUID(UUID id){
        return isValidString(String.valueOf(id));
    }

    protected boolean isValidString(String val) {
        return val != null && !val.isEmpty() && !val.equalsIgnoreCase("null");
    }

}
