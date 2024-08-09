package com.georgejrdev.convert_files.auxiliar.validations.interfaces;

import java.util.List;
import com.georgejrdev.convert_files.auxiliar.processing.interfaces.Convert;

public interface ThreadValidation {
    void validList(List<Convert> listConverts) throws IllegalArgumentException;
}