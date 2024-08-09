package com.georgejrdev.convert_files.auxiliar.processing;

import org.springframework.web.multipart.MultipartFile;

import com.georgejrdev.convert_files.auxiliar.processing.interfaces.Convert;


public class ConvertImpl implements Convert{
    
    private MultipartFile video;
    
    public ConvertImpl(MultipartFile video) {
        this.video = video;
    }

    
    @Override
    public void convertFile(){

    }
}