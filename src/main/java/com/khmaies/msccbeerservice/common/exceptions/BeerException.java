package com.khmaies.msccbeerservice.common.exceptions;

import com.khmaies.msccbeerservice.common.errors.ErrorFactory;
import com.khmaies.msccbeerservice.common.errors.Errors;

import java.util.Objects;

public class BeerException extends RuntimeException {

    private final Errors errors;

    public BeerException(Errors errors) {
        super(errors.getMessage());
        this.errors = assignErrors(errors);
    }

    public BeerException(Exception ex, Errors errors){
        super(ex);
        this.errors = assignErrors(errors);
    }

    private Errors assignErrors(Errors errors){
        return Objects.isNull(errors) ? ErrorFactory.createGenericError() : errors;
    }

    public Errors getErrors() {
        return errors;
    }
}

