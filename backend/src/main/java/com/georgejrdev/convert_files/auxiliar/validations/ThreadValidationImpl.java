package com.georgejrdev.convert_files.auxiliar.validations;

import java.util.List;

import com.georgejrdev.convert_files.auxiliar.validations.interfaces.ThreadValidation;
import com.georgejrdev.convert_files.auxiliar.processing.interfaces.Convert;


public class ThreadValidationImpl implements ThreadValidation{
    
    public ThreadValidationImpl(){

    }

    @Override
    public void validList(List<Convert> listConverts) throws IllegalArgumentException {
        if (listConverts.size() == 0 || listConverts == null || listConverts.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
    }
}