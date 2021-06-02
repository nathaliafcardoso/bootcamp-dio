package com.project.Bootcamp.exceptions;

import com.project.Bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
