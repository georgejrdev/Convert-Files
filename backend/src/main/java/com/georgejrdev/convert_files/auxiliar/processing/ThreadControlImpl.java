package com.georgejrdev.convert_files.auxiliar.processing;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import com.georgejrdev.convert_files.auxiliar.processing.interfaces.Convert;
import com.georgejrdev.convert_files.auxiliar.processing.interfaces.ThreadControl;
import com.georgejrdev.convert_files.auxiliar.validations.interfaces.ThreadValidation;


public class ThreadControlImpl implements ThreadControl{

    private List<Convert> listConverts;
    private ThreadValidation threadValidation;

    public ThreadControlImpl(List<Convert> listConverts, ThreadValidation threadValidation) {
        this.listConverts = listConverts;
        this.threadValidation = threadValidation;
    }   
    
    
    @Override
    public void runConversion() {
        threadValidation.validList(listConverts);

        ExecutorService executor = Executors.newFixedThreadPool(calculateThreadPoolSize());
        
        for (Convert convert : this.listConverts) {
            executor.submit(()->{
                convert.convertFile();
            });
        }

        executor.shutdown();
    }


    private int calculateThreadPoolSize() {
        int elements = listConverts.size();

        if (elements <= 10) {
            return elements;
        } 

        if (elements <= 20){
            return elements / 2;
        }

        return 1;
    }
}