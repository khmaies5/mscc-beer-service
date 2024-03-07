package com.khmaies.msccbeerservice.web.controller.validators;

import com.khmaies.msccbeerservice.common.errors.ErrorCodeAndMessages;
import com.khmaies.msccbeerservice.common.errors.TargetType;
import com.khmaies.msccbeerservice.common.validators.CommonDataValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BeerDataValidator extends CommonDataValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeerDataValidator.class);

    public void validateBeerId(TargetType targetType, UUID beerId){
        LOGGER.debug(">>>>> Beer id validation started <<<<<");
        if (!isValidUUID(beerId)){
            handleValidationFailure(targetType, ErrorCodeAndMessages.INVALID_ID_MESSAGE, ErrorCodeAndMessages.INVALID_ID_CODE);
        }
        LOGGER.debug(">>>>> Beer id validation ended <<<<<");
    }

}
